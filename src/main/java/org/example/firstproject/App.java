package org.example.firstproject;

import org.example.firstproject.CollectionBeans.Employees;
import org.example.firstproject.LifeCycle.AnnotationLifeCycle;
import org.example.firstproject.LifeCycle.Pepsi;
import org.example.firstproject.LifeCycle.Samosa;
import org.example.firstproject.Ref.A;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
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


        //Life Cycle Testing - 2 ways -  By using Bean XML, By using Interface
        //1. By using Bean XML
        System.out.println("---------------Life Cycle Testing");
        AbstractApplicationContext context5=new ClassPathXmlApplicationContext("lifecycleconfig.xml");
        Samosa samosa= (Samosa) context5.getBean("samosa");
        //If we want to execute destroy method of Spring life cycle we have to use that hook method but
        //that is not available in ApplicatinContext Class we that is in AbstractApplicationContext
        context5.registerShutdownHook();
        System.out.println(samosa);

        //2. Interface (for init -  InitializingBean,for destroy- DisposableBean)
        System.out.println("--------Liife Cycle using Interface");
        ApplicationContext context6=new ClassPathXmlApplicationContext("lifecycleconfig.xml");
        Pepsi pepsi=(Pepsi) context6.getBean("pepsi");
        System.out.println(pepsi);

        //3.Using Annotation  @PostConstruct, @PreDestroy
        System.out.println("----------------------Annotation Based Life cycle implementation");
        AbstractApplicationContext context7=new ClassPathXmlApplicationContext("lifecycleconfig.xml");
        AnnotationLifeCycle annotationLifeCycle=(AnnotationLifeCycle) context7.getBean("ablc");
        System.out.println(annotationLifeCycle);
    }
}
