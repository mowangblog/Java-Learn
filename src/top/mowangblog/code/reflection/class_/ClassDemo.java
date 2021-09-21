package top.mowangblog.code.reflection.class_;

import top.mowangblog.code.reflection.Cat;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * JavaStudy
 * class
 *
 * @author : Xuan Li
 * @date : 2021-09-21 21:33
 **/
public class ClassDemo {
    public static void main(String[] args) throws Exception {
        Class<?> aClass = Class.forName("top.mowangblog.code.reflection.Cat");
        System.out.println(aClass);

        //获得包名
        System.out.println("aClass.getPackage().getName() = " + aClass.getPackage().getName());

        //获得全类名
        System.out.println("aClass.getName() = " + aClass.getName());

        //获得简单类名
        System.out.println("aClass.getSimpleName() = " + aClass.getSimpleName());

        //获得对象实例
        Cat cat = ((Cat) aClass.newInstance());
        System.out.println(cat);

        //获得对象属性
        Field field = aClass.getField("name");
        System.out.println(field.get(cat));

        //通过反射给属性赋值
        field.set(cat,"小猫咪");
        System.out.println(field.get(cat));

        //获得所有的字段属性
        Field[] fields = aClass.getFields();
        for (Field field1 : fields) {
            System.out.println(field1.getName());
        }

        //获得声明的字段属性
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field field1 : declaredFields) {
            System.out.println(field1.getName());
        }

        //获取所有方法
        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod.getName());
        }

        //获得父类的class信息
        Class<?> superclass = aClass.getSuperclass();
        System.out.println(superclass.getName());

        //获得所有注解
        Annotation[] annotations = aClass.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }

        //获得所有构造方法，接口省略
    }
}
