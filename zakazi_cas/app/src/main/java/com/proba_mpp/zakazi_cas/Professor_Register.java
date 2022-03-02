package com.proba_mpp.zakazi_cas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;

public class Professor_Register extends AppCompatActivity {

    ImageView btn_manu, btn_logo;
    Button btn_prof_najava, btn_prof_register, btn_prof_registrirajse;
    RadioButton rb_prof_masko, rb_prof_zensko;
    EditText et_prof_ime, et_prof_prezime, et_prof_email, et_prof_password, et_prof_potvrda_pass, et_prof_tel, et_godini, et_opis, et_slika_prof;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_professor__register);

        //ImagesView
        btn_manu = findViewById(R.id.id_manu);
        btn_logo = findViewById(R.id.id_bell);
        //Buttons
        btn_prof_najava = findViewById(R.id.id_najava_prof_slide_reg);

        btn_logo.setOnClickListener(l -> {
            Intent i = new Intent(Professor_Register.this, MainActivity.class);
            startActivity(i);
        });
        btn_prof_najava.setOnClickListener(l -> {
            Intent i = new Intent(Professor_Register.this, Professor_Login.class);
            startActivity(i);
        });



    }
}