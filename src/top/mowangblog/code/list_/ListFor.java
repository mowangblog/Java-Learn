package top.mowangblog.code.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * JavaStudy
 * ListExercise
 *
 * @author : Xuan Li
 * @date : 2021-09-06 21:44
 **/
@SuppressWarnings("all")
public class ListFor {
    public static void main(String[] args) {
        List list = new LinkedList();
        for (int i = 0; i < 10; i++) {
            list.add("李煊"+i);
        }
        System.out.println("迭代器");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }
        System.out.println("增强for");
        for (Object o : list) {
            System.out.println(o);
        }
        System.out.println("普通方法");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
