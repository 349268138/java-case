package charpter4.test;

/**
 * @author wangjinping
 * @Description
 * @CreateDateon 2021/9/14.
 */
public class MyMain {
    public static void main(String[] args) {
        Tea tea1 = new Tea();
        System.out.println(tea1.healthCheck());
//        System.out.println(tea1);

        Tea tea2 = new Tea(10, 20, 10);
        System.out.println(tea2.healthCheck());
        System.out.println(tea2.healthCheck(3000));

        tea2 = tea1;
        System.out.println(tea2.healthCheck());

        change(tea1);
        System.out.println(tea1.getVector2());
    }

    public static void change(Tea tea) {
        tea.setVector2(1L);
    }
}
