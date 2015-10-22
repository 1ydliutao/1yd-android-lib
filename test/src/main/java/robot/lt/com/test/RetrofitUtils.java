package robot.lt.com.test;

import android.content.Context;

import retrofit.RestAdapter;
import retrofit.client.OkClient;
import retrofit.converter.GsonConverter;

/**
 * Created by help on 2015-10-14.
 */
public class RetrofitUtils {
    public static String URL = "https://gyms-api.1yd.me/";
    private static RestAdapter singleton;
    public static <T> T createApi(Context context, Class<T> clazz) {
        if (singleton == null) {
            synchronized (RetrofitUtils.class) {
                if (singleton == null) {
                    RestAdapter.Builder builder = new RestAdapter.Builder();
                    builder.setEndpoint(URL);//设置远程地址
                    builder.setClient(new OkClient(OkHttpUtil.getInstance(context)));
                    builder.setLogLevel(Config.DEBUG ? RestAdapter.LogLevel.FULL : RestAdapter.LogLevel.NONE);
                    singleton = builder.build();
                }
            }
        }
        return singleton.create(clazz);
    }
}
