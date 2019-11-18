package com.hfad.tanktests.RegisterScreen;

import android.text.TextUtils;

import com.hfad.tanktests.Model.DateBase;
import com.hfad.tanktests.Model.User;

public class RegisterPresenter implements intRegisterPresenter {


    // вьюха
    intRegisterActivity intRegisterActivity;

    // конструктор
    public RegisterPresenter(com.hfad.tanktests.RegisterScreen.intRegisterActivity intRegisterActivity) {
        this.intRegisterActivity = intRegisterActivity;
    }



    @Override
    public void saveNewUser(String name, String password) {

        // 1. проверить на пустые поля
        // 1.1 проверить - есть ли уже такой пользователь
        // 2. проверить на валидность (пароль не менее 4 символов)
        // 3. если условия выполняются - сохранить в БД и перейти на LoginScreen + показать Toast


        // если не пустые поля
        if (!TextUtils.isEmpty(name) & !TextUtils.isEmpty(password)){

                if (password.length() < 4){
                    intRegisterActivity.onShowMessage("пароль должен быть не менее 4 символов");
                }

                else {

                    // подключение к БД в фоновом потоке
                    Thread thread = new Thread(){
                        @Override
                        public void run() {
                            super.run();

                            User user;

                            try {

                                // пробуем запросить пользователя с таким же именем
                                user = DateBase.getInstance(RegisterActivity.context).dao().getByName(name);

                                // если есть совпадение
                                if (name.equals(user.name)){
                                    intRegisterActivity.onShowMessage("такой пользователь уже есть!");
                                }
                            }

                            // если еще нет пользователя с таким же именем - сохраняем
                            catch (Exception e){

                                User user1 = new User();
                                user1.name = name;
                                user1.password = password;
                                DateBase.getInstance(RegisterActivity.context).dao().insert(user1);

                                // сообщение об удачном сохранении
                                intRegisterActivity.onShowMessage("новый пользователь добавлен!");

                                // и переходим на экран ввода логин/пароль
                                intRegisterActivity.moveToNext();
                            }
                        }
                    };

                    thread.start();
                }
        }

        else {

            intRegisterActivity.onShowMessage("пустые поля!");
        }

    }
}
