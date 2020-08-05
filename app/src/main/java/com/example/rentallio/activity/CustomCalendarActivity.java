package com.example.rentallio.activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.rentallio.CustomCalendarAdapter;
import com.example.rentallio.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class CustomCalendarActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.custom_calendar_layout);

        RecyclerView recyclerView = findViewById(R.id.rv_grid);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,7,GridLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(gridLayoutManager);

        CustomCalendarAdapter customCalendarAdapter = new CustomCalendarAdapter();
        recyclerView.setAdapter(customCalendarAdapter);


    }
}
