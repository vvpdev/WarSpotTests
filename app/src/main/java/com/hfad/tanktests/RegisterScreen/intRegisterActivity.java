package com.hfad.tanktests.RegisterScreen;

public interface intRegisterActivity {

    // сообщения о ходе сохранения нового пользователя
    void onShowMessage(String message);

    // возврат на экран ввода логин/пароль
    void moveToNext();


}
