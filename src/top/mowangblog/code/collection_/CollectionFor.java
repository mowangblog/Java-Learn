package top.mowangblog.code.collection_;

import java.util.ArrayList;
import java.util.Collection;

/**
 * JavaStudy
 * CollectionFor
 *
 * @author : Xuan Li
 * @date : 2021-09-06 20:47
 **/
@SuppressWarnings("all")
public class CollectionFor {
    public static void main(String[] args) {
        Collection arrayList = new ArrayList();
        arrayList.add(new Book("西游记","吴承恩",111));
        arrayList.add(new Book("三国演义","罗贯中",31.1));
        arrayList.add(new Book("水浒传","施耐庵",354.2));
        //增强for循环，它的底层是迭代器
        //就是简化版本的迭代器
        for (Object o : arrayList) {
            System.out.println(o);
        }
        
    }
}
