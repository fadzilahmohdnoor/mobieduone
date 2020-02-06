package com.something.mobieduone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class StudentRegisterPage extends AppCompatActivity {
    EditText user,pass,email,fname,lname;
    Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_studentregpage);
    }
}
