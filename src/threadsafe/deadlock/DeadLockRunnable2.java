package threadsafe.deadlock;

/**
 * @author wangjinping
 * @Description
 * @CreateDateon 2021/11/30.
 */
public class DeadLockRunnable2 implements Runnable {

    @Override
    public void run() {
        try {
            DeadLock.LOCK_B.lock();
            System.out.println(Thread.currentThread().getName() + " obtain LOCK_B");
            hold(1000);
            DeadLock.LOCK_A.lock();
            System.out.println(Thread.currentThread().getName() + " obtain LOCK_A");
        } finally {
            DeadLock.LOCK_A.unlock();
            DeadLock.LOCK_B.unlock();
        }
    }

    private void hold(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
