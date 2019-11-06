package com.hfad.tanktests.Data;


        // класс для вопросов


import io.realm.RealmObject;
import io.realm.annotations.Required;

public class QuestionObject extends RealmObject {

        @Required
        int idQuestion;                 // id самого вопроса

        int idTest;                     // id теста
        int resourcePicture;            // путь к картинке
        String textQuestion;            // текст вопроса
        int idTrueAnswer;               // id правильного ответа


        // конструктор
        public QuestionObject(int idQuestion, int idTest, int resourcePicture, String textQuestion, int idTrueAnswer) {
                this.idQuestion = idQuestion;
                this.idTest = idTest;
                this.resourcePicture = resourcePicture;
                this.textQuestion = textQuestion;
                this.idTrueAnswer = idTrueAnswer;
        }

        public void setIdQuestion(int idQuestion) {
                this.idQuestion = idQuestion;
        }

        public void setIdTest(int idTest) {
                this.idTest = idTest;
        }

        public void setResourcePicture(int resourcePicture) {
                this.resourcePicture = resourcePicture;
        }

        public void setTextQuestion(String textQuestion) {
                this.textQuestion = textQuestion;
        }

        public void setIdTrueAnswer(int idTrueAnswer) {
                this.idTrueAnswer = idTrueAnswer;
        }

        public int getIdQuestion() {
                return idQuestion;
        }

        public int getIdTest() {
                return idTest;
        }

        public int getResourcePicture() {
                return resourcePicture;
        }

        public String getTextQuestion() {
                return textQuestion;
        }

        public int getIdTrueAnswer() {
                return idTrueAnswer;
        }
}





