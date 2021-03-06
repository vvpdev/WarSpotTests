package com.hfad.tanktests.activities;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.hfad.tanktests.R;
import com.hfad.tanktests.adapters.AdapterRecViewMenu;
import com.hfad.tanktests.interfaces.MenuInterface;
import com.hfad.tanktests.listeners.RecyclerItemClickListener;
import com.hfad.tanktests.presenters.MenuPresenter;

public class MenuActivity extends MvpAppCompatActivity implements MenuInterface {

    //UI
    RecyclerView recyclerViewMenu;

    RecyclerView.LayoutManager layoutManager;
    AdapterRecViewMenu adapterRecViewMenu;

    @InjectPresenter
    MenuPresenter menuPresenter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_activity);

        setTitle("Выберите тест");

        recyclerViewMenu = findViewById(R.id.recyclerViewMenu);
    }


    //настройка items
    @Override
    public void initRecyclerViewMenu() {

        // проверка конфигурации для разного отображения
        Configuration configuration = getResources().getConfiguration();

        // портретная
        if (configuration.orientation == Configuration.ORIENTATION_PORTRAIT){

            layoutManager = new LinearLayoutManager(this);
            recyclerViewMenu.setLayoutManager(layoutManager);
        }

        //альбомная
        if (configuration.orientation == Configuration.ORIENTATION_LANDSCAPE){

            layoutManager = new GridLayoutManager(this, 2); // две колонки
            recyclerViewMenu.setLayoutManager(layoutManager);
        }

        // задаем адаптер
        adapterRecViewMenu = new AdapterRecViewMenu(MenuPresenter.getTestList(), this);
        recyclerViewMenu.setAdapter(adapterRecViewMenu);
    }




    // передача презентеру выбранного теста
    @Override
    public void onClickSelectedTest() {

        recyclerViewMenu.addOnItemTouchListener(

                new RecyclerItemClickListener(this, recyclerViewMenu, (view, position) -> {

                    // переход к тесту и передача id
                    Intent intent = new Intent(this, TestActivity.class);
                    intent.putExtra("id", position);
                    startActivity(intent);
                })
        );
    }







}
