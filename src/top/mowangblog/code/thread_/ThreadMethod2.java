package top.mowangblog.code.thread_;

/**
 * Java-Learn
 * 线程的常用方法
 *
 * @author : Xuan Li
 * @date : 2021-09-15 14:56
 **/
public class ThreadMethod2 {
    public static void main(String[] args) throws InterruptedException {
        ThreadDemo2 threadDemo2 = new ThreadDemo2();
        threadDemo2.start();

        int cont = 20;
        for (int i = 0; i < cont; i++) {
            Thread.sleep(1000);
            System.out.println(Thread.currentThread().getName() + "线程执行" + i);
            if(i == 5){
                //join插队，只有当threadDemo2执行完毕后才会继续执行
//                threadDemo2.join();
                //yield 礼让，让出时间不确定，是否让出不确定，由cpu根据资源是否紧张决定
                Thread.yield();
            }

        }
    }
}

class ThreadDemo2 extends Thread {
    private int cont = 0;
    @Override
    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName() + "线程执行" + (++cont));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if(cont == 20) {
                System.out.println(Thread.currentThread().getName() + "线程执行完毕");
                break;
            }
        }
    }
}
