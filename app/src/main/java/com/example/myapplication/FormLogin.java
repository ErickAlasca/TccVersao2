package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FormLogin extends AppCompatActivity {

    private TextView textCadastro;
    private Button btEntrar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_login);

        getSupportActionBar().hide();
        IniciarComponentes();


        btEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FormLogin.this, MenuPrincipal.class);
                startActivity(intent);
            }
        });


        textCadastro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(FormLogin.this, FormCadastro.class);
                startActivity(intent);

            }
        });
    }

    private void IniciarComponentes(){
        textCadastro = findViewById(R.id.textCadastro);
        btEntrar = findViewById(R.id.btEntrar);
    }
}