package org.example.firstproject.LifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class AnnotationLifeCycle {
    private int price;

    @PostConstruct
    public  void start()
    {
        System.out.println("This is init method for Annotation based  ");
    }
    @PreDestroy
    public void end()
    {
        System.out.println("This is destroy Method for Annotation based");
    }
    @Override
    public String toString() {
        return "AnnotationLifeCycle{" +
                "price=" + price +
                '}';
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        System.out.println("This is setter method");
        this.price = price;
    }

    public AnnotationLifeCycle() {
    }
}
