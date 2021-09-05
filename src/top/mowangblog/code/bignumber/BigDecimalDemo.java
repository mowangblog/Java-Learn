package top.mowangblog.code.bignumber;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * JavaStudy
 * Exercise
 *
 * @author : Xuan Li
 * @date : 2021-09-05 21:52
 **/
public class BigDecimalDemo {
    public static void main(String[] args) {
        //double精度不够用时
        BigDecimal bigDecimal = new BigDecimal("21333.3244");

        //加
        System.out.println("bigDecimal.add(new BigDecimal(1.21324324)) = " + bigDecimal.add(new BigDecimal(123.21324324)));
        //减
        System.out.println("bigDecimal.subtract(new BigDecimal(\"123.13423413412321341241234\")) = " + bigDecimal.subtract(new BigDecimal("123.13423413412321341241234")));
        //乘
        System.out.println("bigDecimal.multiply(new BigDecimal(\"12.213432\")) = " + bigDecimal.multiply(new BigDecimal("12.213432")));
        //除,可能抛出ArithmeticException 算术异常
        System.out.println("bigDecimal.divide(new BigDecimal(\"33.1123122\")) = " + bigDecimal.divide(new BigDecimal("33.1123122"),BigDecimal.ROUND_CEILING));
    }
}
