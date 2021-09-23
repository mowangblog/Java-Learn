package top.mowangblog.code.reflection.exercise;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * JavaStudy
 * 反射练习
 *
 * @author : Xuan Li
 * @date : 2021-09-22 20:51
 **/
public class Exercise1 {
    public static void main(String[] args) throws Exception{
        Class<?> fileClass = Class.forName("java.io.File");
        //获得所有构造方法
        Constructor<?>[] declaredConstructors = fileClass.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
        //获得String构造方法
        Constructor<?> constructor = fileClass.getConstructor(String.class);
        //实例化
        Object o = constructor.newInstance("D:/hello.txt");
        //获得createNewFile方法
        Method createNewFile = fileClass.getMethod("createNewFile");
        //创建文件
        createNewFile.invoke(o);
    }
}
