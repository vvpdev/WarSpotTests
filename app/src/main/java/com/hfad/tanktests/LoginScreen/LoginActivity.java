package com.hfad.tanktests.LoginScreen;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.hfad.tanktests.MenuScreen.MenuActivity;
import com.hfad.tanktests.R;

public class LoginActivity extends AppCompatActivity implements intLoginActivity {

            // в манифесте у app - icon - картинка приложения (only png)

    public static Context context;


    // объект класса презентер для вьюхи
    LoginPresenter loginPresenter;

    //UI
    EditText editName;
    EditText editPassword;
    Button buttonSignIn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);

        // title Activity
        setTitle(R.string.nameLoginActivity);

        //init context
        context = this;


        //init presenter
        loginPresenter = new LoginPresenter(this);


        // init UI
        editName = findViewById(R.id.editName);
        editPassword = findViewById(R.id.editPassword);
        buttonSignIn = findViewById(R.id.buttonSignIn);


        // event
        buttonSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // передаем введенные данные презентеру
                loginPresenter.checkUser(editName.getText().toString(), editPassword.getText().toString());
            }
        });
    }



    // показ информации о результате входа
    @Override
    public void onShowResult(String message) {

        Runnable r = () -> Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
        runOnUiThread(r);
    }


    // переход к меню приложения
    @Override
    public void removeToNext() {
        Intent intent = new Intent(this, MenuActivity.class);
        startActivity(intent);
    }

}






