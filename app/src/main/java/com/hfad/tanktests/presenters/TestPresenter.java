package com.hfad.tanktests.presenters;


import android.os.Handler;
import android.os.Looper;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;
import com.hfad.tanktests.Model.DateBase;
import com.hfad.tanktests.Model.Question;
import com.hfad.tanktests.interfaces.TestInterface;
import com.hfad.tanktests.utils.ContextApp;

import java.util.ArrayList;
import java.util.List;

@InjectViewState
public class TestPresenter extends MvpPresenter <TestInterface> {


    //массив для вопросов текущего теста
    List<Question> questionList = new ArrayList<>();

    public TestPresenter() {
        getViewState().sendSelectedTestId();
    }

    // номер текущего вопроса
    int number = 0;

    // количество правильных ответов
    int quantityTrueAnswers = 0;

    //выбранный ответ
    String selectedAnswer;


    //после передачи id теста от активити к презентеру
    // загружам данные для выбранного теста из БД
    // далее - кидаем данные на макет
    public void LoadDataTest(int id) {

        //Когда Handler создается, он может получить объект Looper в конструкторе, который указывает,
        // к какому потоку он прикреплен. Если вы хотите использовать Handler, прикрепленный к основному
        // потоку, вам нужно использовать looper, связанный с основным потоком, вызывая Looper.getMainLooper().
        // В этом случае для обновления пользовательского интерфейса из фонового потока вы можете
        // создать Handler, подключенный к потоку пользовательского интерфейса, а затем опубликовать
        // действие как Runnable:


        Runnable runnable = () -> questionList = DateBase.getInstance(ContextApp.getInstance()).dao().getAllQuestionsByTestId(id);

        Handler handler = new Handler (Looper.getMainLooper());


        // загрузить начальное состояние - первый вопрос
        handler.post(() -> {
            getViewState().onLoadDataToLayout(questionList.get(number));


            getViewState().initProgressBar(questionList.size());
        });

        Thread thread = new Thread(runnable);
        thread.start();
    }


    // обработка нажатий на кнопки ответов
    public void onClick(int answerId, int idSelectedButton){

        // цвета для отеветов!!!!!

        //текст ответа
        selectedAnswer = null;

        switch (answerId){

            case (0):
                selectedAnswer = questionList.get(number).answer1;
                break;

            case (1):
                selectedAnswer = questionList.get(number).answer2;
                break;

            case (2):
                selectedAnswer = questionList.get(number).answer3;
                break;
        }


        // проверка ответа
        if (questionList.get(number).true_answer.equals(selectedAnswer)) {

            quantityTrueAnswers = quantityTrueAnswers + 1;
            getViewState().onColorButtons(idSelectedButton, true);
        }

        else {

        }

        //настройка кликабельности кнопок - Далее кликабельна, остальные - нет
        getViewState().settingButton(true);

    }



    // для перехода к след вопросу
    public void nextQuestion(){

        //восстанавливаем дефолтный фон кнопок
        getViewState().onRestoreDefaultColor();

        // обновляем прогресс бар
        getViewState().onChangedProgressBar(number + 1);

        // увеличить number вопроса
        number = number + 1;

        if (number < questionList.size()){

            //загружаем следующий вопрос
            getViewState().onLoadDataToLayout(questionList.get(number));
        }

        //если нет - то тест закончен, переход к экрану результата
        else {
            getViewState().onGoToResultScreen(quantityTrueAnswers);
        }

            // кнопка Далее снова недоступна, пока не выбран ответ
            getViewState().settingButton(false);
    }





    // настройки для прогресс бара
    public int setMaxItem(){

        int quantytiQuestions = questionList.size();
        return quantytiQuestions;
    }



}
