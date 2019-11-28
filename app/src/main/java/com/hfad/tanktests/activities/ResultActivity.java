package com.hfad.tanktests.activities;

import android.content.Intent;
import android.os.Bundle;

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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result_activity);

        setTitle("Результаты");

        intent = getIntent();
        quantityTrueAnswers = intent.getExtras().getInt("quantityTrueAnswers");
    }



    // кнопка Назад - возвращает в меню
    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        NavUtils.navigateUpFromSameTask(this);
    }



    @Override
    public void showQuantytiTrueAnswers(int quantity) {

    }
}
