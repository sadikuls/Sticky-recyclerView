package com.sadikul.sticky_recycler.Network;

import com.sadikul.sticky_recycler.Utils.Constants;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by ASUS on 27-Nov-17.
 */

public class NetworkClient {

    public static Retrofit getNetworkClient(){
        return new Retrofit.Builder()
                .baseUrl(Constants.baseUrl)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    public static ApiInterface getApiInterface(){
        return getNetworkClient().create(ApiInterface.class);
    }
}
