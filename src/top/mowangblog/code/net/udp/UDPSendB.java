package top.mowangblog.code.net.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * JavaStudy
 * udp
 *
 * @author : Xuan Li
 * @date : 2021-09-20 10:12
 **/
public class UDPSendB {
    public static void main(String[] args) throws Exception {
        //创建DatagramSocket，准备在9998端口上接发数据
        DatagramSocket datagramSocket = new DatagramSocket(9998);

        //把需要发送的数据封装到DatagramPacket
        byte[] bytes = "hello，utp协议".getBytes();
        InetAddress byName = InetAddress.getByName("192.168.1.122");
        DatagramPacket packet = new DatagramPacket(bytes, 0, bytes.length, byName, 9999);

        //发送数据
        datagramSocket.send(packet);

        //接受回复数据
        byte[] buffer = new byte[1024];
        packet = new DatagramPacket(buffer,buffer.length);
        datagramSocket.receive(packet);

        //提取数据并打印
        int len = packet.getLength();
        byte[] data = packet.getData();
        System.out.println(new String(data,0,len));

        //关闭资源
        datagramSocket.close();
        System.out.println("数据发送完毕");
    }
}
