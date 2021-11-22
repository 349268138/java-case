package override;

/**
 * @author wangjinping
 * @Description
 * @CreateDateon 2021/9/28.
 */
public class Test {
    public static void main(String[] args) {
        Bird bird = (Bird) new Ostrich(10);
        bird.fly();
    }
}
