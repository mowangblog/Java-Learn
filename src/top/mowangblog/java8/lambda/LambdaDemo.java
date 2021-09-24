package top.mowangblog.java8.lambda;

import org.junit.Test;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Java-Learn
 * lambda表达式演示
 * lambda本质是函数式接口，函数式接口就是只有一个抽象方法的接口
 * 四大内置函数式接口 ：
 * Consumer<T>
 * 代表了接受一个输入参数并且无返回的操作
 *
 * Supplier<T>
 * 无参数，返回一个结果。
 *
 * Function<T,R>
 * 接受一个输入参数，返回一个结果。
 *
 * Predicate<T>
 * 接受一个输入参数，返回一个布尔值结果。
 *
 * @author : Xuan Li
 * @website  : https://mowangblog.top
 * @date : 2021-09-24 15:45
 **/
public class LambdaDemo {

    public static void main(String[] args) {
        LambdaDemo.lambdaTest4();
    }
    public static void lambdaTest1(){
        //两个参数有返回值原来的使用
        List<String> arrays = Arrays.asList("lixuan","mowang","mowangblog");
        Collections.sort(arrays, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        //使用lambda表达式
        //类型推断可以省略参数类型，方法体只有一行可以省略大括号和retrun
        Collections.sort(arrays,((o1, o2) -> o1.compareTo(o2)));
    }
    public static void lambdaTest2(){
        //无参数无返回值原来的使用
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("无参数无返回值");
            }
        };
        //使用lambda表达式
        //没有参数，可以使用空括号表示
        Runnable runnable2 = () -> System.out.println("无参数无返回值");
    }
    public static void lambdaTest3() {
        //有参无返回值原来的使用
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        //使用lambda表达式
        //一个参数可以省略括号，方法体一行可以省略返回和大括号
        Runnable runnable2 = () -> System.out.println("无参数无返回值");
    }

    public static void lambdaTest4() {
        //打印是偶数的数
        List<Integer> list = Arrays.asList(123,345,1234,543,24,23,423,42,425,34,5345,34,4,13,54235,2345634,345);
        filterNums(list, new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer % 2 ==0;
            }
        });

        //使用lambda表达式
        //更换规则大于一百的数，我们可以自定义过滤规则
        System.out.println();
        filterNums(list,num -> num < 100 );
    }

    /**
     * @description: 输出符合函数式接口Predicate.test()返回为true的数字，可以自定义判断规则
     * @author: Xuan Li
     * @date: 2021/9/24 15:15
    */
    public static void filterNums(List<Integer> list, Predicate<Integer> predicate){
        for (Integer integer: list) {
            if (predicate.test(integer)) {
                System.out.print(integer+"\t");
            }
        }
    }
}
