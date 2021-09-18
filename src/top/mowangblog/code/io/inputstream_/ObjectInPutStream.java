package top.mowangblog.code.io.inputstream_;

import java.io.*;

/**
 * JavaStudy
 * 对象输出流
 *
 * @author : Xuan Li
 * @date : 2021-09-18 20:43
 **/
public class ObjectInPutStream {
    public static void main(String[] args) {
        String filePath = "D:/test.dat";
        ObjectInputStream inputStream = null;

        try {
            inputStream = new ObjectInputStream(new FileInputStream(filePath));
            System.out.println("inputStream.readInt() = " + inputStream.readInt());
            System.out.println("inputStream.readDouble() = " + inputStream.readDouble());
            System.out.println("inputStream.readBoolean() = " + inputStream.readBoolean());
            System.out.println("inputStream.readUTF() = " + inputStream.readUTF());
            System.out.println("inputStream.readObject() = " + inputStream.readObject());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
