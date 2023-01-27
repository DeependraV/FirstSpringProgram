package org.example.firstproject.Ref;

import javax.swing.*;

public class B {
    private  String name;
    private  String number;

    public B() {
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public B(String name, String number) {
        this.name = name;
        this.number = number;
    }
    @Override
    public String toString() {
        return "B{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
