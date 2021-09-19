package top.mowangblog.code.net.socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * JavaStudy
 * 服务端
 *
 * @author : Xuan Li
 * @date : 2021-09-19 19:51
 **/
public class SocketTCPServer {
    public static void main(String[] args) throws Exception {
        //监听9999端口，等待连接
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("客户端等待连接");
        //如果没有连接程序会阻塞在这里，有客户端连接则返回socket对象程序继续
        Socket socket = serverSocket.accept();
        System.out.println(socket.getClass());
        //读取客户端写入到数据通道的数据
        InputStream inputStream = socket.getInputStream();
        byte[] buffer = new byte[128];
        int readLen = 0;
        while ((readLen = inputStream.read(buffer)) != -1) {
            System.out.println(new String(buffer,0,readLen));
        }
        //关闭流
        inputStream.close();
        socket.close();
        serverSocket.close();
    }
}
