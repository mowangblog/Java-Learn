package top.mowangblog.code.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * JavaStudy
 * 泛型的继承
 *
 * @author : Xuan Li
 * @date : 2021-09-12 10:46
 **/
public class GenericExtends {
    public static void main(String[] args) {
        ArrayList<Object> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<A> list3 = new ArrayList<>();
        ArrayList<B> list4 = new ArrayList<>();
        ArrayList<C> list5 = new ArrayList<>();

        //? 表示所有泛型所有全都可以放进去
        printCollection1(list1);
        printCollection1(list2);
        printCollection1(list3);
        printCollection1(list4);
        printCollection1(list5);

        //extends A 规定了只能放A 及 A的子类，String和Object无法放入
//        printCollection2(list1);//f
//        printCollection2(list2);//f
        printCollection2(list3);
        printCollection2(list4);
        printCollection2(list5);

        //super B 规定了只能放B及B的父类，String和C类无法放入
        printCollection3(list1);
//        printCollection3(list2);//f
        printCollection3(list3);
        printCollection3(list4);
//        printCollection3(list5);//f



    }
    public static void printCollection1(List<?> list){
        System.out.println(list);
    }
    public static void printCollection2(List<? extends A> list){
        System.out.println(list);
    }
    public static void printCollection3(List<? super B> list){
        System.out.println(list);
    }

}

class A {
}

class B extends A {
};

class C extends B {
};


