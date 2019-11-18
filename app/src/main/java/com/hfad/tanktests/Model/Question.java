package com.hfad.tanktests.Model;


import androidx.room.Entity;
import androidx.room.PrimaryKey;

// класс для объекта Question


@Entity

public class Question {


    @PrimaryKey
    int id;             // id самого вопроса

    int id_Test;        // id теста, к оторому относится вопрос (для выборки)

    String text;

    int picture;

    String answer1;

    String answer2;

    String answer3;

    String true_answer;

}
