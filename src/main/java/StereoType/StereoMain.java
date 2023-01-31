package StereoType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StereoMain {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("StreoType/streoconfig.xml");
        Address address=context.getBean("address1", Address.class);
        System.out.println(address);
        Employee employee=context.getBean("employee", Employee.class);
        System.out.println(employee);

        //prototype Scope
        System.out.println(address.hashCode());
        Address address2=context.getBean("address1", Address.class);
        System.out.println(address2.hashCode());
    }
}
