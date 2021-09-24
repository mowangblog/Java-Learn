package top.mowangblog.java8.streamapi;

import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * JavaStudy
 * 雇员测试类，用于测试Stream
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021-09-24 22:29
 **/
public class Employee implements Comparable{
    private int id;
    private String name;
    private double salary;

    public static Employee getEmployee(){
        return new Employee(1,Math.random()>0.49?"李煊":"大威天龙",(int)(Math.random()*10000));
    }

    public static List<Employee> getList(int num){
        return Stream.generate(Employee::getEmployee).limit(num).collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
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

    @Override
    public int compareTo(Object o) {
        return Double.compare(this.getSalary(),((Employee) o).getSalary());
    }
}
