package com.hfad.tanktests.Settings;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NavUtils;

import com.hfad.tanktests.R;

public class SettingsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);     // макет фрагмента с настройками

        // заголовок
        setTitle(R.string.nameSettingsActivity);


        ActionBar actionBar = this.getSupportActionBar();

        // если тулбар есть - показать кнопку назад
        if (actionBar != null){
            actionBar.setDisplayHomeAsUpEnabled(true);  // стрелка назад
        }

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int idItem = item.getItemId();

        switch (idItem){

            case android.R.id.home: // для кнопки домой

                // при нажатии Домой - возвращает на родительскую активити
                NavUtils.navigateUpFromSameTask(this);
        }

        // возвращаем item меню
        return super.onOptionsItemSelected(item);
    }
}
