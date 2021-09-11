package top.mowangblog.code.set_;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * JavaStudy
 * TreeSet
 *
 * @author : Xuan Li
 * @date : 2021-09-11 19:17
 **/
@SuppressWarnings("all")
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String)o1).length() - ((String)o2).length();
            }
        });
        treeSet.add("11111");
        treeSet.add("121");
        treeSet.add("13123");
        //因compare 里面长度相同差值为0,无法加入
        // 会更新value但set为单列数据没有变化
        treeSet.add("1234");
        treeSet.add("12");
        System.out.println(treeSet);
        for (Object o : treeSet) {
            System.out.println(o);
        }
        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }

    }
}
