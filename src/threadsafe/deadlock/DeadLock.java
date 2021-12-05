package threadsafe.deadlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author wangjinping
 * @Description
 * @CreateDateon 2021/12/5.
 */
public class DeadLock {
    public static Lock LOCK_A = new ReentrantLock();
    public static Lock LOCK_B = new ReentrantLock();
}
