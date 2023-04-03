package com.suneel.apicalling.ModelResponse;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface Api {

    @FormUrlEncoded
    @Headers({"Content-Type:application/json"})
    @POST("api/users")
    Call<ClassRRes> register(
            @Field("name") String name,
            @Field("email") String email,
            @Field("password") String password

    );
}
