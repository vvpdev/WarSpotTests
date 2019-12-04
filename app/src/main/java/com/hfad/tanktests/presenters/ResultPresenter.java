package com.hfad.tanktests.presenters;


import android.content.SharedPreferences;

import androidx.preference.PreferenceManager;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;
import com.hfad.tanktests.interfaces.ResultInterface;
import com.hfad.tanktests.utils.ContextApp;

@InjectViewState
public class ResultPresenter extends MvpPresenter <ResultInterface> {


    private SharedPreferences sharedPreferences;


    // конструктор
    public ResultPresenter() {

        //показ количества ответов
        getViewState().showQuantytiTrueAnswers();

        //звук
        checkEnableSound();
    }



    // проверка настроек
    private void checkEnableSound(){

        // получаем SharedPreferences, которое работает с файлом настроек
        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(ContextApp.getInstance());

        boolean onSound = sharedPreferences.getBoolean("sound", false);

        if (onSound){       // если звук включен

            getViewState().playSound();
        }

    }

}
