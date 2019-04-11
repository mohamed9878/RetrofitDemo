package com.momo.engks.retrofitdemo.Interfaces;


import com.momo.engks.retrofitdemo.model.Contact;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {

    @GET("typicode/demo/posts")
    Call<Contact> getContacts();

}
