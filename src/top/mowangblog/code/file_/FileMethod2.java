package top.mowangblog.code.file_;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * JavaStudy
 * 文件类方法
 *
 * @author : Xuan Li
 * @date : 2021-09-16 22:48
 **/
public class FileMethod2 {
    public static void main(String[] args) {

    }
    //java中目录也被当做文件，可以理解为图特殊的文件
    @Test
    public void info() throws IOException {
        File file = new File("D:/news.txt");
        if(file.exists()){
            System.out.println("file.delete() = " + file.delete());
        }else {
            System.out.println("该文件不存在");
        }
    }

    @Test
    public void info2() throws IOException {
        File file = new File("D:/a/b/c");
        if(!file.exists()){
            //创建多级目录要用mkdirs
            if (file.mkdirs()) {
                System.out.println("目录创建成功");
            }else {
                System.out.println("目录创建失败");
            }
        }else {
            System.out.println("该目录已存在");
        }
    }
}
