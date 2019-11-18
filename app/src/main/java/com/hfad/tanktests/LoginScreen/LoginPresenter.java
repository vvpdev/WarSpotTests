package com.hfad.tanktests.LoginScreen;

import android.text.TextUtils;

import com.hfad.tanktests.Model.DateBase;
import com.hfad.tanktests.Model.User;

public class LoginPresenter implements intLoginPresenter {


    // вьюха
    intLoginActivity intLoginActivity;

    // передаем вьюху и модель в конструктор
    public LoginPresenter(intLoginActivity intLoginActivity) {
            this.intLoginActivity = intLoginActivity;
    }


    @Override
    public void checkUser(String name, String password) {


        // 1. получаем введенные данные
        // 2. запрос в БД - есть ли пользователь с таким логином
        // 2.1 если есть - проверка правильности пароля
        // 2.2 если пароль верен - вход, если нет - сообщение об ошибке
        // 3. если нет такого - сохранить нового

        if (!TextUtils.isEmpty(name) && !TextUtils.isEmpty(password)) {

            final User[] user = {new User()};

            // фоновый поток для запроса к БД
                Thread thread = new Thread(){
                    @Override
                    public void run() {
                        super.run();

                        try {

                            // запрос к БД по имени пользователя
                            user[0] = DateBase.getInstance(LoginActivity.context).dao().getByName(name);

                            // если все данные правильные
                            if(name.equals(user[0].name) & password.equals(user[0].password)){
                                intLoginActivity.onShowResult("вход");

                                // переход к меню приложения
                                intLoginActivity.removeToNext();
                            }

                            // если неправильный пароль
                            else if (name.equals(user[0].name) & !password.equals(user[0].password)){

                                intLoginActivity.onShowResult("неправильный пароль");
                            }

                        }
                        catch (Exception e){
                            intLoginActivity.onShowResult("пользователь не найден");
                        }
                    }
                };
                    thread.start(); // запуск фонового потока

        }

        else {
            intLoginActivity.onShowResult("пустые поля!");
        }
    }

}