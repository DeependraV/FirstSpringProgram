package StereoType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class Employee {
    @Autowired
    private Address address;
    @Override
    public String toString() {
        return "Employee{" +
                "address=" + address +
                '}';
    }


    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Employee(Address address) {
        this.address = address;
    }


}
