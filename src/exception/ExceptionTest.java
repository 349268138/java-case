package exception;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangjinping
 * @Description
 * @CreateDateon 2021/11/29.
 */
public class ExceptionTest {
    public static void main(String[] args) {
        tryCatchFinallyTest();

        throwRuntimeExceptionTest();

        try {
            throwCheckExceptionTest();
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            throwMyExceptionTest();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void tryCatchFinallyTest() {
        List<String> list = new ArrayList<String>();
        list.add("hello");

        try {
            System.out.println(list.get(1));
        } catch (Exception e) {
            System.out.println("execute exception: " + e);
        } finally {
            System.out.println("finally execute");
        }

        try {
            System.out.println(list.get(0));
        } catch (Exception e) {
            System.out.println("execute exception: " + e);
        } finally {
            System.out.println("finally execute");
        }
    }

    public static void throwRuntimeExceptionTest() {
        throw new RuntimeException("runtime exception");
    }

    public static void throwCheckExceptionTest() throws Exception {
        throw new Exception("exception");
    }

    public static void throwMyExceptionTest() throws Exception {
        throw new MyException("myException");
    }
}
