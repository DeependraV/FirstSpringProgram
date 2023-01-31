package autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoMain {
    public static void main(String[] args) {

        ApplicationContext context1=new ClassPathXmlApplicationContext("autowireConfig/autowireconfig.xml");
        Employees employees=(Employees) context1.getBean("employee", Employees.class);
        System.out.println(employees);
    }
}
