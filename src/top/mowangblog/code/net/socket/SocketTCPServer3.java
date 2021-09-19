package top.mowangblog.code.net.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * JavaStudy
 * 服务端
 *
 * @author : Xuan Li
 * @date : 2021-09-19 19:51
 **/
@SuppressWarnings("all")
public class SocketTCPServer3 {
    public static void main(String[] args) {
        //监听9999端口，等待连接
        ServerSocket serverSocket = null;
        Socket socket = null;
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            serverSocket = new ServerSocket(9999);
            System.out.println("服务器等待连接");
            socket = serverSocket.accept();
            bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream(),"utf8"));
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(),"utf8"));
            //服务端接受消息
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            socket.shutdownInput();
            //服务端发送消息
            bufferedWriter.write("hello,字符流通信client");
            bufferedWriter.flush();
            socket.shutdownOutput();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
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
