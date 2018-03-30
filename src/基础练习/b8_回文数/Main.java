package 基础练习.b8_回文数;

/**
 * Description:
 *      1221是一个非常特殊的数，它从左边读和从右边读是一样的，
 *      编程求所有这样的四位十进制数。
 * User: zhenghb03
 * Date: 2018-03-27
 */
public class Main {
    public static void main(String[] args) {
        int a,b,c,d;
        for (int i = 1000; i < 10000; i++) {
            a = i / 1000;
            b = i % 1000 / 100;
            c = i % 100 / 10;
            d = i % 10;
            if (a == d && b == c) {
                System.out.println(i);
            }
        }
    }
}
