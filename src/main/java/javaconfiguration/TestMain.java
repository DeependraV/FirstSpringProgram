package javaconfiguration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(javaconfig.class);
       //using @Configuration and @ComponentScan
        System.out.println("------------using @Configuration and @ComponentScan--------------");
        Student student=(Student) context.getBean("student");
        System.out.println(student);
        student.show("Testing @Configuration and @ComponentScan");

        System.out.println("--------------using @Bean---------------");
        //using @Bean with dependency of Name in Student class
        Student student1=context.getBean("getStudent", Student.class);
        student1.show("testing @Bean");
        System.out.println(student1);

        //with manual entered Name  @Bean(name = {"name1","name2"})
        System.out.println("---------------@Bean(name = {name1,name2}-------------");
        Name name1=context.getBean("name2", Name.class);
        System.out.println(name1);
    }
}
