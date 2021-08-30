package top.mowangblog.code.oop.work;

/**
 * JavaStudy
 * TeacherClass
 *
 * @author : Xuan Li
 * @date : 2021-08-30 22:50
 **/
public class Teacher extends Person{
    private int work_age;
    public Teacher(String name, String sex, int age,int work_age) {
        super(name, sex, age);
        this.work_age = work_age;
    }

    public int getWork_age() {
        return work_age;
    }

    public void setWork_age(int work_age) {
        this.work_age = work_age;
    }

    public String teach(){
        return "教书育人认真负责";
    }

    @Override
    public String play() {
        return super.play()+"爱玩象棋";
    }

    @Override
    public String toString() {
        return super.toString()+"Teacher{" +
                "work_age=" + work_age +
                '}';
    }
    public void printfInfo(){
        System.out.println("老师的信息\n"+"姓名："+this.getName()+"\n年龄："+this.getAge()
                +"\n性别："+this.getSex()+"\n工龄："+this.getWork_age()+"\n"+teach()
                +"\n"+this.play()
        );
    }
}
