package top.mowangblog.code.net.exercise;

import top.mowangblog.code.net.StreamUtil;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * JavaStudy
 * 服务端
 *
 * @author : Xuan Li
 * @date : 2021-09-20 10:44
 **/
public class exerciseServer01 {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端等待连接");
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        while (true) {
            String str = bufferedReader.readLine();
            System.out.println(str);
//            socket.shutdownInput();
            String answer = "";
            if ("name".equals(str)){
                answer = "我是李煊";
            }else if ("hobby".equals(str)){
                answer = "我爱java";
            }else {
                answer = "你说哈";
            }
            bufferedWriter.write(answer);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
//        socket.shutdownOutput();

//        socket.close();
//        serverSocket.close();
    }
}
