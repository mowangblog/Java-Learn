package top.mowangblog.code.string_.work;

/**
 * JavaStudy
 * Statistics
 *
 * @author : Xuan Li
 * @date : 2021-09-06 00:20
 **/
public class StringStatistics {
    public static void main(String[] args) {
        StringStatistics.statistics("fsdafajsFJDIKSDAJ231432");
    }

    public static void statistics(String str) {
        int low = 0, high = 0, num = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                num++;
            }
            if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z'){
                low++;
            }
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z'){
                high++;
            }
        }
        System.out.println("大写："+high+"，小写："+low+",数字："+num);
    }
}
