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
    private static List<Test> testList;


    // конструктор
    public MenuPresenter() {

        if (testList == null){

            initMenuPresenter();
        }

        //если не пустой - очищаем для обновления статусов и загружаем снова
        else {
            testList.clear();

            initMenuPresenter();

        }


        // методы UI
        getViewState().initRecyclerViewMenu();
        getViewState().onClickSelectedTest();
    }



    private void initMenuPresenter() {

            Runnable runnable = () -> {

                // заполняем массив
                testList = DateBase.getInstance(ContextApp.getInstance()).dao().getAllTest();

            };

            Thread thread = new Thread(runnable);
            thread.start();
    }

    public static List<Test> getTestList() {
        return testList;
    }
}
