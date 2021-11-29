package collection;

import interfacer.CopyInterface;
import interfacer.PrintCopyMachine;
import interfacer.PrintInterface;
import interfacer.ThreeDPrintCopyMachine;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {
        method();
    }

    public static void method() {
        Set set = new HashSet<Integer>();
        set.add("aaa");
        set.add("bbb");
        set.add("ccc");

        if (set.contains("ddd")) {
            System.out.println("set already contains ddd");
        } else {
            set.add("ddd");
        }
        System.out.println("set size is: " + set.size());
    }

    public static void diff() {
        Set<String> set = new HashSet<String>();
        set.add("aaa");
        set.add("ccc");
        set.add("bb");
        set.add("kk");
        set.add("mm");
        set.add("lll");
        set.add("nn");
        System.out.println("HashSet：");
        java.util.Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        set = new TreeSet<String>();
        set.add("aaa");
        set.add("ccc");
        set.add("bb");
        set.add("kk");
        set.add("mm");
        set.add("lll");
        set.add("nn");
        System.out.println("\nTreeSet：");
        iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
