package top.mowangblog.code.exercise;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * JavaStudy
 * hashmap练习
 *
 * @author : Xuan Li
 * @date : 2021-09-11 21:30
 **/
@SuppressWarnings("all")
public class HashMapExercise {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("jack",650);
        hashMap.put("tom",1200);
        hashMap.put("lixuan",20000);

        hashMap.put("jack",2600);
        Set set = hashMap.keySet();
        for (Object o : set) {
            hashMap.put(o, ((int) hashMap.get(o))+100);
        }
        for (Object o : set) {
            System.out.println(o+":"+hashMap.get(o));
        }
        System.out.println("====entrySet====");
        Set set1 = hashMap.entrySet();
        for (Object o : set1) {
            Map.Entry entry = ((Map.Entry) o);
            entry.setValue(((int) entry.getValue())+100);
        }
        for (Object o : set1) {
            Map.Entry entry = ((Map.Entry) o);
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
        Iterator iterator = set1.iterator();
        while (iterator.hasNext()) {
            Map.Entry next = ((Map.Entry) iterator.next());
            System.out.println(next.getKey()+"-"+next.getValue());
        }
    }
}

