 package com.example.demoroomdatabase;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Student {
    @PrimaryKey
    public int id;
    @ColumnInfo(name="fname")
    public String name;
}
