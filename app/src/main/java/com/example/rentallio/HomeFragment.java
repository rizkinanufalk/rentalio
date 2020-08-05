package com.example.rentallio;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

public class HomeFragment extends Fragment {
    private List<Integer> imageCategory = new ArrayList<>();
    private List<String> nameCategory = new ArrayList<>();
    private Button btnStart, btnEnd;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.rv_grid);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 4);//jumlah kolom
        recyclerView.setLayoutManager(gridLayoutManager);

        imageCategory.add(R.drawable.city);
        imageCategory.add(R.drawable.suv);
        imageCategory.add(R.drawable.mpv);
        imageCategory.add(R.drawable.jeep);
        imageCategory.add(R.drawable.moped);
        imageCategory.add(R.drawable.scooter);
        imageCategory.add(R.drawable.trail);
        imageCategory.add(R.drawable.classic);

        nameCategory.add("CITY");
        nameCategory.add("SUV");
        nameCategory.add("MPV");
        nameCategory.add("JEEP");
        nameCategory.add("MOPED");
        nameCategory.add("SCOOTER");
        nameCategory.add("TRAIL");
        nameCategory.add("CLASSIC");

        CategoryAdapter categoryAdapter = new CategoryAdapter(getActivity(),imageCategory,nameCategory);
        recyclerView.setAdapter(categoryAdapter);



        ViewPager viewPager = view.findViewById(R.id.viewPager);
        ImageAdapter adapter = new ImageAdapter(getActivity());
        viewPager.setAdapter(adapter);
        return view;
    }

//    private void imageCat(){
//        imageCategory.add(R.drawable.city);
//        imageCategory.add(R.drawable.suv);
//        imageCategory.add(R.drawable.mpv);
//        imageCategory.add(R.drawable.jeep);
//        imageCategory.add(R.drawable.moped);
//        imageCategory.add(R.drawable.scooter);
//        imageCategory.add(R.drawable.trail);
//        imageCategory.add(R.drawable.classic);
//
//    }
}
