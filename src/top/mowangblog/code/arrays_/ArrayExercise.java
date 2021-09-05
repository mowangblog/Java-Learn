package top.mowangblog.code.arrays_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * JavaStudy
 * ArrayExercise
 *
 * @author : Xuan Li
 * @date : 2021-09-05 17:35
 **/
public class ArrayExercise {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        books[0] = new Book("西游记",100.1);
        books[1] = new Book("金瓶梅1",220.1);
        books[2] = new Book("java从入门到放弃",50.1);
        books[3] = new Book("c++从入门到入土",120.1);

        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return (int)(o1.getPrice() - o2.getPrice());
            }
        });
        System.out.println("从低到高");
        for (Book book : books) {
            System.out.println(book);
        }

        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return (int)(o2.getPrice() - o1.getPrice());
            }
        });
        System.out.println("从高到低");
        for (Book book : books) {
            System.out.println(book);
        }

        Arrays.sort(books, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o2.getName().length() - o1.getName().length();
            }
        });
        System.out.println("按书名长度排序");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
class Book{
    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
