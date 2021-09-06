package top.mowangblog.code.list_;

import java.util.*;

/**
 * JavaStudy
 * ListWork
 *
 * @author : Xuan Li
 * @date : 2021-09-06 20:30
 **/
@SuppressWarnings("all")
public class ListWork {
    public static void main(String[] args) {
        List arrayList = new LinkedList();
        arrayList.add(new Book("西游记","吴承恩",111));
        arrayList.add(new Book("三国演义","罗贯中",31.1));
        arrayList.add(new Book("水浒传","施耐庵",354.2));
        arrayList.add(new Book("红楼梦","曹雪芹",34.6));
        //手动排序
        for (int i = 0; i < arrayList.size() - 1; i++) {
            for (int j = 0; j < arrayList.size() - i -1; j++) {
                if(((Book) arrayList.get(j)).getPrice() < ((Book) arrayList.get(j + 1)).getPrice()){
                    Book book = (Book) arrayList.get(j);
                    arrayList.set(j,arrayList.get(j+1));
                    arrayList.set(j+1,book);
                }
            }
        }
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            if (next instanceof Book) {
                Book book = (Book) next;
                System.out.println(book.getName()+" "+book.getPrice());
            }
        }
        System.out.println("=================");
        //使用方法
        Collections.sort(arrayList, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return (int) (o1.getPrice() - o2.getPrice());
            }
        });
        iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            if (next instanceof Book) {
                Book book = (Book) next;
                System.out.println(book.getName()+" "+book.getPrice());
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
