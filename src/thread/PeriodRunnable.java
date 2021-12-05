package thread;

/**
 * @author wangjinping
 * @Description
 * @CreateDateon 2021/11/30.
 */
public class PeriodRunnable implements Runnable {
    public static Object lock = new Object();

    @Override
    public void run() {
        System.out.println("PeriodRunnable1 " +Thread.currentThread().getState());
        hold(5000);
        System.out.println("PeriodRunnable2 " +Thread.currentThread().getState());
    }

    private void hold(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
