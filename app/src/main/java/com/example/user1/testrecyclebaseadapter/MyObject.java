package com.example.user1.testrecyclebaseadapter;

/**
 * Created by user1 on 30.11.2016.
 */

public class MyObject {
    String name;
    String surname;
    Boolean check;

    MyObject(String name, String surname, Boolean check) {
        this.name = name;
        this.surname = surname;
        this.check = check;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Boolean getCheck() {
        return check;
    }

    public void setCheck(Boolean check) {
        this.check = check;
    }
}
