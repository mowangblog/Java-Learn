package top.mowangblog.code.net.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * JavaStudy
 * udp
 *
 * @author : Xuan Li
 * @date : 2021-09-20 10:13
 **/
public class UDPReceiverA {
    public static void main(String[] args) throws Exception {
        //创建DatagramSocket，在9999端口接发数据
        DatagramSocket datagramSocket = new DatagramSocket(9999);

        //创建DatagramPacket对象准备接收数据，udp协议一个数据包最大63kb
        byte[] buffer = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buffer,buffer.length);

        //调用receive方法传输数据，如果没有数据发送到9999端口就会阻塞等待
        System.out.println("等待数据传输");
        datagramSocket.receive(packet);

        //把DatagramPacket进行拆包，拿到数据
        int len = packet.getLength();
        byte[] data = packet.getData();
        System.out.println(new String(data,0,len));

        //发送回复数据到9998端口
        buffer = "hello to send".getBytes();
        InetAddress byName = InetAddress.getByName("192.168.1.122");
        packet = new DatagramPacket(buffer, 0, buffer.length, byName, 9998);
        datagramSocket.send(packet);

        //关闭资源
        datagramSocket.close();

    }
}
