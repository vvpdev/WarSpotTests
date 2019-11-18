package com.hfad.tanktests.Model;
import android.content.Context;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import com.hfad.tanktests.Utils;

// база данных

@Database(entities = {User.class, Question.class}, version = Utils.DATE_BASE_VERSION, exportSchema = false)

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
                                    .addCallback(new Callback() {
                                        @Override
                                        public void onCreate(@NonNull SupportSQLiteDatabase db) {
                                            super.onCreate(db);

                                            // заполнение в фоне
                                            FillTableQuestions fillTableQuestions = new FillTableQuestions();
                                            Thread thread = new Thread(fillTableQuestions);
                                            thread.start();

                                        }
                                    }).build();

    }

}
