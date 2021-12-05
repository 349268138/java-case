package threadsafe.safe;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author wangjinping
 * @Description
 * @CreateDateon 2021/12/5.
 */
public class SafeTicket {
    private long count;

    private Lock lock = new ReentrantLock();

    public SafeTicket(int count) {
        this.count = count;
    }

    // 线程安全实现方式1
    public void minus() {
        System.out.println(Thread.currentThread().getName() + "-enter");
        synchronized (this) {
            if(count <= 0) {
                return;
            }

            long number = count;
            holdRandom();
            count = count - 1;
            System.out.println(Thread.currentThread().getName() + ", sell " + number);
        }
    }

    // 线程安全实现方式2
//    public synchronized void minus() {
//        System.out.println(Thread.currentThread().getName() + "-enter");
//        if(count <= 0) {
//            return;
//        }
//
//        long number = count;
//        holdRandom();
//        count = count - 1;
//        System.out.println(Thread.currentThread().getName() + ", sell " + number);
//    }

    // 线程安全实现方式3
//    public void minus() {
//        System.out.println(Thread.currentThread().getName() + "-enter");
//
//        lock.lock();
//        try {
//            if (count <= 0) {
//                return;
//            }
//
//            long number = count;
//            holdRandom();
//            count = count - 1;
//            System.out.println(Thread.currentThread().getName() + ", sell " + number);
//        } finally {
//            lock.unlock();
//        }
//    }

    public long getCount() {
        return count;
    }

    private void holdRandom() {
        try {
            long millis = new Double(Math.floor(Math.random() * 1000)).longValue();
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
