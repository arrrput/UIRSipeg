package com.uira.sipeg.uirsipeg.rest;

import com.uira.sipeg.uirsipeg.model.User;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by ari putra on 12/3/2016.
 */

public interface ApiInterface {

    @POST("rest/json_sipeg.php")
    Call<User> getLogin(@Query("user") String user, @Query("pass") String pass);

}
