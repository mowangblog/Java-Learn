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
public class exerciseClient02 {
    public static void main(String[] args) throws Exception{
        Socket socket = new Socket(InetAddress.getLocalHost(),9999);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        InputStream inputStream = socket.getInputStream();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你要下载的音乐名");
        String next = scanner.next();
        bufferedWriter.write(next);
        bufferedWriter.newLine();
        bufferedWriter.flush();

        String s = bufferedReader.readLine();
        System.out.println(s);
        next = "src/downloadFile/"+s;
        byte[] bytes = StreamUtil.streamToByteArray(inputStream);
        OutputStream outputStream = new FileOutputStream(next);
        outputStream.write(bytes);

        File file = new File(next);
        if(file.exists()){
            System.out.println("下载成功");
        }else {
            System.out.println("下载失败");
        }
        outputStream.close();
        bufferedReader.close();
        bufferedWriter.close();
        socket.close();
    }
}
