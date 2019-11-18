package com.hfad.tanktests.LoginScreen;

public interface intLoginActivity {


    // показ сообщений о результате входа
    void onShowResult(String message);

    // переход к основному меню при удачном входе
    void removeToNext();

}
