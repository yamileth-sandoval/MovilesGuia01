package com.example.movilesguia01;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button btnMisDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Inicializar los botones
        this.btnMisDatos = findViewById(R.id.btnMisDatos);

        //Creacion de los eventos
        this.btnMisDatos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in=new Intent(v.getContext(),misDatos.class);
                startActivityForResult(in,0);
            }
        });
    }
    public void clickCalculadora(View v){
        Intent nueva =new Intent(this,calculadora.class);
        startActivity(nueva);
    }

    public void clickLogin(View v){
        Intent nueva=new Intent(this,login.class);
        startActivity(nueva);
    }
}
