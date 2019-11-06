package com.hfad.tanktests.Data;


    // класс для ответов

import io.realm.RealmObject;
import io.realm.annotations.Required;

public class AnswerObject extends RealmObject {

    @Required
    int idQuestionForAnswer;         // id вопроса
    int idAnswer;                    // id самого ответа
    String answerText;               // сам текст ответа


    public AnswerObject(int idQuestionForAnswer, int idAnswer, String answerText) {
        this.idQuestionForAnswer = idQuestionForAnswer;
        this.idAnswer = idAnswer;
        this.answerText = answerText;
    }

    public void setIdQuestionForAnswer(int idQuestionForAnswer) {
        this.idQuestionForAnswer = idQuestionForAnswer;
    }

    public void setIdAnswer(int idAnswer) {
        this.idAnswer = idAnswer;
    }

    public void setAnswerText(String answerText) {
        this.answerText = answerText;
    }


    public int getIdQuestionForAnswer() {
        return idQuestionForAnswer;
    }

    public int getIdAnswer() {
        return idAnswer;
    }

    public String getAnswerText() {
        return answerText;
    }
}
