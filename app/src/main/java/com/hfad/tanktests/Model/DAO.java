package com.hfad.tanktests.Model;


    // интерфейс для работы с Room

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.hfad.tanktests.Utils;

import java.util.List;

@Dao
public interface DAO {

    //_____________________________________________________________________________________________
    // для работы с таблицей Users
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
    //    // для работы с таблицей Questions
    //    //_____________________________________________________________________________________________


    @Insert
    void insertQuestion(Question question);


    @Query("SELECT * FROM " + Utils.TABLE_NAME_QUESTIONS + " WHERE id = :id")
    Question getQuestionById(int id);

}
