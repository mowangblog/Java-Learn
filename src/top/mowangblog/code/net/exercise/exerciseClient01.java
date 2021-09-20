package top.mowangblog.code.net.exercise;

import top.mowangblog.code.net.StreamUtil;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * JavaStudy
 * 客户端
 *
 * @author : Xuan Li
 * @date : 2021-09-20 10:44
 **/
public class exerciseClient01 {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket(InetAddress.getLocalHost(),9999);
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        while (true) {
            System.out.println("输入你要传输的话：");
            Scanner scanner = new Scanner(System.in);
            String next = scanner.next();
            bufferedWriter.write(next);
            bufferedWriter.newLine();
            bufferedWriter.flush();
//        socket.shutdownOutput();
            String str = bufferedReader.readLine();
            System.out.println(str);
        }
//        socket.shutdownInput();
//        socket.close();
    }
}
