package com.example.a9onhud.listviewwithdbapplication;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity(tableName = "person")
public class Person {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "first_name")
    private String firstName;
    @ColumnInfo(name = "nick_name")
    private String nickname;
    @ColumnInfo(name = "last_name")
    private String lastName;

    public Person(String firstName, String nickname, String lastName) {
        this.firstName = firstName;
        this.nickname = nickname;
        this.lastName = lastName;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
