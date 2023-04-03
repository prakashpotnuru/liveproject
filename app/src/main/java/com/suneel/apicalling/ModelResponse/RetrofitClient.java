package com.suneel.apicalling.ModelResponse;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {

    private static String BASE_URL="https://reqres.in/";
     private static RetrofitClient retrofitClient;
    private static Retrofit retrofit;
    private Api myApi;

     public RetrofitClient(){
         retrofit = new Retrofit.Builder()
                 .baseUrl(BASE_URL)
                 .addConverterFactory(GsonConverterFactory.create())
                 .build();
     }

     public static synchronized RetrofitClient getInstance(){
         if(retrofitClient==null){
             retrofitClient=new RetrofitClient();

         }
       return   retrofitClient;
     }
    public Api getMyApi() {
        return retrofit.create(Api.class);
    }
}
