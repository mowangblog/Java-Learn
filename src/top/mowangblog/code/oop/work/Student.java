package top.mowangblog.code.oop.work;

/**
 * JavaStudy
 * StudentClass
 *
 * @author : Xuan Li
 * @date : 2021-08-30 22:45
 **/
public class Student extends Person{
    private int stu_id;

    public Student(String name, String sex, int age,int stu_id) {
        super(name, sex, age);
        this.stu_id = stu_id;
    }

    public int getStu_id() {
        return stu_id;
    }

    public void setStu_id(int stu_id) {
        this.stu_id = stu_id;
    }

    public String study(){
        return "好好学习天天向上";
    }

    @Override
    public String play() {
        return super.play()+"爱玩足球";
    }

    @Override
    public String toString() {
        return super.toString()+"Student{" +
                "stu_id=" + stu_id +
                '}';
    }

    public void printfInfo(){
        System.out.println("学生的信息\n"+"姓名："+this.getName()+"\n年龄："+this.getAge()
                            +"\n性别："+this.getSex()+"\n学号："+this.getStu_id()+"\n"+study()
                            +"\n"+this.play()
        );
    }
}
