package com.hfad.tanktests.Model;
import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.hfad.tanktests.utils.Utils;

// база данных

@Database(entities = {User.class, Question.class, Test.class}, version = Utils.DATE_BASE_VERSION, exportSchema = false)

    public abstract class DateBase extends RoomDatabase {

            // анонимный класс
        public abstract DAO dao();

            // интсанс БД
        private static DateBase instance;


        // получение инстанса
    public static DateBase getInstance(Context context){

        if (instance == null){

            instance = buildDataBase(context); // создать новый объект

        }

        return instance;
    }


        // первоначальное заполнение БД
    private static DateBase buildDataBase(Context context) {

        return Room.databaseBuilder(context,
                                    DateBase.class,
                                    Utils.DATE_BASE_NAME)
                                    .fallbackToDestructiveMigration()          // удалить/очистить предыдущую базу данных
                                    .build();

    }








}
