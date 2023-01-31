package StereoType;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("address1")
@Scope("prototype")
public class Address {
    @Value("Maihar")
    private String city;
    @Value("485772")
    private int pincode;

    public Address() {
    }

    public Address(String city, int pincode) {
        this.city = city;
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "city='" + city + '\'' +
                ", pincode=" + pincode +
                '}';
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }
}
