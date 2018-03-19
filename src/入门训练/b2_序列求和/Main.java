package 入门训练.b2_序列求和;

import java.util.Scanner;

/**
 * Description:求1+2+3+...+n的值。
 * User: zhenghb03
 * Date: 2018-03-16
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long add = 0;
        for (int i = 1; i <= n; i++) {
            add = add + i;
        }
        System.out.println(add);
    }
}
