package org.example.firstproject.LifeCycle;

public class Samosa {
    private String price;

    public Samosa() {
    }

    public void init()
    {
        System.out.println("This is init method");
    }
    public  void destroy()
    {
        System.out.println("This is destroy Method");
    }
    @Override
    public String toString() {
        return "Samosa{" +
                "price='" + price + '\'' +
                '}';
    }

    public String getPrice() {
        System.out.println("Getter called");
        return price;
    }

    public void setPrice(String price) {
        System.out.println("Setter Called");
        this.price = price;
    }
}
