package top.mowangblog.code.set_;

import java.util.HashSet;
import java.util.Set;

/**
 * Java-Learn
 * HashSet
 *
 * @author : Xuan Li
 * @date : 2021-09-07 19:34
 **/
@SuppressWarnings("all")
public class HashSetDemo {
    public static void main(String[] args) {
        //不能存放重复元素，数据是无序的
        //hashset 可以存放null,但只能存放一个
        //底层由HaspMap实现
        //HashSet 构造方法
        // public HashSet() {
        //        map = new HashMap<>();
        //    }
        Set set = new HashSet();
        //执行add方法会返回boolean
        System.out.println(set.add("lixuan"));
        System.out.println(set.add("lixuan"));
        System.out.println(set.add(null));
        System.out.println(set.add(null));
        System.out.println(set);
    }
}
