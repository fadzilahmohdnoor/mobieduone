package com.something.mobieduone.retrofit;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface RetrofitService {
    @POST("register.php")
    @FormUrlEncoded
    Call<ResponseBody> register(@Field("username") String username,
                                @Field("password") String password,
                                @Field("email") String email,
                                @Field("firstName") String firstName,
                                @Field("lastName") String lastName,
                                @Field("level") String level);

    @FormUrlEncoded
    @POST("login.php")
    Call<ResponseBody> login(@Field("username") String uname,
                             @Field("password") String password);

}
