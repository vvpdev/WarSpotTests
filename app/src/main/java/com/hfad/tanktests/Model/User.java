package com.hfad.tanktests.Model;


    // класс для объекта User

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class User {

    @PrimaryKey(autoGenerate = true)    // автоинкремент
    int id;

    public String name;

    public String password;
}
