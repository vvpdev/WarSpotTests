package com.hfad.tanktests.presenters;


import android.content.SharedPreferences;
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
    private List<Question> questionList = new ArrayList<>();


    //конструтор
    public TestPresenter() {
        getViewState().sendSelectedTestId();
    }


    // номер текущего вопроса
    private int number = 0;

    // количество правильных ответов
    private int quantityTrueAnswers = 0;

    //выбранный ответ
    private String selectedAnswer;

    // название теста
    private String nameTest;


    //номер теста
    private int idTest;


    //для чтения и записи текущих статусов
    SharedPreferences sharedPreferencesTest;


    //после передачи id теста от активити к презентеру
    // загружам данные для выбранного теста из БД
    // далее - кидаем данные на макет
    public void LoadDataTest(int id) {

        idTest = id;

        //Когда Handler создается, он может получить объект Looper в конструкторе, который указывает,
        // к какому потоку он прикреплен. Если вы хотите использовать Handler, прикрепленный к основному
        // потоку, вам нужно использовать looper, связанный с основным потоком, вызывая Looper.getMainLooper().
        // В этом случае для обновления пользовательского интерфейса из фонового потока вы можете
        // создать Handler, подключенный к потоку пользовательского интерфейса, а затем опубликовать
        // действие как Runnable:


        Runnable runnable = () -> {

            questionList = DateBase.getInstance(ContextApp.getInstance()).dao().getAllQuestionsByTestId(id);

            nameTest = DateBase.getInstance(ContextApp.getInstance()).dao().getTestById(id).name;
        };



        Handler handler = new Handler (Looper.getMainLooper());


        // загрузить начальное состояние - первый вопрос
        handler.post(() -> {
            getViewState().onLoadDataToLayout(questionList.get(number));

            getViewState().initProgressBar(questionList.size());

            getViewState().setTitleActivity(nameTest);


            if (!ContextApp.checkMessageArrow()){    // если еще не показывалось сообщение
                getViewState().showMessageAboutArrow();
            }
        });

        Thread thread = new Thread(runnable);
        thread.start();
    }


    // обработка нажатий на кнопки ответов
    public void onClick(int answerId, int idSelectedButton){

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
            getViewState().onColorButtons(idSelectedButton, false);
        }

        //настройка кликабельности кнопок - "Далее" кликабельна, остальные - нет
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


            // сменить статус теста
            setStatusFromNewThread();

            getViewState().onGoToResultScreen(quantityTrueAnswers);
        }

            // кнопка Далее снова недоступна, пока не выбран ответ
            getViewState().settingButton(false);
    }




    // задать статус теста в новом потоке
    private void setStatusFromNewThread(){

        new Thread(){

            @Override
            public void run() {
                super.run();


                    int oldStatus = DateBase.getInstance(ContextApp.getInstance()).dao().getStatusTest(idTest);

                    //если новое количество ответов больше чем было, то записываем в БД
                    if (quantityTrueAnswers > oldStatus){

                        DateBase.getInstance(ContextApp.getInstance()).dao().changeStatusTest(quantityTrueAnswers, idTest);
                    }

            }

        }.start();
    }



}
