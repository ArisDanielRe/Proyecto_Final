package com.example.proyecti_final;
// HorarioActivity.java
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class HorarioActivity extends AppCompatActivity {
    private Button buttonNavigateNotifications;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horario);

        buttonNavigateNotifications = findViewById(R.id.buttonNavigateNotifications);
        buttonNavigateNotifications.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToNotificacionesActivity();
            }
        });
    }

    private void goToNotificacionesActivity() {
        Intent intent = new Intent(HorarioActivity.this, NotificacionesActivity.class);
        startActivity(intent);
    }
}
