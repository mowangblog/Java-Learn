package top.mowangblog.code.date_;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * JavaStudy
 * 第三代日期
 *
 * @author : Xuan Li
 * @date : 2021-09-05 22:46
 **/
public class LocalDateDemo {
    public static void main(String[] args) {
        //第三代日期
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        System.out.println("localDateTime.getYear() = " + localDateTime.getYear());
        System.out.println("localDateTime.getMonth() = " + localDateTime.getMonthValue());
        System.out.println("localDateTime.getDayOfMonth() = " + localDateTime.getDayOfMonth());
        System.out.println("localDateTime.getHour() = " + localDateTime.getHour());
        System.out.println("localDateTime.getMinute() = " + localDateTime.getMinute());
        System.out.println("localDateTime.getSecond() = " + localDateTime.getSecond());

        //DateTimeFormatter
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("df.format(localDateTime) = " + df.format(localDateTime));

        //日期加减
        System.out.println("localDateTime.plusDays(890) = " + df.format(localDateTime.plusDays(890)));
        System.out.println("localDateTime.minusMinutes(3456) = " + df.format(localDateTime.minusMinutes(3456)));

        //判断日期是否是闰年
        LocalDate localDate = localDateTime.toLocalDate();
        LocalTime localTime = localDateTime.toLocalTime();
        localTime = localTime.plusHours(1);
        System.out.println("localDate.isLeapYear() = " + localDate.isLeapYear());
        System.out.println("LocalDateTime.of(localDate,localTime) = " + df.format(LocalDateTime.of(localDate, localTime)));
    }
}
