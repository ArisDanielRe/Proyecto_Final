package com.example.proyecto_final;
// HorarioActivity.java
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class HorarioActivity extends AppCompatActivity {
    private RecyclerView recyclerViewHorario;
    private HorarioAdapter adapter;
    private List<String> horarioList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_horario);

        recyclerViewHorario = findViewById(R.id.recyclerViewHorario);
        recyclerViewHorario.setLayoutManager(new LinearLayoutManager(this));

        // Obtener el horario académico (simulación de datos)
        horarioList = getHorario();

        adapter = new HorarioAdapter(horarioList);
        recyclerViewHorario.setAdapter(adapter);
    }

    // Método para obtener el horario académico (simulación de datos)
    private List<String> getHorario() {
        List<String> horario = new ArrayList<>();

        // Agregar elementos de ejemplo al horario
        horario.add("Lunes: 9:00 AM - 11:00 AM");
        horario.add("Martes: 10:00 AM - 12:00 PM");
        horario.add("Miércoles: 1:00 PM - 3:00 PM");
        horario.add("Jueves: 9:00 AM - 11:00 AM");
        horario.add("Viernes: 2:00 PM - 4:00 PM");

        return horario;
    }
}
