package top.mowangblog.java8.methodreference;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * JavaStudy
 * 构造器引用
 *
 * @author : Xuan Li
 * @website : https://mowangblog.top
 * @date : 2021-09-24 21:32
 **/
public class ConstructorRef {
    int id = 0;
    String name = "111";

    public ConstructorRef(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public ConstructorRef() {
    }

    public ConstructorRef(int id) {
        this.id = id;
    }

    /**
     * @description: 空参构造器
     * @author: Xuan Li
     * @date: 2021/9/24 21:34
     */
    public void test1() {
        //原始使用
        Supplier<ConstructorRef> supplier = new Supplier<ConstructorRef>() {
            @Override
            public ConstructorRef get() {
                return new ConstructorRef();
            }
        };
        //lambda表达式
        Supplier<ConstructorRef> supplier1 = () -> new ConstructorRef();

        //构造器引用
        Supplier<ConstructorRef> supplier2 = ConstructorRef::new;
    }

    /**
     * @description: 有参构造
     * @author: Xuan Li
     * @date: 2021/9/24 21:42
    */
    public void test2() {
        //原始使用
        Function<Integer, ConstructorRef> function = new Function<Integer, ConstructorRef>() {
            @Override
            public ConstructorRef apply(Integer integer) {
                return new ConstructorRef(integer);
            }
        };
        //lambda表达式
        Function<Integer, ConstructorRef> function1 = id -> new ConstructorRef(id);

        //构造器引用
        Function<Integer, ConstructorRef> function2 = ConstructorRef::new;
    }

    /**
     * @description: 双参构造
     * @author: Xuan Li
     * @date: 2021/9/24 21:42
    */
    public void test3() {
        //原始使用
        BiFunction<Integer,String,ConstructorRef> biFunction = new BiFunction<Integer, String, ConstructorRef>() {
            @Override
            public ConstructorRef apply(Integer integer, String s) {
                return new ConstructorRef(integer,s);
            }
        };
        //lambda表达式
        BiFunction<Integer,String,ConstructorRef> biFunction1 = (id,name) -> new ConstructorRef(id,name);

        //构造器引用
        BiFunction<Integer,String,ConstructorRef> biFunction2 = ConstructorRef::new;
    }

    /**
     * @description: 数组引用
     * @author: Xuan Li
     * @date: 2021/9/24 21:48
    */
    public void test4() {
        //原始使用
        Function<Integer,String[]> function = new Function<Integer, String[]>() {
            @Override
            public String[] apply(Integer integer) {
                return new String[integer];
            }
        };
        //lambda表达式
        Function<Integer,String[]> function1 =  (len) -> new String[len];

        //数组引用
        Function<Integer,String[]> function2 = String[]::new;
    }
}
