package com.example.proyecto_final;
// NotificacionesAdapter.java
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class NotificacionesAdapter extends RecyclerView.Adapter<NotificacionesAdapter.ViewHolder> {
    private List<String> notificacionesList;

    public NotificacionesAdapter(List<String> notificacionesList) {
        this.notificacionesList = notificacionesList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_notificacion, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        String notificacion = notificacionesList.get(position);
        holder.textViewNotificacion.setText(notificacion);
    }

    @Override
    public int getItemCount() {
        return notificacionesList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public TextView textViewNotificacion;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewNotificacion = itemView.findViewById(R.id.textViewNotificacion);
        }
    }
}
