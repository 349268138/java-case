package threadsafe.notsafe;

import java.util.Random;

/**
 * @author wangjinping
 * @Description
 * @CreateDateon 2021/12/5.
 */
public class NotSaveTicket {
    private long count;

    public NotSaveTicket(int count) {
        this.count = count;
    }

    public boolean minus() {
        if(count <= 0) {
            return false;
        }

        long number = count;
        holdRandom();
        count = count - 1;
        System.out.println(Thread.currentThread().getName() + ", sell " + number);
        return true;
    }

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
