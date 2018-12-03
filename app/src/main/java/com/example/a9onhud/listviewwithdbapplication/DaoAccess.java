package com.example.a9onhud.listviewwithdbapplication;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

@Dao
public interface DaoAccess {

    @Insert
    void insertPerson(Person person);

    @Query("UPDATE person SET first_name = :firstName, nick_name = :nickName, last_name = :lastName WHERE id = :id")
    void updatePerson(int id, String firstName, String nickName, String lastName);

    @Query("SELECT * FROM person")
    List<Person> getPeople();
}
