package com.example.retrofit;

import okhttp3.Credentials;
import retrofit2.Call;
import retrofit2.Response;

@org.springframework.stereotype.Service
public class Service {
    public void saveOrg(OrgInput input){
        RetrofitBuilderClass retrofitBuilderClass = new RetrofitBuilderClass();
        RetrofitInterface retorfitClass = retrofitBuilderClass.createService();
        Call<CreateOrgLog> call = retorfitClass.createOrg(input, Credentials.basic("admin","LjR0TC7Kcs@l"),"application/json","1.0","c400ded2-f9cc-11e4-accc-3c15c2cf79f2","1212332211222","121b1b1b","12b12b12","1234API_ID5678");
        try {
            Response<CreateOrgLog> response = call.execute();
            System.out.println("the result is " + response.body() + " , " + response.code() + " " + response.toString());
            System.out.println(response.body().getResponse().getBusiness_issuanceSideId() + " , " + response.body().getResponse().getBusiness_paymentSideId());
        }catch (Exception e){
            System.out.println("Exception occured");
            System.out.println("Exception is " + e);
        }
    }
}
