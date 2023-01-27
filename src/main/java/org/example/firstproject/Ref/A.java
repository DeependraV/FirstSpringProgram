package org.example.firstproject.Ref;

import javax.naming.Name;

public class A {
    B b;
    private  String father_name;

    public A() {
    }

    @Override
    public String toString() {
        return "A{" +
                "b=" + b +
                ", father_name='" + father_name + '\'' +
                '}';
    }

    public B getB() {
        return b;
    }

    public void setB(B b) {
        this.b = b;
    }

    public String getFather_name() {
        return father_name;
    }

    public void setFather_name(String father_name) {
        this.father_name = father_name;
    }

    public A(B b, String father_name) {
        this.b = b;
        this.father_name = father_name;
    }
}
