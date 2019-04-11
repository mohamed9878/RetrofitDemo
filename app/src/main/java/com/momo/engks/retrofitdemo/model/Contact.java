package com.momo.engks.retrofitdemo.model;

import com.google.gson.annotations.SerializedName;

public class Contact {

    @SerializedName("id")
    private String Name;

    @SerializedName("title")
    private String Email;


    public Contact() {

    }

    private String getName() {
        return Name;
    }

    private void setName(String name) {

        this.Name = name;
    }

    private String getEmail() {
        return Email;
    }

    private void setEmail(String email) {

        this.Email = email;
    }
}
