package com.example.david.tapple.feature;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.support.annotation.NonNull;


@Entity(tableName = "teacher")
public class teacher {

    @NonNull
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name="id")
    public int id;
    @ColumnInfo(name="dni")
    public String dni;
    @ColumnInfo(name="user")
    public String user;
    @ColumnInfo(name="password")
    public String password;
    @ColumnInfo(name="name")
    public String name;
    @ColumnInfo(name="surname1")
    public String surname1;
    @ColumnInfo(name="surname2")
    public String surname2;
   // public final date birthday;
   @ColumnInfo(name="email")
    public String email;


   @Ignore
    public teacher(int id, String dni, String user, String password, String name, String surname1, String surname2, String email){
        this.id = id;
        this.dni = dni;
        this.user=user;
        this.password=password;
        this.name=name;
        this.surname1=surname1;
        this.surname2=surname2;
        this.email=email;
    }

    @NonNull
    public int getId() {
        return id;
    }

    public void setId(@NonNull int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname1() {
        return surname1;
    }

    public void setSurname1(String surname1) {
        this.surname1 = surname1;
    }

    public String getSurname2() {
        return surname2;
    }

    public void setSurname2(String surname2) {
        this.surname2 = surname2;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
