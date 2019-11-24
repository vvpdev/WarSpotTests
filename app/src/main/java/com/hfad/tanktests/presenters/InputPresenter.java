package com.hfad.tanktests.presenters;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;
import com.hfad.tanktests.Model.DateBase;
import com.hfad.tanktests.activities.InputActivity;
import com.hfad.tanktests.interfaces.InputInterface;

@InjectViewState
public class InputPresenter extends MvpPresenter <InputInterface> {


    // из конструктора - срабатывает сразу при запуске
    public InputPresenter() {
        getViewState().showWelcome("Добро пожаловать");
    }

    // на первом экране заполним БД
    public void fillDB() {

        // получение инстанса - запускается билд и заполнение БД
        DateBase.getInstance(InputActivity.context);
    }

}
