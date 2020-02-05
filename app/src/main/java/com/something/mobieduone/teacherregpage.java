package com.something.mobieduone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class teacherregpage extends AppCompatActivity {

    Button btnRegis;
    EditText edtuser,edtpass,edtemail,edtfname,edtlname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacherregpage);

        btnRegis = (Button) findViewById(R.id.btnreg);

        edtuser = (EditText) findViewById(R.id.txtuser);
        edtpass = (EditText) findViewById(R.id.txtpass);
        edtemail = (EditText) findViewById(R.id.txtemail);
        edtfname = (EditText) findViewById(R.id.txtfname);
        edtlname = (EditText) findViewById(R.id.txtlname);

        btnRegis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = edtuser.getText().toString();
                String pass = edtpass.getText().toString();
                String email = edtemail.getText().toString();
                String fname = edtfname.getText().toString();
                String lname = edtlname.getText().toString();
                String type = "reg";
                BackgroundTask backgroundTask = new BackgroundTask(getApplicationContext());
                backgroundTask.execute(type,user,pass,email,fname,lname);
            }
        });
    }
}
