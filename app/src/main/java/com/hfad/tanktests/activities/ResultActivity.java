package com.hfad.tanktests.activities;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.TextView;

import androidx.core.app.NavUtils;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.hfad.tanktests.R;
import com.hfad.tanktests.interfaces.ResultInterface;
import com.hfad.tanktests.presenters.ResultPresenter;

public class ResultActivity extends MvpAppCompatActivity implements ResultInterface {



    // активити для показа результата

    @InjectPresenter
    ResultPresenter resultPresenter;


    int quantityTrueAnswers;
    Intent intent;

    TextView textViewQuantity;


    //для звука
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_activity);

        setTitle("Результаты");

        textViewQuantity = findViewById(R.id.textViewQuantity);

        //init player
        mediaPlayer = MediaPlayer.create(this,R.raw.sound_test);
    }



    // кнопка Назад - возвращает в меню
    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        NavUtils.navigateUpFromSameTask(this);
    }


    @Override
    public void showQuantytiTrueAnswers() {

        intent = getIntent();
        quantityTrueAnswers = intent.getExtras().getInt("quantityTrueAnswers");
        textViewQuantity.setText(String.valueOf(quantityTrueAnswers));

    }




    // звук
    @Override
    public void playSound() {

        mediaPlayer.start();
    }




}
