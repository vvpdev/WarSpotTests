package com.hfad.tanktests.presenters;


import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;
import com.hfad.tanktests.Model.DateBase;
import com.hfad.tanktests.Model.Question;
import com.hfad.tanktests.interfaces.TestInterface;
import com.hfad.tanktests.utils.ContextApp;

import java.util.List;

@InjectViewState
public class TestPresenter extends MvpPresenter <TestInterface> {


    //массив для вопросов текущего теста
    List<Question> questionList;


    // количество вопросов в тесте = size массива!!!!!!!!

    public TestPresenter() {
        getViewState().sendSelectedTestId();
    }


    // загрузка данных для теста
    public void LoadDataTest(int id){

        Runnable runnable = () -> {

        questionList = DateBase.getInstance(ContextApp.getInstance()).dao().getAllQuestionsByTestId(id);

        // вернуть заполненный массив
        getQuestionList();

        };

        Thread thread = new Thread(runnable);
        thread.start();
    }

    public List<Question> getQuestionList() {
        return questionList;
    }





}
