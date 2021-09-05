package top.mowangblog.code.string_.work;

/**
 * JavaStudy
 * 指定字符反转
 *
 * @author : Xuan Li
 * @date : 2021-09-05 23:21
 **/
public class StringReserve {
    public static void main(String[] args) {
        try {
            String str = "a1234b";
            System.out.println("StringReserve.reserve(str,1,4) = " + StringReserve.reserve(str, 1, 4));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * 使用方法
     */
    public static String reserve(String str, int start, int end) {
        //验证的技巧
        //先写出正确的情况，然后取反
        if (!(str != null && start >= 0 && end > start && end < str.length())) {
            throw new RuntimeException("参数不正确");
        }
        StringBuffer reverse = new StringBuffer(str.substring(start, end + 1)).reverse();
        String result;
        return str.substring(0, start) + reverse.toString() + str.substring(end + 1);
    }

    /**
     * 自己手写
     */
    public static String reserve1(String str, int start, int end) {
        //验证的技巧
        //先写出正确的情况，然后取反
        if (!(str != null && start >= 0 && end > start && end < str.length())) {
            throw new RuntimeException("参数不正确");
        }
        char[] chars = str.toCharArray();
        char temp;
        while (start < end) {
            temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
        return new String(chars);
    }
}
