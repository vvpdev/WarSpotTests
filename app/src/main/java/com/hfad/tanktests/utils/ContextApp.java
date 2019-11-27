package com.hfad.tanktests.utils;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

import com.hfad.tanktests.Model.FillDB;

public class ContextApp extends Application {


            // синглтон для контекста всего приложения

    private static ContextApp instance;


    // для проверки заполнения БД
    public static SharedPreferences sharedPreferences_obj;


    @Override
    public void onCreate() {
        super.onCreate();

        instance = (ContextApp) getApplicationContext();


        // чек - заполнена ли БД                          имя файла, тип достпупа к данным - только из приложения
        sharedPreferences_obj = this.getSharedPreferences("check_DB", Context.MODE_PRIVATE);
        // MODE_PRIVATE - только из данного приложения
    }

    public static ContextApp getInstance() {
        return instance;
    }


    public static Boolean checkFillDB(){

        //проверка - заполнена или нет
        // если не найдено, то возвращаем true
        if (sharedPreferences_obj.getBoolean("my_key",true)){
            sharedPreferences_obj.edit().putBoolean("my_key", false).apply();   // и кладем false

            Log.i("my_teg", "(ContextApp) БД пустая, начинаем заполнение");


            // фоновый поток для заполнения
            FillDB fillDB = new FillDB();
            Thread thread = new Thread(fillDB);
            thread.start();

            return true;
        }

        else {
            Log.i("my_teg", "(ContextApp) БД уже заполнена!");

            return false;
        }
    }




}
