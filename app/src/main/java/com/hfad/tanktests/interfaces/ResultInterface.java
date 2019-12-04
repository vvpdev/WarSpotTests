package com.hfad.tanktests.interfaces;


import com.arellomobile.mvp.MvpView;

public interface ResultInterface extends MvpView {


        // показ количества правильных ответов
        void showQuantytiTrueAnswers();

        // звук после прохождения теста
        void playSound();

}
