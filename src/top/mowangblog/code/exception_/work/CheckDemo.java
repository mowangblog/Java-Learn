package top.mowangblog.code.exception_.work;

import java.util.Scanner;

/**
 * JavaStudy
 * 注册校验姓名密码和邮箱，错误抛出异常
 *
 * @author : Xuan Li
 * @date : 2021-09-05 23:50
 **/
public class CheckDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String password = scanner.next();
        String email = scanner.next();
        try {
            CheckDemo.register(name, password, email);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void register(String name, String password, String email) {
        if (!(name != null && password != null && email != null)) {
            throw new RuntimeException("参数不能为空");
        }
        if (!(name.length() >= 2 && name.length() <= 4)) {
            throw new RuntimeException("姓名长度不符合规范");
        }
        if (!(password.length() == 6 && isNumber(password))) {
            throw new RuntimeException("密码只能是纯数字，长度为6");
        }
        if (!(email.indexOf('@') > -1 && email.indexOf('@') < email.indexOf('.'))) {
            throw new RuntimeException("邮箱必须包含@和.并且@在.之前");
        }
        System.out.println("恭喜您" + name + "注册成功");
    }

    private static boolean isNumber(String password) {
        for (int i = 0; i < password.length(); i++) {
            if (!(password.charAt(i) >= 48 && password.charAt(i) <= 57)) {
                return false;
            }
        }
        return true;
    }
}
