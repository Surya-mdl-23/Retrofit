package com.example.retrofit;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface RetrofitInterface {
    @POST("/jcard/api/business")
    Call<CreateOrgLog> createOrg(@Body OrgInput input, @Header("Authorization") String credentials, @Header("content-Type") String contentType,
                                 @Header("version")String version, @Header("consumer-id") String consumerId,
                                 @Header("timestamp")String timeStamp, @Header("nonce")String nonce,
                                 @Header("hash")String hash, @Header("apiCallReferenceIdheader")String apiCallId);
}
