package top.mowangblog.code.net.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * JavaStudy
 * 客户端
 *
 * @author : Xuan Li
 * @date : 2021-09-19 19:51
 **/
public class SocketTCPClient2 {
    public static void main(String[] args) {
        Socket socket = null;
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            socket = new Socket(InetAddress.getLocalHost(), 9999);
            System.out.println("客户端连接成功");
            outputStream = socket.getOutputStream();
            outputStream.write("hello,server".getBytes());
            socket.shutdownOutput();
            inputStream = socket.getInputStream();
            byte[] buffer = new byte[1024];
            int readLen = 0;
            while ((readLen = inputStream.read(buffer)) != -1){
                System.out.println(new String(buffer,0,readLen));
            }
            socket.shutdownInput();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (outputStream != null) {
                    outputStream.close();
                }
                if (inputStream != null) {
                    inputStream.close();
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
