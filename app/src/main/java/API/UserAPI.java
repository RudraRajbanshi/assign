package API;

import java.util.List;

import model.Items;
import model.LoginSignupResponse;
import model.Users;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface UserAPI {
    @POST("users")
    Call<Void> addHero(@Body Users users);

    @FormUrlEncoded
    @POST("login")
    Call<LoginSignupResponse> checkUser(@Field("username") String username, @Field("password") String password);

    @POST("items")
    Call<Void> addItem(@Body Items items);

    @GET("items")
    Call<List<Items>> getAllItems();
}
