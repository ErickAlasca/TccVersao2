package com.example.myapplication.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.myapplication.R;

public class FormCadastro extends AppCompatActivity {

    private Button botaoCadastrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_cadastro);

        getSupportActionBar().hide();
        IniciarComponentes();




            botaoCadastrar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(FormCadastro.this, MenuPrincipal.class);
                    startActivity(intent);
                }
            });

    }

    private void IniciarComponentes (){
        botaoCadastrar = findViewById(R.id.botaoCadastrar);
    }

}