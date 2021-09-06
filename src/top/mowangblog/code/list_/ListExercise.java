package top.mowangblog.code.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * JavaStudy
 * ListExercise
 *
 * @author : Xuan Li
 * @date : 2021-09-06 21:44
 **/
@SuppressWarnings("all")
public class ListExercise {
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0; i < 10; i++) {
            list.add("李煊"+i);
        }

        list.add(2,"魔王");
        list.get(5);
        list.remove(6);
        list.set(7,"mowangblog");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }

    }
}
