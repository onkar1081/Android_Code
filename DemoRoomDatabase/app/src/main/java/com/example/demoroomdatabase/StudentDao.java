package com.example.demoroomdatabase;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface StudentDao {
    @Insert
    public void save(Student ob);
    @Delete
    public void delete(Student ob);
    @Update
    public void update(Student ob);
    @Query("select * from student where id=:id")
    public Student getStudent(int id);
}
