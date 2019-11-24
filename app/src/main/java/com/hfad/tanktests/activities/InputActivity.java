package com.hfad.tanktests.activities;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.hfad.tanktests.R;
import com.hfad.tanktests.interfaces.InputInterface;
import com.hfad.tanktests.presenters.InputPresenter;


// активити входа

public class InputActivity extends MvpAppCompatActivity implements InputInterface {


    @InjectPresenter
    InputPresenter inputPresenter;

    // для начального заполнения БД
    public static Context context;


    // для проверки заполнения БД
    SharedPreferences sharedPreferences_obj;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input_activity);
                                                                                // имя файла, тип достпупа к данным
        sharedPreferences_obj = this.getSharedPreferences("check_DB", Context.MODE_PRIVATE);
        // MODE_PRIVATE - только из данного приложения

        //init context
        context = this;
    }

    @Override
    public void showWelcome(String message) {
        Toast toast = Toast.makeText(this, message, Toast.LENGTH_LONG);
        toast.show();
    }


    @Override
    protected void onResume() {
        super.onResume();

                                            // если не найдено, то возвращаем true
        if (sharedPreferences_obj.getBoolean("my_key",true)){
            sharedPreferences_obj.edit().putBoolean("my_key", false).apply();   // кладем false

            Log.i("kanistra", "БД пустая, начинаем заполнение");

            //заполнение БД
            inputPresenter.fillDB();
        }

        else {
            Log.i("kanistra", "БД уже заполнена!");
        }


    }
}
