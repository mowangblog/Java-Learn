package top.mowangblog.code.net.upload;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * JavaStudy
 * 客户端
 *
 * @author : Xuan Li
 * @date : 2021-09-19 19:51
 **/
@SuppressWarnings("all")
public class TCPUploadClient {
    public static void main(String[] args) {
        Socket socket = null;
        BufferedInputStream bufferedReader = null;
        BufferedOutputStream bufferedWriter = null;
        FileInputStream fileInputStream = null;
        String filePath = "D:/logo.gif";
        try {
            socket = new Socket(InetAddress.getLocalHost(), 9999);
            System.out.println("客户端连接成功");
            fileInputStream = new FileInputStream(filePath);
            bufferedReader = new BufferedInputStream(socket.getInputStream());
            bufferedWriter = new BufferedOutputStream(socket.getOutputStream());
            //读取图片到输入流并传送给服务端
            byte[] buffer = new byte[1024];
            int readLen = 0;
            while ((readLen = fileInputStream.read(buffer)) != -1){
                bufferedWriter.write(buffer,0,readLen);
            }
            bufferedWriter.flush();
            socket.shutdownOutput();
            //接受服务器传回的消息
            while ((readLen = bufferedReader.read(buffer)) != -1){
                System.out.println(new String(buffer,0,readLen));
            }
            socket.shutdownInput();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (socket != null) {
                    socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
