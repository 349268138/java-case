package generics;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangjinping
 * @Description
 * @CreateDateon 2021/11/29.
 */
public class GenericsTest {
    public static void main(String[] args) {
//        listTest();
//        genericsClassTest();
        genericsMethodTest();
    }

    public static void listTest() {
        List<String> stringList = new ArrayList<>();
        stringList.add("hello");
        stringList.add("world");

        for (String s : stringList) {
            System.out.println(s);
        }
    }

    public static void genericsClassTest() {
        Apple<String> apple1 = new Apple<>("red");
        System.out.println(apple1.getInfo());

        Apple<Float> apple2 = new Apple<>(1.05f);
        System.out.println(apple2.getInfo());
    }

    public static void genericsMethodTest() {
        GenericsMethod genericsMethod = new GenericsMethod();
        genericsMethod.print("hello world");
        genericsMethod.print(1.05f);
        genericsMethod.print(1);
    }
}
