package robot.lt.com.test.http;


import retrofit.Callback;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * 作者：liutao on 2015-10-15 15:42
 * 邮箱：1137134920@qq.com
 */
public abstract  class BaseCallback<T> implements Callback<T> {
    @Override
    public void success(T t, Response response) {
        onSuccess(t);
        onEnd();
    }
    @Override
    public void failure(RetrofitError retrofitError) {
        onFail(retrofitError);
        onEnd();
    }
    public abstract void onSuccess(T t);
    public abstract void onFail(RetrofitError retrofitError);
    public abstract void onEnd();
}
