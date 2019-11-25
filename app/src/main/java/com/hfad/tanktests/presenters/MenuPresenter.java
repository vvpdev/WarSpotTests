package com.hfad.tanktests.presenters;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;
import com.hfad.tanktests.Model.DateBase;
import com.hfad.tanktests.Model.Test;
import com.hfad.tanktests.interfaces.MenuInterface;
import com.hfad.tanktests.utils.ContextApp;

import java.util.List;


@InjectViewState
public class MenuPresenter extends MvpPresenter <MenuInterface> {


    //массив
    public static List<Test> testList;


    // конструктор
    public MenuPresenter() {


        if (testList == null){

            Runnable runnable = () -> {

                // заполняем массив
                testList = DateBase.getInstance(ContextApp.getInstance()).dao().getAllTest();

                // возвращаем заполненный массив
                getTestList();
            };

            Thread thread = new Thread(runnable);
            thread.start();

        }


        // init UI
        getViewState().initRecyclerViewMenu();
    }

    public static List<Test> getTestList() {
        return testList;
    }
}
