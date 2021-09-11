package top.mowangblog.code.map_;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * JavaStudy
 * TreeMapDemo
 *
 * @author : Xuan Li
 * @date : 2021-09-11 19:24
 **/
@SuppressWarnings("all")
public class TreeMapDemo {
    public static void main(String[] args) {
        //默认按字符排序源码
        //return comparator==null ? ((Comparable<? super K>)k1).compareTo((K)k2)
        //            : comparator.compare((K)k1, (K)k2);
        //判断有没有比较器，没有则按字符排序
        TreeMap treeMap = new TreeMap();
        treeMap.put("abs","lixuan");
        treeMap.put("dbs","lixuan");
        treeMap.put("cbs","lixuan");
        treeMap.put("lbs","lixuan");
        treeMap.put("bbs","lixuan");
        treeMap.put("1bs","lixuan");
        treeMap.put("zbs","lixuan");

        System.out.println(treeMap);

        TreeMap treeMap2 = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((String) o2).compareTo(((String) o1));
            }
        });
        treeMap2.put("abs","lixuan");
        treeMap2.put("dbs","lixuan");
        treeMap2.put("cbs","lixuan");
        treeMap2.put("lbs","lixuan");
        treeMap2.put("bbs","lixuan");
        treeMap2.put("1bs","lixuan");
        treeMap2.put("zbs","lixuan");
        treeMap2.put("zbs","mowang");//相同的key会更新value
        System.out.println(treeMap2);

    }
}
