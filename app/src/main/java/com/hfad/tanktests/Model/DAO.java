package com.hfad.tanktests.Model;


    // интерфейс для работы с Room

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.hfad.tanktests.utils.Utils;

import java.util.List;

@Dao
public interface DAO {

    //_____________________________________________________________________________________________
    // для работы с таблицей User
    //_____________________________________________________________________________________________

    @Query("SELECT * FROM " + Utils.TABLE_NAME_USERS)
    List <User> getAll();
                                                        // столбец - нужное значение
    @Query("SELECT * FROM " + Utils.TABLE_NAME_USERS + " WHERE id = :id")
    User getById(int id);
                                                        // столбец - нужное значение
    @Query("SELECT * FROM " + Utils.TABLE_NAME_USERS + " WHERE name = :name")
    User getByName(String name);

    @Insert
    void insert(User user);

    @Update
    void update(User user);

    @Delete
    void delete(User user);


    //_____________________________________________________________________________________________
    //    // для работы с таблицей Question
    //_____________________________________________________________________________________________

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insertQuestion(Question question);

    @Query("SELECT * FROM " + Utils.TABLE_NAME_QUESTIONS + " WHERE id = :id")
    Question getQuestionById(int id);


    @Query("SELECT * FROM " + Utils.TABLE_NAME_QUESTIONS + " WHERE id_Test = :id")
    List <Question> getAllQuestionsByTestId(int id);


    //_____________________________________________________________________________________________
    //    // для работы с таблицей Test
    //_____________________________________________________________________________________________

    @Insert
    void insertTest(Test test);

    @Query("SELECT * FROM " + Utils.TABLE_NAME_TEST + " WHERE id = :id")
    Test getTestById(int id);


    @Query("SELECT * FROM " + Utils.TABLE_NAME_TEST)
    List <Test> getAllTest();


    // обновление статуса теста
    @Query ("UPDATE " + Utils.TABLE_NAME_TEST + " SET status = :newStatus WHERE id = :id")
    void changeStatusTest(int newStatus, int id);

    //запросить текущий статус теста
    @Query("SELECT status FROM " + Utils.TABLE_NAME_TEST + " WHERE id = :id")
    int getStatusTest(int id);



}
