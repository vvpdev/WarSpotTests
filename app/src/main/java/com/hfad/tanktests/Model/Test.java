package com.hfad.tanktests.Model;


import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Test {

    @PrimaryKey
    int id;

    String name;

    int picture;

    String description;
}
