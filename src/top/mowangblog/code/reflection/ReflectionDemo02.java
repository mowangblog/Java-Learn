package top.mowangblog.code.reflection;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * JavaStudy
 * 反射
 *
 * @author : Xuan Li
 * @date : 2021-09-21 17:15
 **/
@SuppressWarnings("all")
public class ReflectionDemo02 {
    public static void main(String[] args) throws Exception{
       m1();
       m2();
       m3();
    }

    public static void m1() throws Exception {
        Class<?> aClass = Class.forName("top.mowangblog.code.reflection.Cat");
        Object o = aClass.newInstance();
        Method hi = aClass.getMethod("hi");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 900000000; i++) {
            hi.invoke(o);
        }
        long end = System.currentTimeMillis();
        System.out.println("反射耗时："+(end - start));
    }

    public static void m2() throws Exception {
        Cat cat = new Cat();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 900000000; i++) {
            cat.hi();
        }
        long end = System.currentTimeMillis();
        System.out.println("普通耗时："+(end - start));
    }

    public static void m3() throws Exception {
        Class<?> aClass = Class.forName("top.mowangblog.code.reflection.Cat");
        Object o = aClass.newInstance();
        Method hi = aClass.getMethod("hi");
        hi.setAccessible(false);
        long start = System.currentTimeMillis();
        for (int i = 0; i < 900000000; i++) {
            hi.invoke(o);
        }
        long end = System.currentTimeMillis();
        System.out.println("反射优化关闭访问检查耗时："+(end - start));
    }
}
