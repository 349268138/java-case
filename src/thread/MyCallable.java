package thread;

import java.util.concurrent.Callable;

/**
 * @author wangjinping
 * @Description
 * @CreateDateon 2021/12/2.
 */
public class MyCallable implements Callable<Long> {

    @Override
    public Long call() throws Exception {
        System.out.println("MyThread start");
        hold(2000);
        System.out.println("MyThread end");
        return System.currentTimeMillis();
    }

    private void hold(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
