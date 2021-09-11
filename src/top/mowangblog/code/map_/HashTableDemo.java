package top.mowangblog.code.map_;

import java.util.Hashtable;

/**
 * JavaStudy
 *
 * @author : Xuan Li
 * @date : 2021-09-11 17:50
 **/
@SuppressWarnings("all")
public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable hashtable = new Hashtable();
        hashtable.put("1","value");
        hashtable.put(null,"value");
        //hashtable key 和 value 都不能存放null
    }
}
