package com.hfad.tanktests.activities;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBar;
import androidx.core.app.NavUtils;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.bumptech.glide.Glide;
import com.hfad.tanktests.Model.Question;
import com.hfad.tanktests.R;
import com.hfad.tanktests.interfaces.TestInterface;
import com.hfad.tanktests.presenters.TestPresenter;

import java.util.Objects;


        // экран с тестом


public class TestActivity extends MvpAppCompatActivity implements TestInterface {


    @InjectPresenter
    TestPresenter testPresenter;

    Intent intent;


    //UI
    ImageView imageArrow;
    TextView textCurrentQuestion;
    ImageView imageCloseTextQuestion;
    ImageView imageCurrentQuestion;

    ProgressBar progressCurrentTest;


    Button buttonNext;

    Button buttonAnswer1;
    Button buttonAnswer2;
    Button buttonAnswer3;


    //для тулбара
    ActionBar actionBar;


    // окно - закрыть тест или нет
    AlertDialog.Builder builder;


    // сообщение про стрелку
    AlertDialog.Builder builderMessageArrow;


    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_activity);


        actionBar = getSupportActionBar();


        //для стрелки назад
        actionBar.setHomeButtonEnabled(true);       //показ
        actionBar.setDisplayHomeAsUpEnabled(true);  //включена




        //init UI
        imageArrow = findViewById(R.id.imageArrow);
        textCurrentQuestion = findViewById(R.id.textCurrentQuestion);
        imageCloseTextQuestion = findViewById(R.id.imageCloseTextQuestion);
        imageCurrentQuestion = findViewById(R.id.imageCurrentQuestion);

        progressCurrentTest = findViewById(R.id.progressCurrentTest);

        buttonNext = findViewById(R.id.buttonNext);

        buttonAnswer1 = findViewById(R.id.buttonAnswer1);
        buttonAnswer2 = findViewById(R.id.buttonAnswer2);
        buttonAnswer3 = findViewById(R.id.buttonAnswer3);


        // начальные условия
        textCurrentQuestion.setVisibility(View.GONE);
        imageCloseTextQuestion.setVisibility(View.GONE);

        // изначально некликабельна
        buttonNext.setClickable(false);
    }



    // передать презентеру выбранный в меню тест для загрузки
    @Override
    public void sendSelectedTestId() {

        intent = getIntent();

        int id = Objects.requireNonNull(intent.getExtras()).getInt("id");

            // запускается загрузка данных для макета
            testPresenter.LoadDataTest(id);
    }



    @Override
    public void onLoadDataToLayout(Question question) {


        Glide
                .with(this)
                .load(question.picture)
                .into(imageCurrentQuestion);

        textCurrentQuestion.setText(question.text);
        buttonAnswer1.setText(question.answer1);
        buttonAnswer2.setText(question.answer2);
        buttonAnswer3.setText(question.answer3);
    }





    // переход к результатам и передача количества правильных ответов
    @Override
    public void onGoToResultScreen(int quantityTrueAnswers) {
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putExtra("quantityTrueAnswers", quantityTrueAnswers);
        startActivity(intent);
    }



    //цвет ответов
    @Override
    public void onColorButtons(int idButton, Boolean check) {

        // если правильный ответ
        if (check){

            switch (idButton){

                case R.id.buttonAnswer1:
                    buttonAnswer1.setBackgroundResource(R.color.correct_answer);
                    break;

                case R.id.buttonAnswer2:
                    buttonAnswer2.setBackgroundResource(R.color.correct_answer);
                    break;

                case R.id.buttonAnswer3:
                    buttonAnswer3.setBackgroundResource(R.color.correct_answer);
                    break;
            }
        }

        // если неверный ответ
        else {
            switch (idButton){

                case R.id.buttonAnswer1:
                    buttonAnswer1.setBackgroundResource(R.color.incorrect_answer);
                    break;

                case R.id.buttonAnswer2:
                    buttonAnswer2.setBackgroundResource(R.color.incorrect_answer);
                    break;

                case R.id.buttonAnswer3:
                    buttonAnswer3.setBackgroundResource(R.color.incorrect_answer);
                    break;
            }
        }
    }



    // прогресс бар
    @Override
    public void onChangedProgressBar(int progress) {
            progressCurrentTest.setProgress(progress);
    }



    @Override
    public void initProgressBar(int max) {
        progressCurrentTest.setMax(max);
    }




    // тут нужно закрашивать кнопки!!!!!!!


    //настройка кнопок
    @Override
    public void settingButton(Boolean setting) {

        if (setting){
            buttonNext.setClickable(true);
            buttonNext.setBackgroundResource(R.color.true_button_next);
            buttonNext.setOnClickListener(v -> testPresenter.nextQuestion());

            // все кнопки ответов недоступны после выбора ответа
            buttonAnswer1.setClickable(false);
            buttonAnswer2.setClickable(false);
            buttonAnswer3.setClickable(false);
        }

        else {
            buttonNext.setBackgroundResource(R.color.false_button_next);
            buttonNext.setClickable(false);

            buttonAnswer1.setClickable(true);
            buttonAnswer2.setClickable(true);
            buttonAnswer3.setClickable(true);
        }

    }



    // дефолтный фон кнопок
    @Override
    public void onRestoreDefaultColor() {

        buttonAnswer1.setBackgroundResource(R.color.default_answer);
        buttonAnswer2.setBackgroundResource(R.color.default_answer);
        buttonAnswer3.setBackgroundResource(R.color.default_answer);
    }





    // заголовок - название теста
    @Override
    public void setTitleActivity(String name) {
        setTitle(name);
    }




    // сообщение клик по стрелке
    @Override
    public void showMessageAboutArrow() {

        builderMessageArrow = new AlertDialog.Builder(this);

        builderMessageArrow.setMessage(R.string.message_about_arrow)
                .setPositiveButton("ок", (dialog, which) -> dialog.cancel());

        builderMessageArrow.create();
        builderMessageArrow.show();
    }


    // передача презентеру выбранного ответа
    public void onClickAnswer(View view) {

        switch (view.getId()){

            case R.id.buttonAnswer1:
                testPresenter.onClick(0, R.id.buttonAnswer1);
                break;

            case R.id.buttonAnswer2:
                testPresenter.onClick(1, R.id.buttonAnswer2);
                break;

            case R.id.buttonAnswer3:
                testPresenter.onClick(2, R.id.buttonAnswer3);
                break;
        }
    }


    // отображение текста
    public void showTextQuestion(View view) {

        switch (view.getId()){

            // показать
            case R.id.imageArrow:

                imageArrow.setVisibility(View.GONE);
                textCurrentQuestion.setVisibility(View.VISIBLE);
                imageCloseTextQuestion.setVisibility(View.VISIBLE);
                break;

            //скрыть
            case R.id.imageCloseTextQuestion:

                imageArrow.setVisibility(View.VISIBLE);
                textCurrentQuestion.setVisibility(View.GONE);
                imageCloseTextQuestion.setVisibility(View.GONE);
                break;
        }
    }


    // для кнопки Назад
    @Override
    public void onBackPressed() {
        //super.onBackPressed();    // закоментил - перекрыл кнопку Назад

        showAlertDialog();
    }



    // для стрелки Назад в тулбаре
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        switch (item.getItemId()){

            case android.R.id.home:

                showAlertDialog();
                break;
        }

        return true;
    }



    //алерт диалог о закрытии теста
    void showAlertDialog(){
        builder = new AlertDialog.Builder(this);
        builder.setTitle("Вы действительно хотите завершить тест?");

        builder.setPositiveButton("да", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                NavUtils.navigateUpFromSameTask(TestActivity.this);
            }
        });

        builder.setNegativeButton("нет", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

                //ничего
            }
        });

        builder.setCancelable(false);   //чтоб нельзя было закрыть диалог с кнопки Назад
        builder.setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public void onCancel(DialogInterface dialog) {
                Toast.makeText(TestActivity.this, "выберите действие", Toast.LENGTH_SHORT).show();
            }
        });
        builder.create();
        builder.show();
    }


}
