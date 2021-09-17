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
public class FileMethod {
    public static void main(String[] args) {

    }

    @Test
    public void info() throws IOException {
        File file = new File("D:/news");
        //创建文件
        if (file.createNewFile()) {
            System.out.println("文件创建成功");
        }else {
            System.out.println("文件创建失败");
        }
        //获得文件名
        System.out.println("file.getName() = " + file.getName());

        //获得文件绝对路径
        System.out.println("file.getAbsolutePath() = " + file.getAbsolutePath());

        //获取文件父级目录
        System.out.println("file.getParent() = " + file.getParent());

        //文件大小（字节）
        System.out.println("file.length() = " + file.length());

        //文件是否存在
        System.out.println("file.exists() = " + file.exists());

        //是否是文件
        System.out.println("file.isFile() = " + file.isFile());

        //是否是目录
        System.out.println("file.isDirectory() = " + file.isDirectory());
    }
}
