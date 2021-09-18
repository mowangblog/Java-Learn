package top.mowangblog.code.io.outputstream_;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * JavaStudy
 * 对象输出流
 *
 * @author : Xuan Li
 * @date : 2021-09-18 20:31
 **/
public class ObjectOutStream {
    public static void main(String[] args) {
        String filePath = "D:/test.dat";
        ObjectOutputStream outStream = null;

        try {
            outStream = new ObjectOutputStream(new FileOutputStream(filePath));
            outStream.writeInt(100);
            outStream.writeDouble(10.0);
            outStream.writeBoolean(false);
            outStream.writeUTF("mowang");
            outStream.writeObject(new Dog("小花",10));

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (outStream != null) {
                try {
                    outStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
