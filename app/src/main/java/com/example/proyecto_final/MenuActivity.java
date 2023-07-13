package com.example.proyecto_final;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MenuActivity extends AppCompatActivity {

    private Button buttonHorario;
    private Button buttonNotificaciones;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        buttonHorario = findViewById(R.id.buttonHorario);
        buttonNotificaciones = findViewById(R.id.buttonNotificaciones);

        buttonHorario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, HorarioActivity.class);
                startActivity(intent);
            }
        });

        buttonNotificaciones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, NotificacionesActivity.class);
                startActivity(intent);
            }
        });
    }
}


