package top.mowangblog.code.collections_tool;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * JavaStudy
 * 集合操作工具
 *
 * @author : Xuan Li
 * @date : 2021-09-11 19:41
 **/
@SuppressWarnings("all")
public class CollectionsTool {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("李旭");
        list.add("王选六");
        list.add("张先阳刚");
        list.add("刘选");
        System.out.println(list);

        System.out.println("=========反转list=========");
        //reverse 反转集合顺序
        Collections.reverse(list);
        System.out.println(list);

        System.out.println("=========随机打乱=========");
        //对list集合元素进行随机打乱
        for (int i = 0; i < 5; i++) {
            Collections.shuffle(list);
            System.out.println(list);
        }

        System.out.println("=========排序=========");
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, new Comparator<Object>() {
            @Override
            public int compare(Object o1, Object o2) {
                if(o1 instanceof String && o2 instanceof String){
                    return ((String) o1).length() - ((String) o2).length();
                }
                return 0;
            }
        });
        System.out.println(list);

        System.out.println("=========元素交换=========");
        Collections.swap(list,0,3);//下标0和3位置的元素交换，但是不能越界
        System.out.println(list);

        System.out.println("=========元素最大最小值=========");
        //比较器
        Comparator<Object> comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof String && o2 instanceof String) {
                    return ((String) o1).length() - ((String) o2).length();
                }
                return 0;
            }
        };
        System.out.println("Collections.max(list) = " + Collections.max(list,comparator));
        System.out.println("Collections.max(list) = " + Collections.min(list,comparator));

        System.out.println("=========集合元素出现的次数=========");
        System.out.println("Collections.frequency(list,\"李旭\") = " + Collections.frequency(list, "李旭"));

        System.out.println("=========集合拷贝=========");
        List arrayList = new ArrayList();
        //要完成拷贝必须被拷贝的集合和拷贝的集合size一致
        for (int i = 0; i < list.size(); i++) {
            arrayList.add("");
        }
        Collections.copy(arrayList,list);
        System.out.println(arrayList);

        System.out.println("=========集合元素替换=========");
        Collections.replaceAll(list,"李旭","李煊");
        System.out.println(list);
    }
}
