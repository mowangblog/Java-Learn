package top.mowangblog.code.synchronized_;

/**
 * Java-Learn
 * 模拟多线程售票
 *
 * @author : Xuan Li
 * @date : 2021-09-15 14:34
 **/
public class SellTicketSyn {
    public static void main(String[] args) {
        SynchronizeWindows synchronizeWindows = new SynchronizeWindows();
//        new Thread(synchronizeWindows).start();
//        new Thread(synchronizeWindows).start();
//        new Thread(synchronizeWindows).start();
        new Windows().start();
        new Windows().start();
        new Windows().start();

    }
}

class SynchronizeWindows implements Runnable {
    public int ticket = 100;
    private boolean loop = true;

    //互斥锁，同一时间只能有一个线程操作该方法
    //这时锁加在this对象，同步代码块
    private synchronized void sell() {
        if (ticket <= 0) {
            System.out.println("使用synchronize的runnable方式票卖光了");
            loop = false;
            return;
        }
        try {
            Thread.sleep(100);
            System.out.println(Thread.currentThread().getName() + "窗口售票" + (--ticket));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        while (loop) {
            sell();
        }
    }
}

class Windows extends Thread {
    public static int ticket = 100;
    public static Object object = new Object();
    private static boolean loop  = true;

    public static void sell(){
        //同步代码块，互斥锁，加锁的必须是线程共享的同一个对象
        //继承thread类不能使用this,因为不是同一对象
        //普通方法默认this,使用static默认 当前类.class
        synchronized (/*this  object*/ Windows.class){
            if (ticket <= 0) {
                System.out.println("synchronize票卖光了");
                loop = false;
                return;
            }
            try {
                Thread.sleep(100);
                System.out.println(Thread.currentThread().getName() + "窗口售票" + (--ticket));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public void run() {
        while (loop) {
           sell();
        }

    }
}

class WindowsRunnable implements Runnable {
    public int ticket = 100;

    @Override
    public void run() {
        while (true) {
            if (ticket <= 0) {
                System.out.println("不使用synchronize的runnable方式票卖光了");
                break;
            }
            try {
                Thread.sleep(100);
                System.out.println(Thread.currentThread().getName() + "窗口售票" + (--ticket));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
