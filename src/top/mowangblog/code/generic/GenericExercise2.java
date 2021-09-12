package top.mowangblog.code.generic;

import java.util.*;

/**
 * JavaStudy
 * 泛型练习
 *
 * @author : Xuan Li
 * @date : 2021-09-11 23:35
 **/
public class GenericExercise2 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("李煊",20000,new MyDate(2000,6,26)));
        employees.add(new Employee("李煊",10000,new MyDate(2000,7,26)));
        employees.add(new Employee("李煊",130000,new MyDate(2000,7,25)));

        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                int i = o1.getName().compareTo(o2.getName());
                if(i!=0){
                    return i;
                }
//              return GenericExercise2.dateCompare(o2.getBirthday(),o1.getBirthday());
                //还可以继承Comparable接口重写比较器
                return o1.getBirthday().compareTo(o2.getBirthday());
            }
        });

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static int dateCompare(MyDate d1,MyDate d2){
        return d1.getYear() - d2.getYear()!=0?d1.getYear() - d2.getYear():d1.getMonth() - d2.getMonth()!=0
                ?d1.getMonth() - d2.getMonth():d1.getDay() - d2.getDay();
    }
}
class Employee{
    private String name;
    private double salary;
    private MyDate birthday;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", birthday=" + birthday +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    public Employee(String name, double salary, MyDate birthday) {
        this.name = name;
        this.salary = salary;
        this.birthday = birthday;
    }
}

class MyDate implements Comparable<MyDate>{
    private int year;
    private int month;
    private int day;

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public int compareTo(MyDate o1) {
        return this.getYear() - o1.getYear()!=0?this.getYear() - o1.getYear():this.getMonth() - o1.getMonth()!=0
                ?this.getMonth() - o1.getMonth():this.getDay() - o1.getDay();
    }
}

