package com.puuga.testretrofit;

import retrofit.Call;
import retrofit.http.GET;

/**
 * Created by siwaweswongcharoen on 9/7/2015 AD.
 */
public interface APIService {

    @GET(Constant.API_LOCATION)
    Call<Location> loadLocation();

    @GET(Constant.API_CONTENT)
    Call<Content[]> loadContents();

    @GET(Constant.API_MESSAGE)
    Call<Message[]> loadMessages();
}
