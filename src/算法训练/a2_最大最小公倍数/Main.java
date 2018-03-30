package 算法训练.a2_最大最小公倍数;

import java.util.Scanner;

/**
 * Description:已知一个正整数N，问从1~N中任选出三个数，他们的最小公倍数最大可以为多少。
 * User: zhenghb03
 * Date: 2018-03-27
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextInt();
        long r1 = n*(n-1)*(n-2);
        long r2 = n*(n-1)*(n-3);
        long r3 = (n-1)*(n-2)*(n-3);
        if (n < 3) {
            System.out.println(n);
        } else if (n % 2 != 0) {
            System.out.println(r1);
        } else if (n % 3 != 0) {
            System.out.println(r2);
        } else
            System.out.println(r3);
    }
}
