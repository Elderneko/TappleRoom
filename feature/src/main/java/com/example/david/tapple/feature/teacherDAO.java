package com.example.david.tapple.feature;
import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public class teacherDAO {

    @Query("SELECT * FROM teacher WHERE dni=:teacherDni")
    <teacher> getTeacherByDni(String dni);

    @Query("SELECT * FROM teacher")
    <List<teacher>> getAllUsers();

    @Insert
    void insertTeacher(Teacher... teachers);

}
