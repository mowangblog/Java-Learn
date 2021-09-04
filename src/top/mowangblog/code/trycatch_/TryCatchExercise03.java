package top.mowangblog.code.trycatch_;

/**
 * JavaStudy
 * TryCatchExercise
 *
 * @author : Xuan Li
 * @date : 2021-09-04 15:34
 **/
public class TryCatchExercise03 {
    public static int method() {
        int i = 1;
        try {
            i++;
            String name = "lixuan";
            String[] names = new String[3];
            if (names[1].equals(name)) {
                System.out.println(names[1]);
            } else {
                names[3] = "mowang";
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            return i;
        } catch (NullPointerException e) {
            return ++i;
            //因为finally会使用临时变量保存 temp = 3; 返回值为三
        } finally {
            i++;
            System.out.println(i);
            //finally 一定会执行
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(method());
    }
}
