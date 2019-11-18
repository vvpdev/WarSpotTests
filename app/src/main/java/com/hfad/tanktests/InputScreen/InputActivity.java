package com.hfad.tanktests.InputScreen;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.hfad.tanktests.LoginScreen.LoginActivity;
import com.hfad.tanktests.R;
import com.hfad.tanktests.RegisterScreen.RegisterActivity;

public class InputActivity extends AppCompatActivity {


    // простая активити без презентера


    Button buttonToComeIn;
    Button buttonToRegister;


    public static Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.input_activity);

        // title Activity
        setTitle(R.string.nameInputActivity);

        // init UI
        buttonToComeIn = findViewById(R.id.buttonToComeIn);
        buttonToRegister = findViewById(R.id.buttonToRegister);


        // init context
        context = this;
    }


    // цепляем метод к кнопкам на макете
    public void onClick(View view){

        int id = view.getId();

        switch (id){

            case R.id.buttonToComeIn:

                // к активити ввода логин/пароль
                Intent intent = new Intent(InputActivity.this, LoginActivity.class);
                startActivity(intent);
                break;

            case R.id.buttonToRegister:

                // зарегаться
                Intent intent1 = new Intent(InputActivity.this, RegisterActivity.class);
                startActivity(intent1);

                break;
        }
    }




}
