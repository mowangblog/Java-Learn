package top.mowangblog.code.collection_;

import java.util.ArrayList;
import java.util.List;

/**
 * JavaStudy
 * Method
 *
 * @author : Xuan Li
 * @date : 2021-09-06 20:08
 **/
@SuppressWarnings("all")
public class CollectionMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        //add 添加单个元素
        list.add("lixuan");
        list.add(15);
        list.add(true);
        System.out.println(list);

        //remove 删除元素
//        list.remove(0);
        list.remove(true);
        System.out.println(list);

        //contains 判断是否包含某个元素
        System.out.println("list.contains(\"lixuan\") = " + list.contains("lixuan"));

        //size 获取元素个数
        System.out.println("list.size() = " + list.size());

        //isEmpty 判断集合是否为空
        System.out.println("list.isEmpty() = " + list.isEmpty());

        //clear 清空集合
        list.clear();
        System.out.println(list);

        //addAll 添加多个元素
        ArrayList arrayList = new ArrayList();
        arrayList.add("三国演义");
        arrayList.add("红楼梦");
        arrayList.add("水浒传");
        arrayList.add("西游记");
        list.addAll(arrayList);
        System.out.println(list);

        //containsAll 查找多个元素是否都存在
        System.out.println("list.containsAll(arrayList) = " + list.containsAll(arrayList));

        //removeAll 删除多个元素
        list.add("金瓶梅");
        list.removeAll(arrayList);
        System.out.println(list);
    }
}
