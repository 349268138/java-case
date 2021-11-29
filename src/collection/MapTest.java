package collection;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        traverse();
    }

    public static void traverse() {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(4, "lisi");
        map.put(3, "zhangsan");
        map.put(5, "wangwu");

        for (Integer number : map.keySet()) {
            System.out.println(number);
        }

        for (String name : map.values()) {
            System.out.println(name);
        }

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
    }
}
