package charpter2;

import java.math.BigDecimal;

public class Example2_1 {
    public static void main (String args[ ]){
        char ch1='a', ch2='好';
        System.out.println("\""+ch1+"\"的位置:"+(int)ch1);
        System.out.println("\""+ch2+"\"的位置:"+(int)ch2);

        int aInt = 97;
        int haoInt = 22909;
        char aChar = (char) aInt;
        char haoChar = (char) haoInt;
        System.out.println(aChar);
        System.out.println(haoChar);

        int p1=32831,p2=30452;
        System.out.println("第"+p1+"个位置上的字符是:"+(char)p1);
        System.out.println("第"+p2+"个位置上的字符是:"+(char)p2);

        int first = '王';
        int second = '谨';
        int third = '平';
        System.out.println(first + ", " + second + ", " + third
        );
    }
}


