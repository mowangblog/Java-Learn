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
@SuppressWarnings("all")
public class exerciseServer02 {
    public static void main(String[] args) throws Exception {
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端等待连接");
        Socket socket = serverSocket.accept();
        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        String s = bufferedReader.readLine();
        File file = new File("src/static/"+s+".mp3");
        if(!file.exists()){
            System.out.println("没有找到该文件，下载默认文件");
            file = new File("src/static/小镇姑娘.mp3");
        }
        bufferedWriter.write(file.getName());
        bufferedWriter.newLine();
        bufferedWriter.flush();

        byte[] bytes = StreamUtil.streamToByteArray(new FileInputStream(file));
        outputStream.write(bytes);
        outputStream.flush();
        socket.shutdownOutput();

        outputStream.close();
        bufferedWriter.close();
        bufferedReader.close();
        socket.close();
        serverSocket.close();


    }
}
