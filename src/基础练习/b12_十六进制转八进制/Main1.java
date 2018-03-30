package 基础练习.b12_十六进制转八进制;

import java.util.Scanner;

/**
 * Description:给定n个十六进制正整数，输出它们对应的八进制数。
 * 该方法不支持超大数据，所以运行分数为0
 * User: zhenghb03
 * Date: 2018-03-27
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.next();
        }
        for (int i = 0; i < arr.length; i++) {
            String a = Integer.toBinaryString(Integer.parseUnsignedInt(arr[i],16));
            String b = Integer.toOctalString(Integer.parseUnsignedInt(a,2));
            System.out.println(b);
        }
    }
}
