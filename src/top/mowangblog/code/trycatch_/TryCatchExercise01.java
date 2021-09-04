package top.mowangblog.code.trycatch_;

/**
 * JavaStudy
 * TryCatchExercise
 *
 * @author : Xuan Li
 * @date : 2021-09-04 15:34
 **/
public class TryCatchExercise01 {
    public static int method() {
        try {
            String[] names = new String[3];
            if (names[1].equals("lixuan")) {
                System.out.println(names[1]);
            } else {
                names[3] = "mowang";
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            return 1;
        } catch (NullPointerException e){
            return 2;
        } finally {
            return 4;
            //finally 一定会执行
        }
    }
    public static void main(String[] args) {
        System.out.println(method());
    }
}
