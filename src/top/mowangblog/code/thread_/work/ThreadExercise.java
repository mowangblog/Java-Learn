package top.mowangblog.code.thread_.work;

import java.util.Scanner;

/**
 * JavaStudy
 * 线程通信练习
 *
 * @author : Xuan Li
 * @date : 2021-09-15 23:05
 **/
public class ThreadExercise {
    public static void main(String[] args) {
        A a = new A();
        new Thread(a).start();
        B b = new B(a);
        b.start();
    }
}

class A implements Runnable {
    public boolean loop = true;

    @Override
    public void run() {
        while (loop) {
            System.out.println((int)(Math.random() * 100 + 1));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean isLoop() {
        return loop;
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}

class B extends Thread {
    A a;

    public B(A a) {
        this.a = a;
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true){
            String next = scanner.next();
            if("Q".equals(next)){
//              A.loop = false;
                a.setLoop(false);
                System.out.println("任务结束");
                break;
            }
        }

    }
}
