package 基础练习.b11_十六进制转十进制;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Description:
 *      从键盘输入一个不超过8位的正的十六进制数字符串，
 *      将它转换为正的十进制数后输出。
 *      注：十六进制数中的10~15分别用大写的英文字母A、B、C、D、E、F表示。
 * User: zhenghb03
 * Date: 2018-03-27
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        BigInteger b = new BigInteger(a,16);
        System.out.println(b);
    }
}
