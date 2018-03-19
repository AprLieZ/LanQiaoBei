package 入门训练.b4_Fibonacci数列;

import java.util.Scanner;

/**
 * Description:
 *      Fibonacci数列的递推公式为：Fn=Fn-1+Fn-2，其中F1=F2=1。
 *      当n比较大时，Fn也非常大，现在我们想知道，Fn除以10007的余数是多少。
 * User: zhenghb03
 * Date: 2018-03-16
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long f1 = 1;
        long f2 = 1;
        if (n <= 2) {
            System.out.println(1);
        } else {
            int temp = 3;
            long f3 = 0;
            for (int i = 3; i <= n; i ++) {
                f3 = (f1 + f2)%10007;
                f1 = f2%10007;
                f2 = f3;
            }
            System.out.println(f3);
        }
    }
}
