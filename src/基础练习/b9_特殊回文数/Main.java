package 基础练习.b9_特殊回文数;

import java.util.Scanner;

/**
 * Description:
 *      123321是一个非常特殊的数，它从左边读和从右边读是一样的。
 *      输入一个正整数n，编程求所有这样的五位和六位十进制数，
 *      满足各位数字之和等于n 。
 * User: zhenghb03
 * Date: 2018-03-27
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a,b,c,d,e,f;
        int sum;
        for (int i = 10000; i < 100000; i++) {
            a = i / 10000;
            b = i % 10000 / 1000;
            c = i % 1000 / 100;
            d = i % 100 / 10;
            e = i % 10;
            sum = a + b + c + d + e;
            if (a == e && b == d && sum == n) {
                System.out.println(i);
            }
        }
        for (int i = 100000; i < 10000000; i++) {
            a = i / 100000;
            b = i % 100000 / 10000;
            c = i % 10000 / 1000;
            d = i % 1000 / 100;
            e = i % 100 / 10;
            f = i % 10;
            sum = a + b + c + d + e + f;
            if (a == f && b == e && c == d && sum == n) {
                System.out.println(i);
            }
        }
    }
}
