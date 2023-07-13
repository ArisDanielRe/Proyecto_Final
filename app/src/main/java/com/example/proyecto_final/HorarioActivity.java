package com.example.proyecto_final;

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

        horarioList = new ArrayList<>();
        horarioList.add("Lunes: 9:00 AM - 12:00 PM");
        horarioList.add("Martes: 10:00 AM - 1:00 PM");
        horarioList.add("Miércoles: 8:00 AM - 11:00 AM");
        horarioList.add("Jueves: 11:00 AM - 2:00 PM");
        horarioList.add("Viernes: 1:00 PM - 4:00 PM");

        adapter = new HorarioAdapter(horarioList);
        recyclerViewHorario.setAdapter(adapter);
    }
}
