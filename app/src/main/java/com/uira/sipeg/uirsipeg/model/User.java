package com.uira.sipeg.uirsipeg.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by ari putra on 12/3/2016.
 */

public class User {

    @SerializedName("error")
    private int error;
    @SerializedName("nama")
    private String nama;
    @SerializedName("password")
    private String password;

    public User(){

    }

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
