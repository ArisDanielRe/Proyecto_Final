package com.example.proyecto_final;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class NotificacionesActivity extends AppCompatActivity {

    private RecyclerView recyclerViewNotificaciones;
    private NotificacionesAdapter adapter;
    private List<String> notificacionesList;
    private EditText editTextNuevaNotificacion;
    private Button buttonAgregarNotificacion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notificaciones);

        recyclerViewNotificaciones = findViewById(R.id.recyclerViewNotificaciones);
        editTextNuevaNotificacion = findViewById(R.id.editTextNuevaNotificacion);
        buttonAgregarNotificacion = findViewById(R.id.buttonAgregarNotificacion);

        recyclerViewNotificaciones.setLayoutManager(new LinearLayoutManager(this));

        notificacionesList = new ArrayList<>();

        adapter = new NotificacionesAdapter(notificacionesList);
        recyclerViewNotificaciones.setAdapter(adapter);

        buttonAgregarNotificacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nuevaNotificacion = editTextNuevaNotificacion.getText().toString().trim();

                if (!nuevaNotificacion.isEmpty()) {
                    notificacionesList.add(nuevaNotificacion);
                    adapter.notifyDataSetChanged();
                    editTextNuevaNotificacion.setText("");
                } else {
                    Toast.makeText(NotificacionesActivity.this, "Por favor, ingresa una notificación", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

