package top.mowangblog.code.string_;

/**
 * JavaStudy
 * StringExercise
 *
 * @author : Xuan Li
 * @date : 2021-09-04 21:09
 **/
@SuppressWarnings("all")//拦截所有警告
public class StringExercise03 {
    String str = new String("lixuan");
    final char[] ch = {'j','a','v','a'};
    public void change(String str,char ch[]){
        str = "mowang";
        ch[0] = 'm';
    }

    public static void main(String[] args) {
        StringExercise03 stringExercise03 = new StringExercise03();
        stringExercise03.change(stringExercise03.str,stringExercise03.ch);
        System.out.println(stringExercise03.str);
        System.out.println(stringExercise03.ch);
    }
}
