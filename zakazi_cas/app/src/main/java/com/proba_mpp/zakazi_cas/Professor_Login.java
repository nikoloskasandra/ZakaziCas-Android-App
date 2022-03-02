package com.proba_mpp.zakazi_cas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class Professor_Login extends AppCompatActivity {

    ImageView bell, manu;

    Button btn_najava_prof_slide, btn_register_prof_slide, btn_najavise_prof;

    EditText et_email_prof, et_password_prof;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_professor__login);

        //ImageView
        bell = findViewById(R.id.id_bell);
        manu = findViewById(R.id.id_manu);
        //Buttons
        btn_najava_prof_slide = findViewById(R.id.id_najava_prof_slide_reg);
        btn_register_prof_slide = findViewById(R.id.id_register_prof_slide_r);
        btn_najavise_prof = findViewById(R.id.id_najavise_prof);
        //EditText
        et_email_prof =findViewById(R.id.id_email_prof_text);
        et_password_prof = findViewById(R.id.id_lozinka_prof_text);

        bell.setOnClickListener(l ->{
            Intent i = new Intent(Professor_Login.this, MainActivity.class);
            startActivity(i);
        });
        btn_register_prof_slide.setOnClickListener(l -> {
            Intent i = new Intent(Professor_Login.this, Professor_Register.class);
            startActivity(i);
        });



    }


}