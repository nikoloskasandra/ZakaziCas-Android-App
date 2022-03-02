package com.proba_mpp.zakazi_cas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;

public class Student_Register extends AppCompatActivity {

    ImageView logo_bell,manu;
    Button btn_register_slide, btn_najava_slide, btn_registrirajse;
    EditText et_ime, et_prezime, et_email, et_password, et_potvrda, et_godini, et_slika;
    RadioButton rb_masko, rb_zensko;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student__register);

        //images
        logo_bell = findViewById(R.id.id_bell);
        manu = findViewById(R.id.id_manu);
        //buttons
        btn_najava_slide = findViewById(R.id.id_najava_slide);
        btn_register_slide = findViewById(R.id.id_register_slide);
        btn_registrirajse = findViewById(R.id.id_registrirajse);
        //edit texts
        et_ime = findViewById(R.id.id_ime_text);
        et_prezime = findViewById(R.id.id_prezime_text);
        et_godini = findViewById(R.id.id_godini);
        et_email = findViewById(R.id.id_email);
        et_password = findViewById(R.id.id_password);
        et_potvrda = findViewById(R.id.id_potvrda_password);
        //edit text - slika
        et_slika = findViewById(R.id.id_slika_text);
        //radio buttons
        rb_masko = findViewById(R.id.id_masko_radio_prof);
        rb_zensko = findViewById(R.id.id_zensko_radio_prof);

        // NAZAD NA MAINACTIVITI - POCETNA (back to MainActivity)
        logo_bell.setOnClickListener(l -> {
            Intent i = new Intent(Student_Register.this,MainActivity.class);
            startActivity(i);
        });

        btn_najava_slide.setOnClickListener(l -> {
            Intent i = new Intent(Student_Register.this,Student_Login.class);
            startActivity(i);
        });

    }
}