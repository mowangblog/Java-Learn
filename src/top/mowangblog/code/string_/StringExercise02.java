package top.mowangblog.code.string_;

/**
 * JavaStudy
 * StringExercise2
 *
 * @author : Xuan Li
 * @date : 2021-09-04 21:09
 **/
@SuppressWarnings("all")//拦截所有警告
public class StringExercise02 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "lixuan";
        Person person2 = new Person();
        person2.name = "lixuan";

        System.out.println(person1.name.equals(person2.name));//t
        System.out.println(person1.name == person2.name);//t
        System.out.println(person1.name == "lixuan");//t

        String str1 = new String("lixuan");
        String str2 = new String("lixuan");
        System.out.println(str1 == str2);//f
    }
}
class Person{
    public String name;
};
