package thread;

/**
 * @author wangjinping
 * @Description
 * @CreateDateon 2021/11/29.
 */
public class ThreadTest {
    public static void main(String[] args) {
        runnableTest();
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
