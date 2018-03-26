package 基础练习.b7_特殊的数字;

/**
 * Description:153是一个非常特殊的数，它等于它的每位数字的立方和，
 *      即153=1*1*1+5*5*5+3*3*3。编程求所有满足这种条件的三位十进制数。
 * User: zhenghb03
 * Date: 2018-03-26
 */
public class Main {
    public static void main(String[] args) {
        int a, b, c;
        int result;
        for (int i = 100; i < 1000; i++) {
            a = i/100;
            b = i % 100 / 10;
            c = i % 10;
            result = a*a*a + b*b*b + c*c*c;
            if (i == result)
                System.out.println(i);
        }
    }
}
