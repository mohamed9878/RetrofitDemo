package com.momo.engks.retrofitdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import com.momo.engks.retrofitdemo.Interfaces.ApiInterface;
import com.momo.engks.retrofitdemo.model.Contact;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private ApiInterface apiInterface;

    private Contact contact;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textv);

        contact = new Contact();

        apiInterface = RetrofitInstance.getRetrofit().create(ApiInterface.class);

        Call<Contact> call = apiInterface.getContacts();

        call.enqueue(new Callback<Contact>() {
            @Override
            public void onResponse(Call<Contact> call, Response<Contact> response) {

                if (response.isSuccessful()) {


                    String name = response.body().toString();

                    textView.setText(name);



                } else
                    Toast.makeText(getApplicationContext(), "error on response", Toast.LENGTH_SHORT).show();


            }

            @Override
            public void onFailure(Call<Contact> call, Throwable t) {

                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });


    }
}
