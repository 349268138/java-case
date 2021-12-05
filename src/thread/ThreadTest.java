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
        joinTest();
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

    public static void periodTest() {
        Thread thread = new Thread(new PeriodRunnable());
        System.out.println("ThreadTest1 " + thread.getState());
        thread.start();

        hold(2000);
        System.out.println("ThreadTest2 " +thread.getState());

        hold(5000);
        System.out.println("ThreadTest3 " +thread.getState());
    }

    private static void hold(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void joinTest() {
        Thread joinRunnable2 = new Thread(new JoinRunnable2());
        Thread joinRunnable1 = new Thread(new JoinRunnable1(joinRunnable2));
        joinRunnable1.start();
        joinRunnable2.start();
    }
}
