package com.example.rentallio;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

public class CategoryAdapter extends RecyclerView.Adapter<CategoryAdapter.CategoryHolder> {
    private List<Integer> imageCategory;
    private List<String> nameCategory;
    private Context context;


    public CategoryAdapter(Context context, List <Integer> imageCategory, List<String> nameCategory) {
        this.imageCategory = imageCategory;
        this.nameCategory = nameCategory;
        this.context = context;
    }

    @NonNull
    @Override
    public CategoryHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.category_item, parent, false);
        return new CategoryHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull CategoryHolder holder, int position) {

    holder.imgCategory.setImageResource(imageCategory.get(position));
    holder.textCategory.setText(nameCategory.get(position));

    holder.itemView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            AppCompatActivity appCompatActivity = (AppCompatActivity) view.getContext();
            Fragment fragment = new BookFragment();
            appCompatActivity.getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, new BookFragment())
                    .addToBackStack(null)
                    .commit();
        }
    });

    }



    @Override
    public int getItemCount() {
        return imageCategory.size();
    }

    class CategoryHolder extends RecyclerView.ViewHolder{
        private ImageView imgCategory;
        private TextView textCategory;

        public CategoryHolder(@NonNull View itemView) {
            super(itemView);

            imgCategory = itemView.findViewById(R.id.image_category);
            textCategory = itemView.findViewById(R.id.tv_category);
        }
    }
}
