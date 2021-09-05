package top.mowangblog.code.bignumber;

import java.math.BigInteger;

/**
 * JavaStudy
 * Exercise
 *
 * @author : Xuan Li
 * @date : 2021-09-05 21:52
 **/
public class BigIntegerDemo {
    public static void main(String[] args) {
        //long不够用时
        BigInteger bigInteger = new BigInteger("11111111111111111111111111111111111");
        //加
        System.out.println(bigInteger.add(new BigInteger("1123")));
        //减
        System.out.println(bigInteger.subtract(new BigInteger("31231")));
        //乘
        System.out.println(bigInteger.multiply(new BigInteger("31231")));
        //除
        System.out.println(bigInteger.divide(new BigInteger("31123121231")));
    }
}
