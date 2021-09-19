package top.mowangblog.code.net.socket;

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
public class SocketTCPClient3 {
    public static void main(String[] args) {
        Socket socket = null;
        BufferedReader bufferedReader = null;
        BufferedWriter bufferedWriter = null;
        try {
            socket = new Socket(InetAddress.getLocalHost(), 9999);
            System.out.println("客户端连接成功");
            bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream(),"utf8"));
            bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(),"utf8"));
            bufferedWriter.write("hello,字符流通信server");
            bufferedWriter.flush();
            socket.shutdownOutput();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
            socket.shutdownInput();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (socket != null) {
                    socket.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
