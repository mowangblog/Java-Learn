package top.mowangblog.code.io.outputstream_;

import java.io.Serializable;

/**
 * JavaStudy
 * 测试对象
 *
 * @author : Xuan Li
 * @date : 2021-09-18 20:32
 **/
public class Dog implements Serializable {
    private static final long serialVersionUID = 3980928391061510363L;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    private String name;

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

    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
