package com.example.rentallio;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;

import java.util.List;
import java.util.zip.Inflater;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CustomCalendarAdapter extends RecyclerView.Adapter<CustomCalendarAdapter.ViewHolder> {
    private Context context;
    private List<CalendarData> calendarData;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.calenda_item, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return calendarData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }

}
