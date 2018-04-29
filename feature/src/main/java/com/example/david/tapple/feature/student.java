package com.example.david.tapple.feature;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;


@Entity
public class student {

    @PrimaryKey
    public final int id;
    public final String dni;
    public final String name;
    public final String surname1;
    public final String surname2;
   // public final date birthday;
    public final String email;

    public student(int id, String dni, String name, String surname1, String surname2, String email){
        this.id = id;
        this.dni = dni;
        this.name=name;
        this.surname1=surname1;
        this.surname2=surname2;
        this.email=email;
    }


}
