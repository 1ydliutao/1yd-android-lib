package robot.lt.com.test;

import android.content.Context;

import com.squareup.okhttp.Cache;
import com.squareup.okhttp.OkHttpClient;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * Created by help on 2015-10-14.
 */
public class OkHttpUtil {

    private static OkHttpClient singleton;

    public static OkHttpClient getInstance(Context context) {
        if (singleton == null) {
            synchronized (OkHttpUtil.class) {
                if (singleton == null) {
                    File cacheDir = new File(context.getCacheDir(), Config.RESPONSE_CACHE);
                    singleton = new OkHttpClient();
                    try {
                        singleton.setCache(new Cache(cacheDir, Config.RESPONSE_CACHE_SIZE));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    singleton.setConnectTimeout(Config.HTTP_CONNECT_TIMEOUT, TimeUnit.MILLISECONDS);
                    singleton.setReadTimeout(Config.HTTP_READ_TIMEOUT, TimeUnit.MILLISECONDS);
                }
            }
        }
        return singleton;
    }
}
