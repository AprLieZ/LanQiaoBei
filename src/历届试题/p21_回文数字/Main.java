package 历届试题.p21_回文数字;

import java.util.Scanner;

/**
 * Description:
 * User: zhenghb03
 * Date: 2018-03-28
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a,b,c,d,e,f,sum;
        int flag = 0;
        for (int i = 10001; i < 100000; i++) {
            a = i / 10000;
            b = i % 10000 / 1000;
            c = i % 1000 / 100;
            d = i % 100 / 10;
            e = i % 10;
            sum = a + b + c + d + e;
            if (a==e && b==d && sum==n) {
                System.out.println(i);
                flag = 1;
            }
        }
        for (int i = 100001; i < 1000000; i++) {
            a = i / 100000;
            b = i % 100000 / 10000;
            c = i % 10000 / 1000;
            d = i % 1000 / 100;
            e = i % 100 / 10;
            f = i % 10;
            sum = a + b + c + d + e + f;
            if (a==f && b==e && c==d && sum==n) {
                System.out.println(i);
                flag = 1;
            }
        }
        if (flag == 0) {
            System.out.println(-1);
        }
    }
}
