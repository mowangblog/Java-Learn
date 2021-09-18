package top.mowangblog.code.io.file_;

import java.io.File;
import java.io.IOException;

/**
 * JavaStudy
 * 文件创建
 *
 * @author : Xuan Li
 * @date : 2021-09-16 22:30
 **/
public class FileCreate {
    public static void main(String[] args) throws IOException {
        FileCreate fileCreate = new FileCreate();
        fileCreate.create1();
        fileCreate.create2();
        fileCreate.create3();


    }
    public void create1() throws IOException {
        //第一种方式public File(String pathname)
        File file = new File("D:\\news1.txt");
        //只有执行createNewFile才会真正的在磁盘创建文件
        if (file.createNewFile()) {
            System.out.println("文件创建成功");
        }else {
            System.out.println("文件创建失败");
        }
    }

    public void create2() throws IOException {
        //第二种方式public File(File parent, String child)
        File parentFile = new File("D:\\");
        File file = new File(parentFile, "news2.txt");
        if (file.createNewFile()) {
            System.out.println("文件创建成功");
        }else {
            System.out.println("文件创建失败");
        }
    }

    public void create3() throws IOException {
        //第三种方式public File(String parent, String child)
        String parentFile = "D:\\";
        String fileName = "news3.txt";
        File file = new File(parentFile, fileName);
        if (file.createNewFile()) {
            System.out.println("文件创建成功");
        }else {
            System.out.println("文件创建失败");
        }
    }
}
