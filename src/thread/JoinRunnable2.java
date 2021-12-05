package thread;

/**
 * @author wangjinping
 * @Description
 * @CreateDateon 2021/11/30.
 */
public class JoinRunnable2 implements Runnable {

    @Override
    public void run() {
        System.out.println("JoinRunnable2 1");
        hold(5000);
        System.out.println("JoinRunnable2 2");
    }

    private void hold(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
