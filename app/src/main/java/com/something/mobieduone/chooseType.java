package com.something.mobieduone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class chooseType extends AppCompatActivity {

    Button btnteac, btnstu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_type);

        btnstu = findViewById(R.id.btnStudent);
        btnteac = findViewById(R.id.btnTeacher);

        btnteac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(chooseType.this, teacherregpage.class);
                startActivity(intent1);
            }
        });

        btnstu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(chooseType.this, studentregpage.class);
                startActivity(intent2);
            }
        });
    }
}
