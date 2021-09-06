package top.mowangblog.code.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * JavaStudy
 * Iterator
 *
 * @author : Xuan Li
 * @date : 2021-09-06 20:30
 **/
@SuppressWarnings("all")
public class CollectionIterator {
    public static void main(String[] args) {
        Collection arrayList = new ArrayList();
        arrayList.add(new Book("西游记","吴承恩",111));
        arrayList.add(new Book("三国演义","罗贯中",31.1));
        arrayList.add(new Book("水浒传","施耐庵",354.2));
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            if (next instanceof Book) {
                System.out.println(((Book) next).getName());
            }
        }
        //重置迭代器
        iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            if (next instanceof Book) {
                System.out.println(((Book) next).getName());
            }
        }

    }
}
class Book{
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
