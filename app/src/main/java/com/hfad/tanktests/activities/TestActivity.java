package com.hfad.tanktests.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;
import com.hfad.tanktests.R;
import com.hfad.tanktests.interfaces.TestInterface;
import com.hfad.tanktests.presenters.TestPresenter;


        // экран с тестом

        // тулбар - номер вопроса

public class TestActivity extends MvpAppCompatActivity implements TestInterface {


    @InjectPresenter
    TestPresenter testPresenter;

    Intent intent;


    //UI
    ImageView imageArrow;
    LinearLayout backgroundLayout;
    TextView textCurrentQuestion;
    ImageView imageCloseTextQuestion;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_activity);


        imageArrow = findViewById(R.id.imageArrow);
        backgroundLayout = findViewById(R.id.backgroudLayout);
        textCurrentQuestion = findViewById(R.id.textCurrentQuestion);
        imageCloseTextQuestion = findViewById(R.id.imageCloseTextQuestion);


        textCurrentQuestion.setText("Этот 14-тонный танк, вооружённый 75-мм орудием и двумя 8-мм пулемётами");


        // начальные условия
        backgroundLayout.setVisibility(View.GONE);
        textCurrentQuestion.setVisibility(View.GONE);
        imageCloseTextQuestion.setVisibility(View.GONE);
    }



    // передать презентеру выбранный в меню тест для загрузки
    @Override
    public void sendSelectedTestId() {

        intent = getIntent();

        int id = intent.getExtras().getInt("id");

        testPresenter.LoadDataTest(id);
    }





    @Override
    public void onClickAnswer() {

    }




    // отображение текста
    public void showTextQuestion(View view) {

        int id = view.getId();

        switch (id){

            // показать
            case R.id.imageArrow:

                imageArrow.setVisibility(View.GONE);
                backgroundLayout.setVisibility(View.VISIBLE);
                textCurrentQuestion.setVisibility(View.VISIBLE);
                imageCloseTextQuestion.setVisibility(View.VISIBLE);
                break;

            //скрыть
            case R.id.imageCloseTextQuestion:

                imageArrow.setVisibility(View.VISIBLE);
                backgroundLayout.setVisibility(View.GONE);
                textCurrentQuestion.setVisibility(View.GONE);
                imageCloseTextQuestion.setVisibility(View.GONE);
                break;
        }
    }
}
