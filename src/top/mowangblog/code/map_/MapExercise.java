package top.mowangblog.code.map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * JavaStudy
 * map练习
 *
 * @author : Xuan Li
 * @date : 2021-09-11 16:28
 **/
@SuppressWarnings("all")
public class MapExercise {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        Employee employee1 = new Employee(1, "lixuan", 20000);
        Employee employee2 = new Employee(2, "魔王", 20000);
        Employee employee3 = new Employee(3, "韩束", 10000);
        hashMap.put(employee1.getId(),employee1);
        hashMap.put(employee2.getId(),employee2);
        hashMap.put(employee3.getId(),employee3);
        Set set = hashMap.entrySet();
        for (Object o : set) {
            Map.Entry entry = (Map.Entry) o;
            Employee value = (Employee) entry.getValue();
            if(value.getSalary() > 18000){
                System.out.println(value);
            }
        }
        System.out.println("===========迭代器============");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry  next = (Map.Entry) iterator.next();
            Employee employee = (Employee) next.getValue();
            if(employee.getSalary() > 18000){
                System.out.println(employee);
            }
        }
        System.out.println("===========keyset============");
        Set set1 = hashMap.keySet();
        for (Object o : set1) {
            Employee employee = (Employee) hashMap.get(o);
            if(employee.getSalary() > 18000){
                System.out.println(employee);
            }
        }
    }
}
class Employee{
    private int id;
    private String name;
    private double salary;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}
