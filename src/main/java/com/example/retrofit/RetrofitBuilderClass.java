package com.example.retrofit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Header;

public class RetrofitBuilderClass {
    private static final String BASE_URL= "https://devpayment-sandbox.card91.io";

    static OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
    static Retrofit retrofit = new Retrofit.Builder().
            baseUrl(BASE_URL).
            addConverterFactory(GsonConverterFactory.create()).
            client(httpClient.build())
            .build();


    public RetrofitInterface createService(){
        RetrofitInterface retrofitClass = retrofit.create(RetrofitInterface.class);
        return retrofitClass;
    }
}
