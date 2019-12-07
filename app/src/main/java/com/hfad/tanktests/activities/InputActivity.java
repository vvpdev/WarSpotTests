package com.hfad.tanktests.activities;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.bumptech.glide.Glide;
import com.hfad.tanktests.R;
import com.hfad.tanktests.interfaces.InputInterface;
import com.hfad.tanktests.presenters.InputPresenter;


// активити входа

public class InputActivity extends MvpAppCompatActivity implements InputInterface {


    @InjectPresenter
    InputPresenter inputPresenter;


    // для окна с описанием app
    AlertDialog.Builder builder;


    //init UI
    ImageView imageMainBanner;
    Button buttonToTests;
    Button buttonToSettings;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input_activity);


        setTitle("Главная");

        inputPresenter.fillDB();


        //UI
        imageMainBanner = findViewById(R.id.imageMainBanner);
        buttonToTests = findViewById(R.id.buttonToTests);
        buttonToSettings = findViewById(R.id.buttonToSettings);


        // переход к меню
        buttonToTests.setOnClickListener(v -> {
            Intent intent = new Intent(InputActivity.this, MenuActivity.class);
            startActivity(intent);
        });



        // переход к настройкам
        buttonToSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(InputActivity.this, SettingsActivity.class);
                startActivity(intent);
            }
        });



        // баннер
        Glide
                .with(this)
                .load(R.drawable.main_banner)
                //.centerCrop()
                .into(imageMainBanner);
    }

    @Override
    public void showWelcome(String message) {
        Toast toast = Toast.makeText(this, message, Toast.LENGTH_LONG);
        toast.show();
    }






    //меню в тулбаре
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

            getMenuInflater().inflate(R.menu.menu, menu);

        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){

            case R.id.developerPicture:

                LayoutInflater inflater = getLayoutInflater();

                builder = new AlertDialog.Builder(this);
                builder.setIcon(R.mipmap.logo_app_round);
                builder.setTitle(R.string.app_name);

                builder.setView(inflater.inflate(R.layout.about_app, null))
                        .setPositiveButton("ок", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {


                                // пока ничего
                            }
                        });

                builder.create();
                builder.show();

                break;
        }

        return super.onOptionsItemSelected(item);
    }
}
