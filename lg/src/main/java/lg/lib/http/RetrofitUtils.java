package lg.lib.http;

import android.content.Context;

import retrofit.RestAdapter;
import retrofit.client.OkClient;

/**
 * Created by help on 2015-10-14.
 */
public class RetrofitUtils {
    private static RestAdapter singleton;
    public static <T> T createApi(Context context, Class<T> clazz,String url) {
        if (singleton == null) {
            synchronized (RetrofitUtils.class) {
                if (singleton == null) {
                    RestAdapter.Builder builder = new RestAdapter.Builder();
                    builder.setEndpoint(url);//设置远程地址
                    builder.setClient(new OkClient(OkHttpUtil.getInstance(context)));
                    builder.setLogLevel(Config.DEBUG ? RestAdapter.LogLevel.FULL : RestAdapter.LogLevel.NONE);
                    singleton = builder.build();
                }
            }
        }
        return singleton.create(clazz);
    }
}
