package threadsafe.safe;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangjinping
 * @Description
 * @CreateDateon 2021/11/29.
 */
public class SafeThreadSafeTest {
    public static void main(String[] args) {
        SafeTicket ticket = new SafeTicket(10);

        List<Thread> threadList = new ArrayList<>();
        for (int loop = 0; loop < 10; loop++) {
            Thread thread = new Thread(new SafeSellerRunnable(ticket));
            threadList.add(thread);
        }

        for (int loop = 0; loop < 10; loop++) {
            threadList.get(loop).start();
        }
    }
}
