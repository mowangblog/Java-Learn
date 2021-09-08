package top.mowangblog.code.set_;

import java.util.HashSet;
import java.util.Objects;

/**
 * JavaStudy
 * Exercise
 *
 * @author : Xuan Li
 * @date : 2021-09-08 21:48
 **/
@SuppressWarnings("all")
public class HashSetExercise {
    public static void main(String[] args) {
        //当person类名字和age相同时认为是同一个对象，不能重复添加到hashSet
        //重写hashcode和equals实现
        HashSet hashSet = new HashSet();
        hashSet.add(new Person("李煊",20));
        hashSet.add(new Person("魔王",20));
        hashSet.add(new Person("李煊",20));
        System.out.println(hashSet);
    }
}
class Person{
    private String name;
    private int age;

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

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}
