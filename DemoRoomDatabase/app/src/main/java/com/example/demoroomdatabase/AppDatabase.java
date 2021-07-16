package com.example.demoroomdatabase;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Student.class},version=1)
abstract public class AppDatabase extends RoomDatabase {
     public abstract StudentDao getStudentDao();
}
