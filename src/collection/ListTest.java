package collection;

import java.util.*;

/**
 * @author wangjinping
 * @Description
 * @CreateDateon 2021/11/29.
 */
public class ListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("aaa");
        list.add("ccc");
        list.add("bbb");

        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (int loop = 0; loop < list.size(); loop++) {
            System.out.println(list.get(loop));
        }

        for (String s : list) {
            System.out.println(s);
        }

        Collections.sort(list);
        for (String s : list) {
            System.out.println(s);
        }

        Collections.sort(list, new MyComparator());
        for (String s : list) {
            System.out.println(s);
        }
    }
}
