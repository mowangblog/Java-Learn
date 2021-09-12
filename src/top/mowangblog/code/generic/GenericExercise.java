package top.mowangblog.code.generic;

import java.util.*;

/**
 * JavaStudy
 * 泛型练习
 *
 * @author : Xuan Li
 * @date : 2021-09-11 23:35
 **/
public class GenericExercise {
    public static void main(String[] args) {
        HashSet<Student> students = new HashSet<>();
        students.add(new Student("李煊",18));
        students.add(new Student("王大成",34));
        students.add(new Student("韩一峰",12));

        HashMap<String, Student> stringStudentHashMap = new HashMap<>();
        for (Student student : students) {
            stringStudentHashMap.put(student.getName(),student);
            System.out.println(student.getName()+":"+student.getAge());
        }
        System.out.println("===========");
        Set<Map.Entry<String, Student>> entries = stringStudentHashMap.entrySet();
        for (Map.Entry<String, Student> next : entries) {
            Student student = next.getValue();
            System.out.println(next.getKey() + "-" + student.getAge());
        }

    }
}
class Student{
    private String name;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
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

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private int age;
}
