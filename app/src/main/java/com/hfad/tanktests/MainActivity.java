package com.hfad.tanktests;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;

import com.hfad.tanktests.Settings.SettingsActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // в манифесте у app - icon - картинка приложения (only png)

    }




    // создаем меню
    @Override
    public boolean onCreateOptionsMenu(Menu menuToolbar) {

        MenuInflater menuInflater_obj = getMenuInflater();
        menuInflater_obj.inflate(R.menu.menu_toolbar, menuToolbar);
        return true;    // возвращаем меню
    }




    // айтемы меню
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int idItem = item.getItemId();

        switch (idItem){

            case R.id.settings:
                Intent intentToSettings = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(intentToSettings);
        }

        // возвращаем item меню
        return super.onOptionsItemSelected(item);
    }






}
