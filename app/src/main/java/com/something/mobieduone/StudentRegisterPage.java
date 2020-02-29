package com.something.mobieduone;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.something.mobieduone.retrofit.RetrofitInstance;

import org.jetbrains.annotations.NotNull;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class StudentRegisterPage extends AppCompatActivity {

    Button btnRegis;
    EditText edtuser, edtpass, edtemail, edtfname, edtlname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studentregpage);

        btnRegis = findViewById(R.id.btnreg);

        edtuser = findViewById(R.id.txtuser);
        edtpass = findViewById(R.id.txtpass);
        edtemail = findViewById(R.id.txtemail);
        edtfname = findViewById(R.id.txtfname);
        edtlname = findViewById(R.id.txtlname);

        btnRegis.setOnClickListener(v -> {
            String user = edtuser.getText().toString();
            String pass = edtpass.getText().toString();
            String email = edtemail.getText().toString();
            String fname = edtfname.getText().toString();
            String lname = edtlname.getText().toString();
            String type = "reg";
            RetrofitInstance.getInstance().getRetrofit().register(user, pass, email, fname, lname, "2").enqueue(new Callback<ResponseBody>() {

                @Override
                public void onResponse(@NotNull Call<ResponseBody> call, @NotNull Response<ResponseBody> response) {
                    Log.d("TEST", "TEST");
                    Intent intent = new Intent(StudentRegisterPage.this, MainActivity.class);
                    startActivity(intent);
                    // TODO: Do when success
                }

                @Override
                public void onFailure(@NotNull Call<ResponseBody> call, @NotNull Throwable t) {
                    t.printStackTrace();
                    Log.d("TEST", "TEST ERROR");
                    // TODO: Do when fail
                }
            });
        });
    }
}
