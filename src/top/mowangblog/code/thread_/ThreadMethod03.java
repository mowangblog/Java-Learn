package top.mowangblog.code.thread_;

/**
 * JavaStudy
 * 守护线程
 *
 * @author : Xuan Li
 * @date : 2021-09-15 20:29
 **/
public class ThreadMethod03 {
    public static void main(String[] args) throws InterruptedException {
        MyDaemonThread myDaemonThread = new MyDaemonThread();
        //设置子线程为守护线程，主线程退出子线程自动结束
        myDaemonThread.setDaemon(true);
        myDaemonThread.start();
        int cont = 10;
        for (int i = 0; i < cont; i++) {
            System.out.println("主线程执行中"+i);
            Thread.sleep(1000);
        }
    }
}
class MyDaemonThread extends Thread{
    private int cont;
    @Override
    public void run() {
        while (true){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("子线程执行中"+(++cont));
        }
    }
}