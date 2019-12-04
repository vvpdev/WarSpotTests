package com.hfad.tanktests.Model;


import androidx.room.Entity;
import androidx.room.PrimaryKey;

// класс для объекта Question


@Entity

public class Question {


    @PrimaryKey
    public int id;             // id самого вопроса

    public int id_Test;        // id теста, к которому относится вопрос (для выборки)

    public String text;

    public int picture;

    public String answer1;

    public String answer2;

    public String answer3;

    public String true_answer;
}
