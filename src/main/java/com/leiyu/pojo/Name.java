package com.leiyu.pojo;

import java.awt.*;

public class Name {
    private String name;
    private String surname;

    @Override
    public String toString() {
        return "Name{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
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

    public Name() {
    }

    public Name(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
