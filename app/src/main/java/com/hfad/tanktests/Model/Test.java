package com.hfad.tanktests.Model;


import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Test {

    @PrimaryKey
    public int id;

    public String name;

    public int picture;

    public String description;


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPicture() {
        return picture;
    }

    public String getDescription() {
        return description;
    }
}
