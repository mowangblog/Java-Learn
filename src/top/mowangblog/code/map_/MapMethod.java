package top.mowangblog.code.map_;

import java.util.HashMap;

/**
 * JavaStudy
 * mapMethod
 *
 * @author : Xuan Li
 * @date : 2021-09-11 15:37
 **/
@SuppressWarnings("all")
public class MapMethod {
    static int i = 0;
    public static void main(String[] args) {
        //put 放入key - value
        HashMap hashMap = new HashMap();
        hashMap.put(i,"lixuan");
        hashMap.put(1,"lixuan");
        hashMap.put(2,null);
        hashMap.put(2,"mowang");
        hashMap.put(null,null);

        //get 根据key获得value
        System.out.println("hashMap.get(null) = " + hashMap.get(null));

        //返回删除的value
        System.out.println("hashMap.remove(2) = " + hashMap.remove(2));

        //返回map元素个数
        System.out.println("hashMap.size() = " + hashMap.size());

        //判断map是否为空
        System.out.println("hashMap.isEmpty() = " + hashMap.isEmpty());

        //判断key是否存在
        System.out.println("hashMap.containsKey(null) = " + hashMap.containsKey(null));

        //删除所有元素
        hashMap.clear();
        System.out.println("hashMap = " + hashMap);

    }

}
