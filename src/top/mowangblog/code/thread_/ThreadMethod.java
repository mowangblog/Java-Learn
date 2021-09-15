package top.mowangblog.code.thread_;

/**
 * Java-Learn
 * 线程的常用方法
 *
 * @author : Xuan Li
 * @date : 2021-09-15 14:56
 **/
public class ThreadMethod {
    public static void main(String[] args) throws InterruptedException {
        ThreadDemo threadDemo = new ThreadDemo();
        //设置线程名
        threadDemo.setName("李煊");
        //设置线程优先级
        threadDemo.setPriority(Thread.MIN_PRIORITY);
        threadDemo.start();
        //主线程休眠五秒
        Thread.sleep(1000 * 5);
        //五秒后中断子线程的休眠
        threadDemo.interrupt();
    }
}

class ThreadDemo extends Thread {
    @Override
    public void run() {
        while (true) {
            int cont = 10;
            for (int i = 0; i < cont; i++) {
                System.out.println(Thread.currentThread().getName() + "的线程" + i);
            }
            try {
                Thread.sleep(1000 * 20);
            } catch (InterruptedException e) {
                //调用Interrupted会触发一个异常中断线程休眠
                System.out.println("Interrupted线程休眠中断");
            }
        }
    }
}
