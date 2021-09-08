package top.mowangblog.code.set_;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Java-Learn
 * HashSet
 *
 * @author : Xuan Li
 * @date : 2021-09-07 19:34
 **/
@SuppressWarnings("all")
public class HashSetDemo2 {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add(new Dog("mowang"));
        set.add(new Dog("xiaohua"));
        set.add(new String("lixuan"));
        set.add(new String("lixuan"));
        System.out.println(set);
    }
}
class Dog{
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
