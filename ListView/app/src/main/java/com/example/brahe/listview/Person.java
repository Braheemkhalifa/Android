package com.example.brahe.listview;

/**
 * Created by Brahe on 5/9/2018.
 */

public class Person {

    private String Name , Birthday , Sex;

    public Person(String name, String birthday, String sex) {
        Name = name;
        Birthday = birthday;
        Sex = sex;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getBirthday() {
        return Birthday;
    }

    public void setBirthday(String birthday) {
        Birthday = birthday;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }
}
