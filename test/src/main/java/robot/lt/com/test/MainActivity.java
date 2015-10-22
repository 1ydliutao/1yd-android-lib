package robot.lt.com.test;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;


public class MainActivity extends BaseActivity {
    String tag = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    protected void initData() {
        api.getData("2",new ActivityCallback<Bean>(context) {
            @Override
            public void success(Bean bean, Response response) {
                Log.e(tag,bean.address);
            }
        });
        api.getData2(new ActivityCallback<Bean>(context) {
            @Override
            public void success(Bean bean, Response response) {

            }
        });
    }
    @Override
    protected void initView() {
    }

}
