package top.mowangblog.code.io.reader_;

import org.junit.Test;

import java.io.FileReader;
import java.io.IOException;

/**
 * JavaStudy
 * 字符流文件读取
 *
 * @author : Xuan Li
 * @date : 2021-09-17 22:41
 **/
public class FileReader01 {
    public static void main(String[] args) {

    }
    @Test
    public void readFile01(){
        String filePath = "D:/hello.txt";
        FileReader fileReader = null;

        try {
            fileReader = new FileReader(filePath);
            int read = 0;
            //一个字符一个字符读
            while ((read = fileReader.read()) != -1){
                System.out.print(((char) read));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void readFile02(){
        String filePath = "D:/hello.txt";
        FileReader fileReader = null;

        try {
            fileReader = new FileReader(filePath);
            char[] chars = new char[128];
            int readLen = 0;
            //字符数组读一次128个字符
            while ((readLen = fileReader.read(chars)) != -1){
                System.out.print(new String(chars,0,readLen));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
