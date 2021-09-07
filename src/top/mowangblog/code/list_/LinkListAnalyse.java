package top.mowangblog.code.list_;

import java.util.LinkedList;

/**
 * JavaStudy
 * Analyse
 *
 * @author : Xuan Li
 * @date : 2021-09-07 11:51
 **/
@SuppressWarnings("all")
public class LinkListAnalyse {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < 10; i++) {
            linkedList.add(i);
            //添加新节点的源码linklast(e),中文注释是我的解读
    //        final Node<E> l = last;//拿到原来的last
    //        final Node<E> newNode = new Node<>(l, e, null);
             // new新节点，l在构造方法里面是前一个节点，为null的是下一个节点
    //        last = newNode;//因为是添加到最后，所以last就是这个新添加的节点了
    //        if (l == null)//如果原来last就是空那说明原来就是个空链表
    //            first = newNode;//原来就是空链表那么新添加的这个节点就是目前第一个节点，first也是这个新节点
    //        else
    //            l.next = newNode;//不是空链表则把new节点赋给原来的last，链接起来
    //        size++;//数量++
    //        modCount++;//操作次数++
        }
        System.out.println("linkedList.remove() = " + linkedList.remove());
        //remove删除第一个节点的源码，中文注释是我的解读
        // assert f == first && f != null;源代码中就被注释掉的
//        final E element = f.item;//拿到要移除的结点元素，remove方法会返回被删除的元素
//        final LinkedList.Node<E> next = f.next;//拿到要删除节点的一个节点
//        f.item = null; //把要删除节点的内容都置空，让垃圾回收gc自动回收
//        f.next = null; // help GC
//        first = next; //新first就应该是原来第二个节点，也就是next下一个节点
//        if (next == null)//如果为空说明只有这一个节点
//            last = null;//删除之后也就没有节点了，所以为空，first之前等于next 也会为空
//        else
//            next.prev = null;//不为空则第二个节点变成第一个节点了，所以没有上一个节点
//        size--;//数量--
//        modCount++;//操作次数++
//        return element;//返回这个被删除的元素
    }
}
