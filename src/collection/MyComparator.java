package collection;

import java.util.Comparator;

/**
 * @author wangjinping
 * @Description
 * @CreateDateon 2021/11/29.
 */
public class MyComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o2.compareTo(o1);
    }
}
