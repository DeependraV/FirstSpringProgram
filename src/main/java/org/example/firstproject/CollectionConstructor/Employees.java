package org.example.firstproject.CollectionConstructor;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Employees {
    private String name;
    private int number;



    public Employees() {
    }

    public Employees(String name, int number) {
        this.name = name;
        this.number = number;
    }
    @Override
    public String toString() {
        return "Employees{" +
                "name='" + name + '\'' +
                ", number=" + number +
                '}';
    }
}
