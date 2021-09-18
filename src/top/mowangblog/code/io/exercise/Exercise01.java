package top.mowangblog.code.io.exercise;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * JavaStudy
 * io流练习
 *
 * @author : Xuan Li
 * @date : 2021-09-18 21:58
 **/
public class Exercise01 {
    public static void main(String[] args) throws IOException {
        File file = new File("D:/myTemp");

        if (!file.exists()) {
            file.mkdir();
        }
        File newFile = new File(file, "hello.txt");
        if (newFile.exists()) {
            System.out.println("该文件已存在");
        }else {
            if (newFile.createNewFile()) {
                System.out.println("创建成功");
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(newFile));
                bufferedWriter.write("mowangblog");
                bufferedWriter.newLine();
                bufferedWriter.write("李煊");
                bufferedWriter.close();
            }else {
                System.out.println("创建失败");
            }
        }

    }
}
