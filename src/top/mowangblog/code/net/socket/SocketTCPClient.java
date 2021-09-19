package top.mowangblog.code.net.socket;

import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * JavaStudy
 * 客户端
 *
 * @author : Xuan Li
 * @date : 2021-09-19 19:51
 **/
public class SocketTCPClient {
    public static void main(String[] args) throws Exception {
        //连接本地的9999端口，成功返回socket对象
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);

        System.out.println(socket.getClass());

        //获取输出流
        OutputStream outputStream = socket.getOutputStream();
        System.out.println(outputStream);

        outputStream.write("hello 网络编程".getBytes());
        outputStream.close();
        socket.close();
    }
}
