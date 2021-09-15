package top.mowangblog.code.thread_;

/**
 * Java-Learn
 * 模拟多线程售票
 *
 * @author : Xuan Li
 * @date : 2021-09-15 14:34
 **/
public class SellTicket {
    public static void main(String[] args) {
        Windows windows1 = new Windows();
        Windows windows2 = new Windows();
        Windows windows3 = new Windows();
        windows1.start();
        windows2.start();
        windows3.start();

        WindowsRunnable windowsRunnable = new WindowsRunnable();
        new Thread(windowsRunnable).start();
        new Thread(windowsRunnable).start();
        new Thread(windowsRunnable).start();

    }
}

class Windows extends Thread {
    public static int ticket = 100;

    @Override
    public void run() {
        while (true) {
            if (ticket <= 0) {
                System.out.println("票卖光了");
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

class WindowsRunnable implements Runnable {
    public int ticket = 100;

    @Override
    public void run() {
        while (true) {
            if (ticket <= 0) {
                System.out.println("runnable方式票卖光了");
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
