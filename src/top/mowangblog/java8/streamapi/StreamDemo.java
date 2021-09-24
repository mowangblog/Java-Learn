package top.mowangblog.java8.streamapi;

import org.junit.Test;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * JavaStudy
 * streamApi演示
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021-09-24 21:58
 **/
public class StreamDemo {
    public static void main(String[] args) {
        Test2();
    }

    /**
     * @description: 可以通过集合，数组和stream的of()获得流
     * @author: Xuan Li
     * @date: 2021/9/24 22:06
     */
    public static void Test1() {
        List<Integer> list = Arrays.asList(13, 234, 234, 345, 345, 34, 534, 534, 5);

        //串行流
        Stream<Integer> stream = list.stream();
        //并行流
        Stream<Integer> integerStream = list.parallelStream();
        //通过of();
        Stream<Integer> integerStream1 = Stream.of(1, 32, 32, 434, 534, 534, 534);

    }

    /**
     * @description: 无限流
     * @author: Xuan Li
     * @date: 2021/9/24 22:13
     */
    public static void Test2() {
        //迭代
        ArrayList<Object> arrayList = new ArrayList<>();
        Stream.iterate(1,t -> t+=1).limit(1).forEach(arrayList::add);
        System.out.println(arrayList);

        //生成
        Stream.generate(() -> (int)(Math.random() * 100)+1).limit(100).forEach(arrayList::add);
        System.out.println(arrayList);
    }
}
