package org.example.firstproject.LifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Pepsi implements InitializingBean, DisposableBean {
    private int price;

    @Override
    public String toString() {
        return "Pepsi{" +
                "price=" + price +
                '}';
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        System.out.println("setter called");
        this.price = price;
    }

    public Pepsi() {
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("This is init method");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("this is Destroy method");
    }
}
