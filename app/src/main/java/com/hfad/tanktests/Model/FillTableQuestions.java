package com.hfad.tanktests.Model;




        // класс для фонового потока заполнения таблицы с вопросами

import com.hfad.tanktests.InputScreen.InputActivity;
import com.hfad.tanktests.R;

public class FillTableQuestions implements Runnable{


    @Override
    public void run() {

        Question question1 = new Question();
        question1.id = 1;
        question1.id_Test = 1;
        question1.text = "Этот 14-тонный танк, вооружённый 75-мм орудием и двумя 8-мм пулемётами";
        question1.picture = R.drawable.picture1_1;
        question1.answer1 = "Германский A7V";
        question1.answer2 = "Французский Schneider CA1";
        question1.answer3 = "Итальянский Fiat 2000";
        question1.true_answer = question1.answer2;

        DateBase.getInstance(InputActivity.context).dao().insertQuestion(question1);


        Question question2 = new Question();
        question2.id = 2;
        question2.id_Test = 1;
        question2.text = "Ещё один 14-тонный танк с четырьмя 7,7-мм пулемётами. Это";
        question2.picture = R.drawable.picture1_2;
        question2.answer1 = "Британский Medium Mark A Whippet";
        question2.answer2 = "Германский Leichter Kampfwagen I";
        question2.answer3 = "Французский Renault FT";
        question2.true_answer = question2.answer1;

        DateBase.getInstance(InputActivity.context).dao().insertQuestion(question2);


        Question question3 = new Question();
        question3.id = 3;
        question3.id_Test = 1;
        question3.text = "Этот созданный как дешёвая альтернатива для Renault FT с широким применением автомобильных агрегатов лёгкий танк";
        question3.picture = R.drawable.picture1_3;
        question3.answer1 = "Германский K-Wagen";
        question3.answer2 = "Французский Char Frot-Turmel-Laffly";
        question3.answer3 = "Американский Ford 3-Ton M1918";
        question3.true_answer = question3.answer3;

        DateBase.getInstance(InputActivity.context).dao().insertQuestion(question3);

    }




}
