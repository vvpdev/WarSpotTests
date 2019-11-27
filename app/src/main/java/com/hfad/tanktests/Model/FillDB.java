package com.hfad.tanktests.Model;


        // класс для фонового потока заполнения таблицы с вопросами

import android.util.Log;

import com.hfad.tanktests.R;
import com.hfad.tanktests.utils.ContextApp;

public class FillDB implements Runnable{

    // сохранение

    @Override
    public void run() {

        //__________________________________________________________________________________________
        //заполнение таблицы Question
        //__________________________________________________________________________________________

        Question question1 = new Question();
        question1.id = 0;
        question1.id_Test = 0;
        question1.text = "Этот 14-тонный танк, вооружённый 75-мм орудием и двумя 8-мм пулемётами";
        question1.picture = R.drawable.picture1_1;
        question1.answer1 = "Германский A7V";
        question1.answer2 = "Французский Schneider CA1";
        question1.answer3 = "Итальянский Fiat 2000";
        question1.true_answer = question1.answer2;

        DateBase.getInstance(ContextApp.getInstance()).dao().insertQuestion(question1);


        Question question2 = new Question();
        question2.id = 1;
        question2.id_Test = 0;
        question2.text = "Ещё один 14-тонный танк с четырьмя 7,7-мм пулемётами. Это";
        question2.picture = R.drawable.picture1_2;
        question2.answer1 = "Британский Medium Mark A Whippet";
        question2.answer2 = "Германский Leichter Kampfwagen I";
        question2.answer3 = "Французский Renault FT";
        question2.true_answer = question2.answer1;

        DateBase.getInstance(ContextApp.getInstance()).dao().insertQuestion(question2);


        Question question3 = new Question();
        question3.id = 2;
        question3.id_Test = 0;
        question3.text = "Этот созданный как дешёвая альтернатива для Renault FT с широким применением автомобильных агрегатов лёгкий танк";
        question3.picture = R.drawable.picture1_3;
        question3.answer1 = "Германский K-Wagen";
        question3.answer2 = "Французский Char Frot-Turmel-Laffly";
        question3.answer3 = "Американский Ford 3-Ton M1918";
        question3.true_answer = question3.answer3;

        DateBase.getInstance(ContextApp.getInstance()).dao().insertQuestion(question3);


        //__________________________________________________________________________________________
        //заполнение таблицы Test
        //__________________________________________________________________________________________

        //первый тест
        Test test1 = new Test();
        test1.id = 0;
        test1.name = "На заре танковой эры";
        test1.picture = R.drawable.test1_cover;
        test1.description = "Попробуйте по фотографиям идентифицировать 10 гусеничных боевых машин, созданных в годы Первой мировой войны, когда многие из них ещё здорово отличались от привычных нам танков";

        DateBase.getInstance(ContextApp.getInstance()).dao().insertTest(test1);

        Log.i("my_teg", "(FillDB) БД заполнена!");

    }

}
