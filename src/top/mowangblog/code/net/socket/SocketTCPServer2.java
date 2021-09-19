package top.mowangblog.code.net.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * JavaStudy
 * 服务端
 *
 * @author : Xuan Li
 * @date : 2021-09-19 19:51
 **/
public class SocketTCPServer2 {
    public static void main(String[] args) {
        //监听9999端口，等待连接
        ServerSocket serverSocket = null;
        Socket socket = null;
        InputStream inputStream = null;
        OutputStream outputStream = null;
        try {
            serverSocket = new ServerSocket(9999);
            System.out.println("服务器等待连接");
            socket = serverSocket.accept();
            //服务端接受消息
            inputStream = socket.getInputStream();
            byte[] buffer = new byte[128];
            int readLen = 0;
            while ((readLen = inputStream.read(buffer)) != -1){
                System.out.println(new String(buffer,0,readLen));
            }
            socket.shutdownInput();
            //服务端发送消息
            outputStream = socket.getOutputStream();
            outputStream.write("hello,client".getBytes());
            socket.shutdownOutput();
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
                if (serverSocket != null) {
                    serverSocket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
