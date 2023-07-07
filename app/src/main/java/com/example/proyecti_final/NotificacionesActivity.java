package com.example.proyecti_final;

// NotificacionesActivity.java
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class NotificacionesActivity extends AppCompatActivity {
    private RecyclerView recyclerViewNotificaciones;
    private NotificacionesAdapter adapter;
    private List<String> notificacionesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notificaciones);

        recyclerViewNotificaciones = findViewById(R.id.recyclerViewNotificaciones);
        recyclerViewNotificaciones.setLayoutManager(new LinearLayoutManager(this));

        // Ejemplo de lista de notificaciones (puedes reemplazarla con tus propios datos)
        notificacionesList = new ArrayList<>();
        notificacionesList.add("Notificación 1");
        notificacionesList.add("Notificación 2");
        notificacionesList.add("Notificación 3");

        adapter = new NotificacionesAdapter(notificacionesList);
        recyclerViewNotificaciones.setAdapter(adapter);
    }
}
