package top.mowangblog.code.date_;

import java.util.Calendar;

/**
 * JavaStudy
 * 日历，第二代日期类
 *
 * @author : Xuan Li
 * @date : 2021-09-05 22:29
 **/
public class CalendarExercise {
    public static void main(String[] args) {
        //通过getInstance获得实例，calendar没有自己的格式化方法，需要自己组合
        Calendar calendar = Calendar.getInstance();
        System.out.println("calendar.get(Calendar.YEAR) = " + calendar.get(Calendar.YEAR));
        System.out.println("calendar.get(Calendar.MONTH+1) = " + (calendar.get(Calendar.MONTH)+1));
        System.out.println("calendar.get(Calendar.DAY_OF_MONTH) = " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("calendar.get(Calendar.HOUR) = " + calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("calendar.get(Calendar.MINUTE) = " + calendar.get(Calendar.MINUTE));
        System.out.println("calendar.get(Calendar.SECOND) = " + calendar.get(Calendar.SECOND));
    }
}
