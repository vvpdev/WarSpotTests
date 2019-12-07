package com.hfad.tanktests.utils;


// класс для хранения констант
public class Utils {

    // чтоб не создать объект этого класса
    private Utils() {
    }


        // названия таблиц должны соответствовать классам Entity


        public static final String DATE_BASE_NAME = "datebase";
        public static final int DATE_BASE_VERSION = 7;

        // таблица User
        public static final String TABLE_NAME_USERS = "user";

        // таблица Question
        public static final String TABLE_NAME_QUESTIONS = "question";

        // таблица Question
        public static final String TABLE_NAME_TEST = "test";

}
