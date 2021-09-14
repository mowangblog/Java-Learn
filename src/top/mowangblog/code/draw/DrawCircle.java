package top.mowangblog.code.draw;

import javax.swing.*;
import java.awt.*;

/**
 * JavaStudy
 * 画圆
 *
 * @author : Xuan Li
 * @date : 2021-09-12 15:08
 **/
public class DrawCircle extends JFrame{
    private MyPanel myPanel = null;
    public static void main(String[] args) {
        new DrawCircle();
    }
    public DrawCircle(){
        myPanel = new MyPanel();
        this.add(myPanel);
        this.setSize(1500,1500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}

class MyPanel extends JPanel{

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        //画椭圆形
        g.drawOval(10,10,100,100);
        g.setColor(Color.RED);
        g.fillOval(100,100,100,100);

        //矩形
        g.fillRect(100,200,300,300);
        //图片
        Image image = Toolkit.getDefaultToolkit().getImage("D:\\Study\\MyStudy\\Myjava\\JavaStudy\\src\\top\\mowangblog\\code\\draw\\dongman.jpeg");
        g.drawImage(image,500,200,720,450,this);
        //字符串
        g.setColor(Color.BLACK);
        g.setFont(new Font("隶书",Font.BOLD,50));
        g.drawString("魔王の博客",500,140);

        //坦克
        g.setColor(Color.CYAN);
        g.fillRect(900,100,10,40);
        g.fillRect(930,100,10,40);
        g.setColor(Color.gray);
        g.fillRect(910,105,20,30);
        g.setColor(Color.MAGENTA);
        g.fillOval(913,112,15,15);
        g.fillRect(918,90,5,25);
    }
}