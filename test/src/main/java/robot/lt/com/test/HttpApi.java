package robot.lt.com.test;

import retrofit.Callback;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.Path;

/**
 * Created by help on 2015-10-14.
 */
public interface HttpApi {
    @GET("/api/open/subgyms/{id}")
    void getData(@Path("id")String id,Callback<Bean>  s);
    @GET("/api/open/subgyms/2")
    void getData2(Callback<Bean>  s);
}
