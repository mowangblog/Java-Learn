package top.mowangblog.code.map_;

import java.util.*;

/**
 * JavaStudy
 * map的六种遍历方式
 *
 * @author : Xuan Li
 * @date : 2021-09-11 15:49
 **/
@SuppressWarnings("all")
public class MapFor {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("1","lixuan");
        hashMap.put("1","mowang");//有相同的key,会替换value
        hashMap.put("2","lixuan");
        hashMap.put(null,null);//key可以为null,但不能重复
        hashMap.put(null,"lixuan");

        //第一组方式，先取出key,再getvalue
        Set set = hashMap.keySet();
        System.out.println("=========第一种方式==========");
        System.out.println("=========增强for keyset==========");
        for (Object o : set) {
            System.out.println("key = "+o+" value = "+hashMap.get(o));
        }
        System.out.println("=========第二种方式==========");
        System.out.println("=========迭代器 keyset==========");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Object o =  iterator.next();
            System.out.println("key = "+o+" value = "+hashMap.get(o));
        }

        //第二组方式，values
        Collection values = hashMap.values();
        System.out.println("=========第三种方式==========");
        System.out.println("=========增强for values==========");
        for (Object value : values) {
            System.out.println(value);
        }
        System.out.println("=========第四种方式==========");
        System.out.println("=========迭代器 values==========");
        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            Object next =  iterator1.next();
            System.out.println(next);
        }

        //第三组方式，通过entrySet获得k-v
        Set set1 = hashMap.entrySet();
        System.out.println("=========第五种方式==========");
        System.out.println("=========增强for entrySet==========");
        for (Object o : set1) {
            Map.Entry entry = (Map.Entry) o;
            System.out.println("key = "+entry.getKey()+" value = "+entry.getValue());
        }
        System.out.println("=========第六种方式==========");
        System.out.println("=========迭代器 entrySet==========");
        Iterator iterator2 = set1.iterator();
        while (iterator2.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator2.next();
            System.out.println("key = "+entry.getKey()+" value = "+entry.getValue());
        }
    }
}
