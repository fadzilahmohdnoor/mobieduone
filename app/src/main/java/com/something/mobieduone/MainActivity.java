package com.something.mobieduone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.something.mobieduone.retrofit.RetrofitInstance;
import com.something.mobieduone.retrofit.RetrofitService;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MainActivity extends AppCompatActivity {

    Button btnSing, btnLog;
    EditText tuser, tpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSing = findViewById(R.id.btnsignup);
        btnLog = findViewById(R.id.btnlogin);

        tuser = findViewById(R.id.tusername);
        tpass = findViewById(R.id.tpassword);

        btnSing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ChooseType.class);
                startActivity(intent);
            }
        });

  /*      btnLog.setOnClickListener(v -> {
            String usern = tuser.getText().toString();
            String passw = tpass.getText().toString();

            RetrofitInstance.getInstance().getRetrofit().login(usern,passw).enqueue(new Callback<ResponseBody>() {
                @Override
                public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                    if(usern.equals("teacher") && passw.equals("1234")) {
                        Intent intent2 = new Intent(MainActivity.this, TeacherHomePage.class);
                        startActivity(intent2);
                    } else {
                        Intent intent3 = new Intent(MainActivity.this, StudentHomePage.class);
                        startActivity(intent3);
                    }
                    //TODO: load from sharedPreferences
                }

                @Override
                public void onFailure(Call<ResponseBody> call, Throwable t) {
                    Log.e("error", "points not loaded");
                }
            });
        });*/
    }
}

