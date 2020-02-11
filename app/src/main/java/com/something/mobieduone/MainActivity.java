package com.something.mobieduone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnSing, btnLog;
    EditText tuser, tpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSing = findViewById(R.id.btnsignup);
        btnLog = findViewById(R.id.btnlogin);

        btnSing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ChooseType.class);
                startActivity(intent);
            }
        });

        tuser = findViewById(R.id.tusername);
        tpass = findViewById(R.id.tpassword);

        btnLog.setOnClickListener(new View.OnClickListener() {

            String username = tuser.getText().toString();
            String password = tpass.getText().toString();
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this, Teach_home_page.class);
                startActivity(intent2);
            }
        });

    }
}
