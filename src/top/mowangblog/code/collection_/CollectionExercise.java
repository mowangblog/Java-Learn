package top.mowangblog.code.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * JavaStudy
 * Exercise
 *
 * @author : Xuan Li
 * @date : 2021-09-06 20:52
 **/
@SuppressWarnings("all")
public class CollectionExercise {
    public static void main(String[] args) {
        Collection list = new ArrayList();
        list.add(new Dog("小花",1));
        list.add(new Dog("小黑",3));
        list.add(new Dog("小白",2));
        list.add("王晓丽");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            if (next instanceof Dog) {
                System.out.println(((Dog) next).getName()+""+((Dog) next).getAge());
            }
        }
        System.out.println();
        for (Object o : list) {
            if (o instanceof Dog) {
                Dog dog = (Dog) o;
                System.out.println(dog.getName()+""+dog.getAge());
            }
        }

    }
}
class Dog{
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
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
}
