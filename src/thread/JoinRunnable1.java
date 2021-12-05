package thread;

/**
 * @author wangjinping
 * @Description
 * @CreateDateon 2021/11/30.
 */
public class JoinRunnable1 implements Runnable {
    private Thread joinRunnable2;

    public JoinRunnable1(Thread joinRunnable2) {
        this.joinRunnable2 = joinRunnable2;
    }

    @Override
    public void run() {
        System.out.println("JoinRunnable1 1");

        try {
            joinRunnable2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("JoinRunnable1 2");
    }
}
