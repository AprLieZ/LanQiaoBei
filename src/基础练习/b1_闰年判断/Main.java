package 基础练习.b1_闰年判断;

import java.util.Scanner;

/**
 * Description:
 *      给定一个年份，判断这一年是不是闰年。
 *      当以下情况之一满足时，这一年是闰年：
 *      1. 年份是4的倍数而不是100的倍数；
 *      2. 年份是400的倍数。
 *      其他的年份都不是闰年。
 * User: zhenghb03
 * Date: 2018-03-16
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        if (year % 4 == 0 && year % 100 != 0) {
            System.out.println("yes");
        } else if (year % 400 == 0) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
