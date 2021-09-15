package top.mowangblog.code.thread_;

/**
 * JavaStudy
 * 线程的使用1
 *
 * @author : Xuan Li
 * @date : 2021-09-14 23:32
 **/
public class ThreadDemo02 implements Runnable {
    public static void main(String[] args) throws InterruptedException {
        ThreadDemo02 threadDemo02 = new ThreadDemo02();
        Thread thread = new Thread(threadDemo02);
        thread.start();
        Cat cat = new Cat();

        //模拟传入实现rannable接口的类，代理运行run方法
        Proxy proxy = new Proxy(cat);
        proxy.start();

        int size = 10;
        //启动线程主线程不会阻塞，继续执行
        for (int i = 0; i < size; i++) {
            System.out.println(i + Thread.currentThread().getName());
            Thread.sleep(1000);
        }
    }

    @Override
    public void run() {
        int times = 0;
        while (true) {
            try {
                System.out.println("山东菏泽曹县牛逼666我了个宝贝er" + (++times) + Thread.currentThread().getName());
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
class Animal{};

class Cat extends Animal implements Runnable{

    @Override
    public void run() {
        System.out.println("线程通过代理模式实现run方法模拟");
    }
}

class Proxy implements Runnable {
    public Proxy(Runnable target) {
        this.target = target;
    }

    private Runnable target = null;


    @Override
    public void run() {
        if (target != null){
            target.run();
        }
    }

    public void start() {
        start0();
    }

    private void start0() {
        run();
    }
}
