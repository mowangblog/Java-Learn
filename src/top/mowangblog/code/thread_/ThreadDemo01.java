package top.mowangblog.code.thread_;

/**
 * JavaStudy
 * 线程的使用1
 *
 * @author : Xuan Li
 * @date : 2021-09-14 23:32
 **/
public class ThreadDemo01 extends Thread {
    public static void main(String[] args) throws InterruptedException {
        ThreadDemo01 threadDemo01 = new ThreadDemo01();
        threadDemo01.start();
        //启动线程主线程不会阻塞，继续执行
        for (int i = 0; i < 55; i++) {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }

    @Override
    public void run() {
        super.run();
        int times = 0;
        while (true) {
            try {
                System.out.println("山东菏泽曹县牛逼666我了个宝贝" + (++times));
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (times == 80) {
                break;
            }
        }
    }
}
