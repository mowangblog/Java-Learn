package top.mowangblog.code.exercise;

import top.mowangblog.code.oop.work.Person;

import java.util.HashSet;
import java.util.Objects;

/**
 * JavaStudy
 * exercise
 *
 * @author : Xuan Li
 * @date : 2021-09-11 22:07
 **/
@SuppressWarnings("all")
public class HashSetExercise {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        PersonTest p1 = new PersonTest(1001, "lixuan");
        PersonTest p2 = new PersonTest(1002, "mowang");
        hashSet.add(p1);
        hashSet.add(p2);
        p1.setName("李煊");
        hashSet.remove(p1);
        System.out.println(hashSet);
        hashSet.add(new PersonTest(1001,"李煊"));
        System.out.println(hashSet);
        hashSet.add(new PersonTest(1001,"lixuan"));
        System.out.println(hashSet);

    }
}
class PersonTest{
    private int id;
    private String name;

    @Override
    public String toString() {
        return "PersonTest{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonTest that = (PersonTest) o;
        return id == that.id && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    public PersonTest(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
