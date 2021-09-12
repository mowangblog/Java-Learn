package top.mowangblog.code.generic;

import java.util.ArrayList;

/**
 * JavaStudy
 * 泛型demo
 *
 * @author : Xuan Li
 * @date : 2021-09-11 23:23
 **/
public class GenericDemo {
    public static void main(String[] args) {
        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("大黄"));
        dogs.add(new Dog("小白"));
        dogs.add(new Dog("旺财"));
        for (Dog dog : dogs) {
            System.out.println(dog.getName());
        }
    }
}
class Dog{
    private String name;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog(String name) {
        this.name = name;
    }
}
