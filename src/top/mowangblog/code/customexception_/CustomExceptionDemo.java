package top.mowangblog.code.customexception_;

import java.util.Scanner;

/**
 * JavaStudy
 * customException
 *
 * @author : Xuan Li
 * @date : 2021-09-04 16:38
 **/
public class CustomExceptionDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        if (age<0){
            throw new AgeException("年龄不能为负数");
        }
    }
}
class AgeException extends RuntimeException{
    public AgeException(String message) {
        super(message);
    }
}
