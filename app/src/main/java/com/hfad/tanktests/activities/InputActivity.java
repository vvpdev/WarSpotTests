package com.hfad.tanktests.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
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


//    // для проверки заполнения БД
//    SharedPreferences sharedPreferences_obj;


    //init UI
    ImageView imageInputGif;
    Button buttonStart;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input_activity);


        setTitle("Вход");

        inputPresenter.fillDB();


        //UI
        imageInputGif = findViewById(R.id.imageInputGif);
        buttonStart = findViewById(R.id.buttonStart);

        buttonStart.setOnClickListener(v -> {
            Intent intent = new Intent(InputActivity.this, MenuActivity.class);
            startActivity(intent);
        });


        // для гифки
//        Glide
//                .with(this)
//                .load(R.drawable.start_picture)
//                .centerCrop()
//                .into(imageInputGif);
    }

    @Override
    public void showWelcome(String message) {
        Toast toast = Toast.makeText(this, message, Toast.LENGTH_LONG);
        toast.show();
    }

}
