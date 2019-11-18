package com.hfad.tanktests.RegisterScreen;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.hfad.tanktests.LoginScreen.LoginActivity;
import com.hfad.tanktests.R;

public class RegisterActivity extends AppCompatActivity implements intRegisterActivity {


    // UI
    EditText editRegName;
    EditText editRegPassword;

    // объект презентера
    RegisterPresenter registerPresenter;

    public static Context context;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_activity);

        // title Activity
        setTitle(R.string.nameRegisterActivity);

        //init UI
        editRegName = findViewById(R.id.editRegName);
        editRegPassword = findViewById(R.id.editRegPassword);


        // init presenter
        registerPresenter = new RegisterPresenter(this);

        //init context
        context = this;

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_register_screen, menu);
        return super.onCreateOptionsMenu(menu);
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.saveUser){

            // передаем данные с полей ввода
            registerPresenter.saveNewUser(editRegName.getText().toString(), editRegPassword.getText().toString());
        }

        return super.onOptionsItemSelected(item);
    }



    // сообщение - если невалидные данные введены
    @Override
    public void onShowMessage(String message) {

        Runnable r = () -> Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        runOnUiThread(r);
    }

    @Override
    public void moveToNext() {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}
