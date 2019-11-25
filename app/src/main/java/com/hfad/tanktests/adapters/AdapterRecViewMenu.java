package com.hfad.tanktests.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.hfad.tanktests.Model.Test;
import com.hfad.tanktests.R;
import com.hfad.tanktests.utils.ContextApp;

import java.util.List;

public class AdapterRecViewMenu extends RecyclerView.Adapter <AdapterRecViewMenu.ViewHolder> {


    // массив
    List<Test> testList;

    //раздуватель
    LayoutInflater layoutInflater;


    // конструктор
    public AdapterRecViewMenu(List<Test> testList, Context context) {
        this.testList = testList;
        this.layoutInflater = LayoutInflater.from(context);
    }



    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = layoutInflater.inflate(R.layout.menu_card, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {

        // объект массива
        Test test = testList.get(position);

        holder.textTitleTest.setText(test.name);
        holder.textViewDescription.setText(test.description);

        Glide
                .with(ContextApp.getInstance())
                .load(test.picture)
                .centerCrop()
                .into(holder.imageViewTest);
    }

    @Override
    public int getItemCount() {
        return testList.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageViewTest;
        TextView textTitleTest;
        TextView textViewDescription;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            imageViewTest = itemView.findViewById(R.id.imageViewTest);
            textTitleTest = itemView.findViewById(R.id.textTitleTest);
            textViewDescription = itemView.findViewById(R.id.textViewDescription);
        }
    }
}
