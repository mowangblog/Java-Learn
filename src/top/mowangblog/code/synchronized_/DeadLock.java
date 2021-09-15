package top.mowangblog.code.synchronized_;

/**
 * JavaStudy
 * 模拟线程死锁
 *
 * @author : Xuan Li
 * @date : 2021-09-15 22:50
 **/
public class DeadLock {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new Lock(true);
        lock.start();
        Lock lock1 = new Lock(false);
        lock1.start();
    }
}
class Lock extends Thread{
    public static Object o1 = new Object();
    public static Object o2 = new Object();
    public boolean flag;

    public Lock(boolean flag) {
        this.flag = flag;
    }

    @Override
    public void run() {
        //线程a会拿到o1,然后尝试拿到o2,如果得不到o2,就会进入死锁
        //线程b会拿到o2,然后尝试拿到o1,如果得不到o1,就会进入死锁
        //模拟死锁
        if(flag) {
            synchronized (o1){
                System.out.println(Thread.currentThread().getName()+"进入1");
                synchronized (o2){
                    System.out.println(Thread.currentThread().getName()+"进入2");
                }
            }
        }else{
            synchronized (o2){
                System.out.println(Thread.currentThread().getName()+"进入1");
                synchronized (o1){
                    System.out.println(Thread.currentThread().getName()+"进入2");
                }
            }
        }
    }
}
