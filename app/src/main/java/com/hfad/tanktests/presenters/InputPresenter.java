package com.hfad.tanktests.presenters;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;
import com.hfad.tanktests.Model.DateBase;
import com.hfad.tanktests.interfaces.InputInterface;
import com.hfad.tanktests.utils.ContextApp;

@InjectViewState
public class InputPresenter extends MvpPresenter <InputInterface> {


    // конструтор
    public InputPresenter() {
        getViewState().showWelcome("Добро пожаловать");
    }

    // на первом экране заполняем БД
    public void fillDB() {

        if(ContextApp.checkFillDB()){   // если возвращает true

            // получение инстанса - запускается билд и заполнение БД
            DateBase.getInstance(ContextApp.getInstance());
        }
        else {
            // ничего не делаем, БД уже заполнена
        }



    }

}
