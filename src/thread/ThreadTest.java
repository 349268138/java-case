package thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @author wangjinping
 * @Description
 * @CreateDateon 2021/11/29.
 */
public class ThreadTest {
    public static void main(String[] args) {
        callableTest();
    }

    public static void callableTest() {
        FutureTask<Long> futureTask = new FutureTask(new MyCallable());
        Thread thread = new Thread(futureTask);
        System.out.println("call start method");
        thread.start();
        System.out.println("start method complete");
        try {
            Long timestamp = futureTask.get();
            System.out.println("get method complete. timestamp: " + timestamp);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

    public static void runnableTest() {
        Thread thread = new Thread(new MyRunnable());
        System.out.println("call start method");
        thread.start();
        System.out.println("start method complete");
    }

    public static void threadTest() {
        MyThread myThread = new MyThread();

        System.out.println("call start method");
        myThread.start();
        System.out.println("start method complete");


        System.out.println("call run method");
        myThread.run();
        System.out.println("run method complete");
    }
}
