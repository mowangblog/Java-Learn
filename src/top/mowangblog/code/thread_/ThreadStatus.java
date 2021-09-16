package top.mowangblog.code.thread_;

/**
 * JavaStudy
 * 线程生命周期
 *
 * @author : Xuan Li
 * @date : 2021-09-15 20:59
 **/
public class ThreadStatus extends Thread{
    public static void main(String[] args) throws InterruptedException {
        ThreadStatus threadStatus = new ThreadStatus();
        System.out.println("threadStatus.getState() = " + threadStatus.getState());
        threadStatus.start();
        while (State.TERMINATED != threadStatus.getState()){
            Thread.sleep(500);
            System.out.println("threadStatus.getState() = " + threadStatus.getState());
        }
        System.out.println("threadStatus.getState() = " + threadStatus.getState());
    }

    @Override
    public void run() {
        int cont = 0;
        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("子线程执行中"+(++cont));
            if(cont == 20){
                break;
            }
        }
    }
}

