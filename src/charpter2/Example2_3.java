package charpter2;

import java.util.Scanner;
public class Example2_3 {
    public static void main (String args[ ]){
//        System.out.println("请输入若干个数，每输入一个数回车确认");
//        System.out.println("最后输入数字0结束输入操作");
//
//        Scanner reader=new Scanner(System.in);
//
//        double sum=0;
//        int count=0;
//
//        double x = reader.nextDouble();
//        while(x!=0){
//            count=count+1;
//            sum=sum+x;
//            x=reader.nextDouble();
//        }
//        System.out.println(count+"个数的和为"+sum);
//        System.out.println(count+"个数的平均值"+sum/count);

        Scanner reader=new Scanner(System.in);
        while(1 == 1) {
            if (reader.hasNextInt()) {
                System.out.println("convert int: " + reader.nextInt());
            } else {
                System.out.println("no convert int: " + reader.next());
            }
        }
    }
}

