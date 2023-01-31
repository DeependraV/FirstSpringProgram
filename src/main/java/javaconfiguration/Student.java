package javaconfiguration;

import org.springframework.stereotype.Component;

@Component
public class Student {
    private Name sname;
    private  String name;
    private  int age;

    public Student(Name sname, String name, int age) {
        this.sname = sname;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sname=" + sname +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Name getSname() {
        return sname;
    }

    public void setSname(Name sname) {
        this.sname = sname;
    }

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void show(String str)
    {
        System.out.println(str);
    }

}
