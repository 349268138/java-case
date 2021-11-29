package systemclass;

/**
 * @author wangjinping
 * @Description
 * @CreateDateon 2021/11/29.
 */
public class StringTest {
    public static void main(String[] args) {
        costTime();
    }

    public static void costTime() {
        String s = "";
        long start = System.currentTimeMillis();
        for (int loop = 0; loop < 50000; loop++) {
            s += "a";
        }
        System.out.println(s);
        System.out.println(System.currentTimeMillis() - start);

        StringBuffer buffer = new StringBuffer();
        start = System.currentTimeMillis();
        for (int loop = 0; loop < 50000; loop++) {
            buffer.append("a");
        }
        System.out.println(buffer.toString());
        System.out.println(System.currentTimeMillis() - start);
    }
}
