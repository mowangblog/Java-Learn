package top.mowangblog.code.reflection;

/**
 * JavaStudy
 * test
 *
 * @author : Xuan Li
 * @date : 2021-09-21 17:15
 **/
public class Cat {
    public String name = "招财猫";
    public int age;

    public Cat() {
    }

    public void hi(){
//        System.out.println("hi");
    };

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

    public Cat(String name) {
        this.name = name;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
