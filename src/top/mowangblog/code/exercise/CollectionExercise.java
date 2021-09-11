package top.mowangblog.code.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 * JavaStudy
 * 集合练习
 *
 * @author : Xuan Li
 * @date : 2021-09-11 21:12
 **/
@SuppressWarnings("all")
public class CollectionExercise {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new News("新冠确诊病例超千万，数百万印度教信徒恒河\"圣浴\"引民众担忧"));
        arrayList.add(new News("男子突然想起两月前钓的鱼还在网兜了，捞起一看赶紧放生"));
        Collections.reverse(arrayList);
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            News next = (News) iterator.next();
            System.out.println(CollectionExercise.processTitle(next.getTitle()));
        }
        for (Object o : arrayList) {
            News next = (News) o;
            System.out.println(CollectionExercise.processTitle(next.getTitle()));
        }
        Collections.reverse(arrayList);
        for (int i = arrayList.size() - 1; i >= 0; i--) {
            News news = (News) arrayList.get(i);
            System.out.println(CollectionExercise.processTitle(news.getTitle()));

        }
    }

    public static String processTitle(String string) {
        return string.length() > 15 ? string.substring(0, 15) + "..." : string;
    }
}

class News {
    private String title;
    private String content;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "New{" +
                "title='" + title + '\'' +
                '}';
    }

    public News(String title) {
        this.title = title;
    }
}
