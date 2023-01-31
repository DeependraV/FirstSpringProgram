package autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employees {


    private Address address;

    public Address getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "address=" + address +
                '}';
    }

    public Employees(Address address) {
        System.out.println("Employee Constructor");
        this.address = address;
    }

    @Autowired
    public void setAddress(Address address) {
        System.out.println("Employee setter");
        this.address = address;


    }
}
