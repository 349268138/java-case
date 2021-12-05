package annotation.base;

/**
 * @author wangjinping
 * @Description
 * @CreateDateon 2021/12/5.
 */
public class Apple extends Fruit {

    @Override
    public void info() {
        System.out.println("fruit info");
    }

    @Deprecated
    public double weight() {
        return Math.random();
    }
}
