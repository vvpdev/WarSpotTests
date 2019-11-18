package com.hfad.tanktests.MenuScreen;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.hfad.tanktests.R;


    // адаптер для RecyclerView со списком тестов - экран меню


public class AdapterListTest extends RecyclerView.Adapter <AdapterListTest.ViewHolder> {







    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return null;
    }





    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

    }





    @Override
    public int getItemCount() {
        return 0;
    }




    // владелец вида
    public class ViewHolder extends RecyclerView.ViewHolder {


        TextView textIdTest;
        ImageView imageTestCover;
        TextView textNameTest;
        TextView textDescriptionTest;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textIdTest = itemView.findViewById(R.id.textIdTest);
            imageTestCover = itemView.findViewById(R.id.imageTestCover);
            textNameTest = itemView.findViewById(R.id.textNameTest);
            textDescriptionTest = itemView.findViewById(R.id.textDescriptionTest);
        }
    }
}
