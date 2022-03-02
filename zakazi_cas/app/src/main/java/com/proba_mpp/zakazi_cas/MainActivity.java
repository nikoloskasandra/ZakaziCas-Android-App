package com.proba_mpp.zakazi_cas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    Button btn_student, btn_profesor, btn_pocetna;
    ImageView logo, title;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_student =findViewById(R.id.id_student);
        btn_profesor = findViewById(R.id.id_profesor);
        btn_pocetna = findViewById(R.id.id_pocetna);
        logo = findViewById(R.id.id_logo);
        title = findViewById(R.id.id_title);

        // when you click on student you go to Student_Login_Activity
        btn_student.setOnClickListener(l -> {
            Intent i = new Intent(MainActivity.this, Student_Login.class);
            startActivity(i);
        });
        btn_profesor.setOnClickListener(l -> {
            Intent i = new Intent(MainActivity.this, Professor_Login.class);
            startActivity(i);
        });



    }
}