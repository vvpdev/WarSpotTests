package com.hfad.tanktests.interfaces;


import com.arellomobile.mvp.MvpView;



public interface TestInterface extends MvpView {

        //передача презентеру принятого id выбранного теста
        void sendSelectedTestId();


        // обработка нажатий на кнопки ответов
        void onClickAnswer();
}
