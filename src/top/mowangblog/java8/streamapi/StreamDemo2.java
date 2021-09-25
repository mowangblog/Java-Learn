package top.mowangblog.java8.streamapi;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * JavaStudy
 * streamApi演示
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021-09-24 21:58
 **/
public class StreamDemo2 {
    public static void main(String[] args) {
        test6();
    }

    /**
     * @description: 筛选和切片
     * @author: Xuan Li
     * @date: 2021/9/24 22:23
     */
    public static void Test1() {
        List<Employee> list = Employee.getList(50);
        System.out.println("==========筛选后=========");
        list.stream().filter(employee -> employee.getSalary() < 1000).forEach(System.out::println);

        System.out.println("==========限制数量10=========");
        list.stream().limit(10).forEach(System.out::println);

        System.out.println("==========skip跳过，如果元素不足返回空流=========");
        list.stream().skip(99).forEach(System.out::println);

        System.out.println("==========去重=========");
        list.stream().distinct().forEach(System.out::println);
    }

    /**
     * @description: 映射
     * @author: Xuan Li
     * @date: 2021/9/24 22:25
     */
    public static void Test2() {
        List<Employee> list = Employee.getList(10);
        //map返回名字长度大于3的名字
        list.stream().map(Employee::getName).filter(s -> s.length() > 3).forEach(System.out::println);

        //Map操作
        Stream<Stream<Character>> streamStream = list.stream().map(Employee::getName).map(StreamDemo2::getStream);
        streamStream.forEach(characterStream -> characterStream.forEach(System.out::println));

        //flatMap会自动打开map里的流
        Stream<Character> characterStream = list.stream().map(Employee::getName).flatMap(StreamDemo2::getStream);
        characterStream.forEach(System.out::println);
    }

    public static Stream<Character> getStream(String name) {
        ArrayList<Character> characters = new ArrayList<>();
        for (int i = 0; i < name.length(); i++) {
            characters.add(name.charAt(i));
        }
        return characters.stream();
    }

    /**
     * @description: 排序
     * @author: Xuan Li
     * @date: 2021/9/24 23:18
     */
    public static void test3() {
        List<Integer> integerList = Arrays.asList(13, 24, 64, 123, 678, 13, 5346, 456, 234, 675, 23, 541, 4, 6471, 7342);
        integerList.sort(Integer::compare);
        System.out.println(integerList);

        List<Employee> list = Employee.getList(10);
        list.stream().sorted(Comparator.comparingDouble(Employee::getSalary)).forEach(System.out::println);
    }

    /**
     * @description: 终止操作
     * @author: Xuan Li
     * @date: 2021/9/24 23:30
     */
    public static void test4() {
        List<Employee> list = Employee.getList(10);
        //forEach 内部迭代
        System.out.println("========内部迭代=========");
        list.stream().map(Employee::getSalary).forEach(System.out::println);
        //allMatch全部匹配为true 判断是否所有人的薪水都大于1000
        System.out.println("========判断是否所有人的薪水都大于1000=========");
        System.out.println(list.stream().map(Employee::getSalary).allMatch(s -> s > 1000));

        //anyMatch任意匹配为true 判断是否有人工资大于九千
        System.out.println("=========判断是否有人工资大于九千=========");
        System.out.println(list.stream().map(Employee::getSalary).anyMatch(salary -> salary > 9000));

        //noneMatch没有匹配为true 判断是否没有人姓王
        System.out.println("=========判断是否没有人姓王=========");
        System.out.println(list.stream().map(Employee::getName).noneMatch(name -> name.startsWith("王")));

        //findFirst 返回第一个元素
        System.out.println("=========返回第一个元素=========");
        System.out.println(list.stream().findFirst());

        //findAny 返回任意一个元素
        System.out.println("=========返回任意一个元素=========");
        System.out.println(list.parallelStream().findAny());

        //count统计个数 返回薪水大于5k的人数
        System.out.println("=========返回薪水大于5k的人数=========");
        System.out.println(list.stream().filter(employee -> employee.getSalary() > 5000).count());

        //max获得比较最大的值 返回最高的工资
        System.out.println("=========返回最高的工资=========");
        System.out.println(list.stream().map(Employee::getSalary).max(Double::compareTo));

        //min获得比较最小的值 返回工资最低的员工
        System.out.println("=========返回工资最低的员工=========");
        Optional<Employee> min = list.stream().min((Comparator.comparingDouble(Employee::getSalary)));
        System.out.println(min);
    }

    /**
     * @description: 归约
     * @author: Xuan Li
     * @date: 2021/9/25 0:49
     */
    public static void test5() {
        //求和
        List<Integer> list = Arrays.asList(1, 2, 43, 35, 5346, 3456, 3, 45, 123, 123);
        System.out.println(list.stream().reduce(Integer::sum));

        //求出所有员工薪资的总和
        List<Employee> employeeList = Employee.getList(10);
        System.out.println(employeeList.stream().map(Employee::getSalary).reduce(Double::sum));
    }

    /**
     * @description: 收集
     * @author: Xuan Li
     * @date: 2021/9/25 1:08
    */
    public static void test6() {
        //查找工资大于6k的员工返回一个list和set
        List<Employee> employeeList = Employee.getList(10);
        List<Employee> collect = employeeList.stream().
                filter(employee -> employee.getSalary() > 6000).collect(Collectors.toList());
        collect.forEach(System.out::println);
        System.out.println("=========set===========");
        Set<Employee> collect1 = employeeList.stream().
                filter(employee -> employee.getSalary() > 6000).collect(Collectors.toSet());
        collect1.forEach(System.out::println);
    }
}
