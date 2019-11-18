package com.hfad.tanktests.MenuScreen;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

import com.hfad.tanktests.R;

public class MenuActivity extends AppCompatActivity {



    // пропистаь - кнопка назад - выход из приложения (без входа на экраны входа и логина)


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_activity);

        //set Title
        setTitle(R.string.nameMenuActivity);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_menu_screen, menu);
        return super.onCreateOptionsMenu(menu);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.settingsApp){

            // переход на экран настроек
        }


        return super.onOptionsItemSelected(item);
    }
}
