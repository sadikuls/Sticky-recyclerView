package com.sadikul.sticky_recycler.Network;

import com.sadikul.sticky_recycler.Model.Leagues;
import com.sadikul.sticky_recycler.Utils.Constants;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

/**
 * Created by ASUS on 27-Nov-17.
 */

public interface ApiInterface {

    @GET(Constants.leagueList)
    Call<ArrayList<Leagues>> getLeagueList();
    //String numberonPerson,String hotelId,String user_id, String totalAmount, String numberOfhour, String token
}
