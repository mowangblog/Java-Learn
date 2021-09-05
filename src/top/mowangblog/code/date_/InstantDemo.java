package top.mowangblog.code.date_;

import java.time.Instant;
import java.util.Date;

/**
 * JavaStudy
 * instant
 *
 * @author : Xuan Li
 * @date : 2021-09-05 23:04
 **/
public class InstantDemo {
    public static void main(String[] args) {
        //instant 和 Date 互相转换
        Instant instant = Instant.now();
        System.out.println(instant);
        Date date = Date.from(instant);
        System.out.println(date);
        instant = date.toInstant();
        System.out.println(instant);

    }
}
