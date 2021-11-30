package exception;

/**
 * @author wangjinping
 * @Description
 * @CreateDateon 2021/11/30.
 */
public class MyException extends Exception {
    private static final String EXCEPTION_PRE_MSG = "wangjinping: ";

    public MyException() {
        super(EXCEPTION_PRE_MSG);
    }

    public MyException(String msg) {
        super(EXCEPTION_PRE_MSG + msg);
    }
}
