package top.mowangblog.code.oop.work;

/**
 * JavaStudy
 * TestClass
 *
 * @author : Xuan Li
 * @date : 2021-08-30 22:55
 **/
public class Test {
    public static void main(String[] args) {
        Person[] peoples = new Person[4];
        peoples[0] = new Student("小明","男",11,1001);
        peoples[1] = new Student("小倩","女",11,1002);
        peoples[2] = new Teacher("张飞","男",31,5);
        peoples[3] = new Teacher("王菲","女",31,5);
        for (int i = 0; i < peoples.length-1; i++) {
            for (int j = 0; j < peoples.length-i-1; j++) {
                if(peoples[j].getAge()<peoples[j+1].getAge()){
                    Person t = peoples[j];
                    peoples[j] = peoples[j+1];
                    peoples[j+1] = t;
                }
            }
        }
        for (Person people : peoples) {
            System.out.println(people.toString());
        }
        new Test().work(peoples[0]);
        new Test().work(peoples[2]);
    }
    public void work(Person person){
        if(person instanceof Student){
            Student student = (Student) person;
            student.printfInfo();
            System.out.println("==============");
        }
        if(person instanceof Teacher){
            Teacher teacher = (Teacher) person;
            teacher.printfInfo();
            System.out.println("==============");
        }
    }
}
