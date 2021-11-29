package systemclass;

import java.util.Scanner;

/**
 * @author wangjinping
 * @Description
 * @CreateDateon 2021/11/29.
 */
public class ScannerTest {
    public static void main(String[] args) {
        readString();
    }

    public static void readString() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String word = scanner.next();
            if ("exit".equals(word)) {
                break;
            }
            System.out.println(word);
        }
    }

    public static void readInt() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (scanner.hasNextInt()) {
            int value = scanner.nextInt();
            if (0 == value) {
                break;
            }
            sum += value;
        }
        System.out.println(sum);
    }
}
