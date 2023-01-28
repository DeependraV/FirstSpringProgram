package org.example.firstproject;

import org.example.firstproject.CollectionBeans.Employees;
import org.example.firstproject.Ref.A;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        System.out.println("Hello World!");

        //Primitive Data type Dependency Injection
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Student student1 = (Student) context.getBean("Student1");
        System.out.println(student1);
        Student student2 = (Student) context.getBean("Student2");
        System.out.println(student2);

        //Collection Config
        System.out.println("-----------------------Collection-----------------------");
        ApplicationContext context2=new ClassPathXmlApplicationContext("collectionConfig.xml");
        Employees emp=(Employees)context2.getBean("Employee1");
        System.out.println(emp);

        //Reference Config
        System.out.println("---------------------Reference Config-------------------");
        ApplicationContext context3 =new ClassPathXmlApplicationContext("refConfig.xml");
        A a=(A) context3.getBean("A1");
        System.out.println(a);

        //constructor Collection config
        System.out.println("-------------------------constructor------------------");
        ApplicationContext context4 = new ClassPathXmlApplicationContext("constructorConfig.xml");
        Employees employee = (Employees) context4.getBean("conemp");
        System.out.println(employee);


    }
}
