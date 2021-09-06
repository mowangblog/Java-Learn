package top.mowangblog.code.list_;

import java.util.ArrayList;
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
public class ListDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("李旭");
        list.add("李选");
        list.add("李先");
        list.add("李选");

        System.out.println(list.get(0));
        Stack stack = new Stack();
        stack.push("1");
        stack.push("2");
        System.out.println(stack.pop());
    }
}
