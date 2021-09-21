package top.mowangblog.code.reflection.class_;

import top.mowangblog.code.reflection.Cat;

/**
 * JavaStudy
 * 得到class对象的方式
 *
 * @author : Xuan Li
 * @date : 2021-09-21 21:41
 **/
public class GetClass {
    public static void main(String[] args) throws Exception{
        //1 forName 应用场景读配置文件
        Class<?> aClass = Class.forName("top.mowangblog.code.reflection.Cat");
        System.out.println(aClass);

        //2.String.class 多用于参数传递
        Class bClass = Cat.class;
        System.out.println(bClass);

        //3，对象.getClass() 用于有对象实例
        Cat cat = new Cat();
        Class<? extends Cat> cClass = cat.getClass();
        System.out.println(cClass);
        //通过类加载器（4种）
        ClassLoader classLoader = cat.getClass().getClassLoader();
        Class<?> aClass1 = classLoader.loadClass("top.mowangblog.code.reflection.Cat");
        System.out.println(aClass1);

        //基本数据类型获得class对象
        Class<Integer> integerClass = int.class;
        Class<Double> doubleClass = double.class;
        Class<Boolean> booleanClass = boolean.class;
        System.out.println(integerClass.hashCode());
        System.out.println(doubleClass);
        System.out.println(booleanClass);

        //包装数据类型通过.type获得class对象
        Class<Integer> type = Integer.TYPE;
        Class<Double> type1 = Double.TYPE;
        Class<Character> type2 = Character.TYPE;

        //integerClass type实际上同一个class
        System.out.println(type.hashCode());
        System.out.println(type1);
        System.out.println(type2);

    }
}
