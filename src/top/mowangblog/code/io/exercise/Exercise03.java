package top.mowangblog.code.io.exercise;

import java.io.*;
import java.util.Properties;

/**
 * JavaStudy
 * io流练习
 *
 * @author : Xuan Li
 * @date : 2021-09-18 21:58
 **/
public class Exercise03 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Properties properties = new Properties();
        properties.load(new FileReader("src/dog.properties"));
        Dog dog = new Dog(((String) properties.get("name")), Integer.parseInt((String) properties.get("age")), ((String) properties.get("color")));
        System.out.println(dog);

        String filePath = "D:/myTemp/hello.dat";
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath));
        objectOutputStream.writeObject(dog);
        objectOutputStream.close();

        ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filePath));
        Dog dog1 = ((Dog) inputStream.readObject());
        System.out.println(dog1);
        inputStream.close();
    }
}
class Dog implements Serializable {
    private static final long serialVersionUID = -3506252697891679499L;
    private String name;
    private int age;
    private String color;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
}