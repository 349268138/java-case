package threadsafe.deadlock;

import threadsafe.notsafe.NotSaveTicket;

/**
 * @author wangjinping
 * @Description
 * @CreateDateon 2021/11/30.
 */
public class DeadLockRunnable1 implements Runnable {

    @Override
    public void run() {
        try {
            DeadLock.LOCK_A.lock();
            System.out.println(Thread.currentThread().getName() + " obtain LOCK_A");
            hold(1000);
            DeadLock.LOCK_B.lock();
            System.out.println(Thread.currentThread().getName() + " obtain LOCK_B");
        } finally {
            DeadLock.LOCK_B.unlock();
            DeadLock.LOCK_A.unlock();
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
