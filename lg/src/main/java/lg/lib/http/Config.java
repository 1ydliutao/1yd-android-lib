package lg.lib.http;

/**
 * Created by help on 2015-10-14.
 */
public class Config {
    public static String RESPONSE_CACHE="retrofit_cache";//缓存文件名
    public static long RESPONSE_CACHE_SIZE=1024*1024*8;//缓存大小
    public static long HTTP_CONNECT_TIMEOUT=1000*6;
    public static long HTTP_READ_TIMEOUT=1000*6;
    public static boolean DEBUG=true;
}
