package com.hfad.tanktests.Model;


import androidx.room.Entity;
import androidx.room.PrimaryKey;

// класс для объекта Question


@Entity

public class Question {


    @PrimaryKey
    public int id;             // id самого вопроса

    public int id_Test;        // id теста, к оторому относится вопрос (для выборки)

    public String text;

    public int picture;

    public String answer1;

    public String answer2;

    public String answer3;

    public String true_answer;


    public int getId() {
        return id;
    }

    public int getId_Test() {
        return id_Test;
    }

    public String getText() {
        return text;
    }

    public int getPicture() {
        return picture;
    }

    public String getAnswer1() {
        return answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public String getTrue_answer() {
        return true_answer;
    }
}
