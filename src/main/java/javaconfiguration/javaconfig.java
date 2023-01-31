package javaconfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("javaconfiguration")
public class javaconfig {
    @Bean(name = {"name1","name2"})
    public Name getName()
    {
        return new Name("Deependra","Vishwakarma");
    }
    @Bean
    public Student getStudent()
    {
        Student student=new Student(getName(),"Deependra",24);
        return student;
    }


}
