package com.proba_mpp.zakazi_cas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class Student_Login extends AppCompatActivity {

    ImageView logo_bell, manu;
    Button btn_najavise, btn_register_slide, btn_najava_slide;
    EditText et_email, et_password;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        logo_bell = findViewById(R.id.id_bell);
        manu = findViewById(R.id.id_manu);

        btn_najavise = findViewById(R.id.id_najavise);
        btn_register_slide = findViewById(R.id.id_register);
        btn_najava_slide = findViewById(R.id.id_najava);

        et_email = findViewById(R.id.id_email_prof_text);
        et_password = findViewById(R.id.id_lozinka_prof_text);


        //NAZAD NA POCETNA STRANA  (Back to ManiActivity)
        logo_bell.setOnClickListener(l ->{
            Intent i = new Intent(Student_Login.this, MainActivity.class);
            startActivity(i);
        });

        //
        btn_register_slide.setOnClickListener(l ->{
            Intent i = new Intent(Student_Login.this, Student_Register.class);
            startActivity(i);
        });



    }
}