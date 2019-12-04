package com.hfad.tanktests.Model;


import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Test {

    @PrimaryKey //(autoGenerate = true)
    public int id;

    public String name;

    public int picture;

    public String description;

    public int status;       // количество правильных ответов
}
