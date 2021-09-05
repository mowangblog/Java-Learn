package top.mowangblog.code.math_;

import java.util.Random;

/**
 * JavaStudy
 * exercise
 *
 * @author : Xuan Li
 * @date : 2021-09-05 15:48
 **/
public class MathMethod {
    public static void main(String[] args) {
        //1.abs 求绝对值
        System.out.println("Math.abs(-9) = " + Math.abs(-9));

        //2.pow 求幂
        System.out.println("Math.pow(2, 4) = " + Math.pow(2, 4));

        //3.ceil 向上取整
        System.out.println("Math.ceil(1.4) = " + Math.ceil(1.4));

        //4.floor 向下取整
        System.out.println("Math.floor(2.9) = " + Math.floor(2.9));

        //5.round 四舍五入 Math.floor（参数+0.5）
        System.out.println("Math.round(32.3) = " + Math.round(32.3));

        //6.sqrt 开方
        System.out.println("Math.sqrt(9) = " + Math.sqrt(9));

        //7.random 随机0-1的小数
        for (int i = 0; i < 10; i++) {
            System.out.println((int)(2+(Math.random()*(7-2+1))));
        }

        //8.max,max返回大的数和小的数
        System.out.println("Math.max(10,20) = " + Math.max(10, 20));
        System.out.println("Math.min(10,20) = " + Math.min(10, 20));

    }
}
