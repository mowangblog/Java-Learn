package top.mowangblog.code.thread_.work;

/**
 * JavaStudy
 * 线程互斥锁练习
 *
 * @author : Xuan Li
 * @date : 2021-09-15 23:23
 **/
public class ThreadExercise2 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        new Thread(bank).start();
        new Thread(bank).start();
    }
}
class Bank implements Runnable{
    private int deposit = 10000;
    private boolean loop = true;
    @Override
    public void run() {
        while (loop){
            takeMoney();
        }
        System.out.println("取款结束，任务完成");
    }
    private void takeMoney(){
        synchronized (this){
            int money = (int) (Math.random() * 1000 + 1);
            if(deposit < money){
                System.out.println("存款不足，取款失败，当前余额："+deposit+"需要取："+money);
                loop = false;
                return;
            }
            System.out.println(Thread.currentThread().getName()+"取款"+money+"，剩余："+(deposit-=money));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}