package top.mowangblog.code.io.inputstream_;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * JavaStudy
 * FileInputStream demo
 *
 * @author : Xuan Li
 * @date : 2021-09-17 21:20
 **/
@SuppressWarnings("all")
public class FileInputStream01 {
    public static void main(String[] args) throws IOException{


    }
    @Test
    public void readFile01() throws IOException {
        String filePath = "D:/hello.txt";
        int readData = 0;
        FileInputStream fileInputStream = null;
        try {
            //创建FileInputStream对象用于读取文件
            fileInputStream  = new FileInputStream(filePath);
            //从输入流读取一个字节
            //返回-1,表示读取完毕
            while ((readData = fileInputStream.read()) != -1){
                System.out.print(((char) readData));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fileInputStream != null){
                fileInputStream.close();
            }
        }
    }

    @Test
    public void readFile02() throws IOException {
        String filePath = "D:/hello.txt";
        byte[] readByte = new byte[18];
        int readLen = 0;
        FileInputStream fileInputStream = null;
        try {
            //创建FileInputStream对象用于读取文件
            fileInputStream  = new FileInputStream(filePath);
            //从输入流读取一个byte数组长度的数据
            //返回-1,表示读取完毕
            //返回实际读取长度
            while ((readLen = fileInputStream.read(readByte)) != -1){
                System.out.print(new String(readByte,0,readLen));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fileInputStream != null){
                fileInputStream.close();
            }
        }
    }
}
