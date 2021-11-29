package systemclass;

/**
 * @author wangjinping
 * @Description
 * @CreateDateon 2021/11/29.
 */
public class MathTest {
    public static void main(String[] args) {
        System.out.println(Math.ceil(1.6));
        System.out.println(Math.floor(1.6));
        System.out.println(Math.round(1.1));
        System.out.println(Math.round(1.6));

        System.out.println(Math.min(1, 2));
        System.out.println(Math.max(1, 2));
        System.out.println(Math.abs(-1));

        System.out.println(Math.random());

        System.out.println(Math.PI);
        System.out.println(Math.toDegrees(Math.PI / 2));
        System.out.println(Math.toRadians(90));
        System.out.println(Math.sin(Math.PI / 4));
        System.out.println(Math.cos(Math.PI / 4));
    }
}
