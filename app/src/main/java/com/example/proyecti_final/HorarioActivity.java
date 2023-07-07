package com.example.proyecti_final;
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

        // Ejemplo de lista de horario (puedes reemplazarla con tus propios datos)
        horarioList = new ArrayList<>();
        horarioList.add("Lunes - 8:00 AM a 10:00 AM - Matemáticas");
        horarioList.add("Martes - 9:00 AM a 11:00 AM - Ciencias");
        horarioList.add("Miércoles - 10:00 AM a 12:00 PM - Historia");

        adapter = new HorarioAdapter(horarioList);
        recyclerViewHorario.setAdapter(adapter);
    }
}

