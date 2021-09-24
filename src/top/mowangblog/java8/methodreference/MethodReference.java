package top.mowangblog.java8.methodreference;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * Java-Learn
 * 方法引用
 * 方法引用要求接口中的抽象方法的形参列表和返回值类型
 * 和方法引用的方法的形参列表和返回值类型一致
 * @author : Xuan Li
 * @website  : https://mowangblog.top
 * @date : 2021-09-24 15:45
 **/
public class MethodReference {
    public static void main(String[] args) {
        new MethodReference().Test4();

    }
    /**
     * @description: 对象：：示例方法
     * Consumer里的void accept(T t)和System.out打印流里面的void println(S)参数返回值一致可以用方法引用
     * @author: Xuan Li
     * @date: 2021/9/24 20:53
    */
    public void Test1(){
        //lambda表达式
        Consumer<String> consumer = (s) -> System.out.println(s);

        //方法引用
        Consumer<String> consumer1 = System.out::println;
    }

    /**
     * @description: 方法一致可以使用方法引用
     * supplier里的String get()和本对象里面的String getString()参数返回值一致可以用方法引用
     * @author: Xuan Li
     * @date: 2021/9/24 20:56
    */
    public void Test2(){
        //lambda表达式
        Supplier<String> supplier = () -> getString();

        //方法引用
        Supplier<String> supplier1 = this::getString;
    }

    public String getString(){
        return "mowang";
    }

    /**
     * @description: 类：：静态方法
     * Comparator里的 int compare(o1,o2),和Integer里面的int compare(o1,o2)参数返回值一致可以用方法引用
     * @author: Xuan Li
     * @date: 2021/9/24 21:00
    */
    public void Test3(){
        //lambda表达式
        Comparator<Integer> comparator = (o1,o2) -> Integer.compare(o1,o2);
        System.out.println("comparator.compare(101,10) = " + comparator.compare(101, 10));

        //方法引用
        Comparator<Integer> comparator1 = Integer::compare;
    }

    /**
     * @description: R apply(T t) 和 long round(double a) 参数返回值一致可以用方法引用
     * @author: Xuan Li
     * @date: 2021/9/24 21:13
    */
    public void Test4(){
        //初始写法
        Function<Double,Long> function = new Function<Double, Long>() {
            @Override
            public Long apply(Double aDouble) {
                return Math.round(aDouble);
            }
        };
        //lambda表达式
        Function<Double,Long> function1 = aDouble -> Math.round(aDouble);

        //方法引用
        Function<Double,Long> function2 = Math::round;
        System.out.println("function2.apply(100.1) = " + function2.apply(100.0));
    }

    /**
     * @description: 类：：非静态方法，int compare(T o1, T o2)
     * 和int compareTo(String anotherString)参数不同但是一个参数调用另一个参数o1.compareTo(o2)可以用方法引用
     * @author: Xuan Li
     * @date: 2021/9/24 21:22
    */
    public void Test5(){
        //lambda表达式
        Comparator<String> comparator = (o1,o2) -> o1.compareTo(o2);


        //方法引用
        Comparator<String> comparator1 = String::compareTo;
    }

    /**
     * @description: R apply(T t) 和 String getString()
     * 传的参数调用方法可以用方法引用
     * @author: Xuan Li
     * @date: 2021/9/24 21:30
    */
    public void Test6(){
        //lambda表达式
        Function<MethodReference,String> function = (m) -> m.getString();

        //方法引用
        Function<MethodReference,String> function1 = MethodReference::getString;
        System.out.println("function1.apply(this) = " + function1.apply(this));

    }
}
