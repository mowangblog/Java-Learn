package top.mowangblog.code.reflection.exercise;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * JavaStudy
 * 反射练习
 *
 * @author : Xuan Li
 * @date : 2021-09-22 20:51
 **/
public class Exercise {
    public static void main(String[] args) throws Exception{
        Class<?> testClass = Class.forName("top.mowangblog.code.reflection.privateTest");
        Object o = testClass.newInstance();
        Field name = testClass.getDeclaredField("name");
        //爆破
        name.setAccessible(true);
        System.out.println("name.get(o) = " + name.get(o));
        name.set(o,"mowang");
        Method getName = testClass.getMethod("getName");
        System.out.println("getName.invoke(o) = " + getName.invoke(o));

    }
}
