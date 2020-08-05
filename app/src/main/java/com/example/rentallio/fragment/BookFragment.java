package com.example.rentallio.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;

import com.example.rentallio.activity.CustomCalendarActivity;
import com.example.rentallio.R;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class BookFragment extends Fragment {

    private Button btnEnd,btnStart,btnWithDriver,btnWithoutDriver, btnBook;
    private LinearLayout linearTransmission;
    private boolean flagTransmission = false;
    private boolean flagCheck = false;
    private CheckBox checkBox;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_booking, container, false);


        btnEnd = (Button) view.findViewById(R.id.btn_date_end);
        btnStart = (Button) view.findViewById(R.id.btn_date_start);
        btnWithDriver = (Button) view.findViewById(R.id.btn_with_driver);
        btnWithoutDriver = (Button) view.findViewById(R.id.btn_without_driver);
        linearTransmission = (LinearLayout) view.findViewById(R.id.linear_transmission);
        checkBox = (CheckBox) view.findViewById(R.id.checkbox);
        btnBook = (Button) view.findViewById(R.id.btn_book);


        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), CustomCalendarActivity.class);
                startActivity(intent);
            }
        });

        btnEnd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), CustomCalendarActivity.class);
                startActivity(intent);
            }
        });

        btnWithDriver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                    flagTransmission = true;

                    btnWithDriver.setBackgroundColor(getResources().getColor(R.color.orangeRent));
                    btnWithoutDriver.setBackgroundResource(android.R.drawable.btn_default);
                    linearTransmission.setVisibility(View.GONE);


            }
        });

        btnWithoutDriver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                linearTransmission.setVisibility(View.VISIBLE);
                flagTransmission = true;

                btnWithoutDriver.setBackgroundColor(getResources().getColor(R.color.orangeRent));
                btnWithDriver.setBackgroundResource(android.R.drawable.btn_default);

            }
        });

        checkBox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (flagCheck){
                    btnBook.setEnabled(false);
                    flagCheck = false;
                } else {
                    btnBook.setEnabled(true);
                    flagCheck = true;
                }
            }
        });

        btnBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragment_container, new HomeFragment())
                        .commit();
            }
        });

        return view;
    }
}
