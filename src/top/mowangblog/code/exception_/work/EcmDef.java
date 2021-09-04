package top.mowangblog.code.exception_.work;

import java.util.Scanner;

/**
 * JavaStudy
 * homework
 *
 * @author : Xuan Li
 * @date : 2021-09-04 16:52
 **/
public class EcmDef {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            int n1 = Integer.parseInt(scanner.next());
            int n2 = Integer.parseInt(scanner.next());
            int cal = EcmDef.cal(n1, n2);
            System.out.println(cal);
        } catch (ArithmeticException e) {
            System.out.println("算术异常");
        } catch (NumberFormatException e) {
            System.out.println("数字格式异常");
        } catch (NullPointerException e) {
            System.out.println("空指针异常");
        }
    }

    public static int cal(int n1, int n2) throws ArithmeticException {
        return n1 / n2;
    }
}
