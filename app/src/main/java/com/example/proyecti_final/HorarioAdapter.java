package com.example.proyecti_final;
// HorarioAdapter.java
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class HorarioAdapter extends RecyclerView.Adapter<HorarioAdapter.ViewHolder> {
    private List<String> horarioList;

    public HorarioAdapter(List<String> horarioList) {
        this.horarioList = horarioList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_horario, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String horario = horarioList.get(position);
        holder.textViewHorario.setText(horario);
    }

    @Override
    public int getItemCount() {
        return horarioList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textViewHorario;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewHorario = itemView.findViewById(R.id.textViewHorario);
        }
    }
}
