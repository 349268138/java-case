package thread;

/**
 * @author wangjinping
 * @Description
 * @CreateDateon 2021/11/30.
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("MyThread start");
        hold(2000);
        System.out.println("MyThread end");
    }

    private void hold(long millis) {
        try {
            sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
