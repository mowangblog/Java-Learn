package top.mowangblog.code.trycatch_.work;

import java.util.Scanner;

/**
 * JavaStudy
 * TryCatchExercise
 *
 * @author : Xuan Li
 * @date : 2021-09-04 15:49
 **/
public class TryCatchExerciseWork {
    public static void main(String[] args) {
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("请输入一个整数：");
                String next = scanner.next();
                int i = Integer.parseInt(next);
                System.out.println(i);
                break;
            } catch (NumberFormatException e) {
                System.out.println("你输入的不是一个整数：");
            }
        }

    }
}
