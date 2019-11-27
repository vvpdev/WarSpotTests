package com.hfad.tanktests.interfaces;

import com.arellomobile.mvp.MvpView;

public interface MenuInterface extends MvpView {


        // инициализация меню
        void initRecyclerViewMenu();

        //передача id выбранного теста
        void onClickSelectedTest();
}
