package com.hfad.tanktests.Model;


    // класс для объекта User

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class User {

    @PrimaryKey(autoGenerate = true) 
    int id;

    public String name;

    public String password;
}
