
package robot.lt.com.test;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import java.lang.ref.WeakReference;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by help on 2015-10-14.
 */
public abstract class BaseActivity extends Activity {
   public static  HttpApi api;
   BaseActivity context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        api = createApi(HttpApi.class);
        context=this;
        initView();
        initData();
    }
    protected abstract void initData();
    protected abstract void initView() ;
    public <T> T createApi(Class<T> cls) {
        return RetrofitUtils.createApi(this, cls);
    }
    public static abstract class ActivityCallback<T>
            implements Callback<T> {//软引用，缓存引用对象
        private final WeakReference<BaseActivity> mRef;
        public ActivityCallback(BaseActivity activity) {
            mRef = new WeakReference<BaseActivity>(activity);
        }
        public Activity getActivity() {
            return mRef.get();
        }
        @Override
        public void failure(RetrofitError error) {
            final BaseActivity activity = mRef.get();
            Response response = error.getResponse();
            if (response != null) {
                Toast.makeText(activity, "网络请求失败", Toast.LENGTH_SHORT).show();
                error.printStackTrace();
            }
        }
    }
}


