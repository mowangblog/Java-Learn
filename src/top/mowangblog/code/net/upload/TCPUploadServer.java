package top.mowangblog.code.net.upload;

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
public class TCPUploadServer {
    public static void main(String[] args) {
        //监听9999端口，等待连接
        ServerSocket serverSocket = null;
        Socket socket = null;
        BufferedInputStream bufferedReader = null;
        BufferedOutputStream bufferedWriter = null;
        FileOutputStream fileOutputStream = null;
        String filePath = "src/logo.gif";
        try {
            serverSocket = new ServerSocket(9999);
            System.out.println("服务器等待连接");
            socket = serverSocket.accept();
            //获取流
            fileOutputStream = new FileOutputStream(filePath);
            bufferedReader = new BufferedInputStream(socket.getInputStream());
            bufferedWriter = new BufferedOutputStream(socket.getOutputStream());
            //服务端接受消息，把图片写入到本地
            byte[] buffer = new byte[1024];
            int readLen = 0;
            while ((readLen = bufferedReader.read(buffer)) != -1){
                fileOutputStream.write(buffer,0,readLen);
            }
            fileOutputStream.flush();
            socket.shutdownInput();
            //服务端发送消息
            if (new File(filePath).exists()) {
                bufferedWriter.write("图片接收成功".getBytes());
            }else {
                bufferedWriter.write("图片接收失败".getBytes());
            }
            bufferedWriter.flush();
            socket.shutdownOutput();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileOutputStream != null) {
                    fileOutputStream.close();
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
