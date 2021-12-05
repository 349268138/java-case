package threadsafe.deadlock;

import threadsafe.notsafe.NotSafeSellerRunnable;
import threadsafe.notsafe.NotSaveTicket;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangjinping
 * @Description
 * @CreateDateon 2021/11/29.
 */
public class DeadLockTest {
    public static void main(String[] args) {
        List<Thread> threadList = new ArrayList<>();

        Thread thread1 = new Thread(new DeadLockRunnable1(), "DeadLockRunnable1");
        threadList.add(thread1);

        Thread thread2 = new Thread(new DeadLockRunnable2(), "DeadLockRunnable2");
        threadList.add(thread2);

        for (int loop = 0; loop < 2; loop++) {
            threadList.get(loop).start();
        }
    }
}
