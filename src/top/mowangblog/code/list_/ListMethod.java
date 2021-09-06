package top.mowangblog.code.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/**
 * JavaStudy
 * list emo
 *
 * @author : Xuan Li
 * @date : 2021-09-06 21:33
 **/
@SuppressWarnings("all")
public class ListMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("李旭");
        list.add("李选");
        list.add("李先");
        list.add("李选");

        //index位置插入元素
        list.add(1,"李煊");
        for (Object o : list) {
            System.out.println(o);
        }
        //indexOf 返回元素第一次出现的位置
        System.out.println(list.indexOf("李选"));
        //lastIndexOf 返回元素最后一次出现的位置
        System.out.println(list.lastIndexOf("李选"));

        list.set(1,"魔王");
        for (Object o : list) {
            System.out.println(o);
        }
        System.out.println();
        //返回子集合，前闭后开
        List list1 = list.subList(1, 3);
        Iterator iterator = list1.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
    }
}
