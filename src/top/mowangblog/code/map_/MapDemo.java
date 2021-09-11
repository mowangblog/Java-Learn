package top.mowangblog.code.map_;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * JavaStudy
 * mapDemo
 *
 * @author : Xuan Li
 * @date : 2021-09-11 14:52
 **/
@SuppressWarnings("all")
public class MapDemo {
    public static void main(String[] args) {
        //map key-value(双列元素)
        //key 不能重复
        HashMap hashMap = new HashMap();
        hashMap.put("1","lixuan");
        hashMap.put("1","mowang");//有相同的key,会替换value
        hashMap.put("2","lixuan");
        hashMap.put(null,null);//key可以为null,但不能重复
        hashMap.put(null,"lixuan");
        System.out.println("hashMap = " + hashMap);
        System.out.println(hashMap.get(null));
        Set set = hashMap.entrySet();
        for (Object entry : set) {
            System.out.println("entry.getClass() = " + entry.getClass());
            //实际运行类型是node,node实现了entry,体现了多态
            //把node放到entrySet是为了方便遍历，提过了getkey和getvalue
        }
        for (Object o : hashMap.entrySet()) {
            Map.Entry entry = (Map.Entry) o;
            System.out.println("entry.getKey() = " + entry.getKey());
            System.out.println("entry.getValue() = " + entry.getValue());
        }
        for (Object o : hashMap.keySet()) {
            System.out.println("key = " + o);
        }
        for (Object value : hashMap.values()) {
            System.out.println("value = " + value);
        }
    }
}
