package top.mowangblog.code.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * JavaStudy
 * Inet
 *
 * @author : Xuan Li
 * @date : 2021-09-19 19:23
 **/
@SuppressWarnings("all")
public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        //获取本机的InetAddress对象
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);//MoWang/192.168.64.1

        //根据主机名获取InetAddress对象
        InetAddress moWang = InetAddress.getByName("MoWang");
        System.out.println(moWang);

        //根据域名获取InetAddress对象
        InetAddress byName = InetAddress.getByName("mowangblog.top");
        System.out.println(byName);
        //获取ip
        System.out.println("byName.getAddress() = " + byName.getHostAddress());
        //获取主机名或者域名
        System.out.println("byName.getHostName() = " + byName.getHostName());
    }
}
