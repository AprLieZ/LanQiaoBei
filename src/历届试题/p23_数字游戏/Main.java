package 历届试题.p23_数字游戏;

import java.util.Scanner;

/**
 * Description:
 *      输入的第一行包含三个整数 n,k,T，
 *      其中 n 和 k 的意义如上面所述，
 *      T 表示到目前为止栋栋一共说出的数字个数。
 * User: zhenghb03
 * Date: 2018-03-28
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();   //人数
        long k = in.nextLong();   //中心数k-1
        long t = in.nextLong();   //计算的个数
        in.close();
        long num = 1;   //栋栋说的数字
        long sum = num; //栋栋说的所有数字和
        long d = (n+1)*n/2; //栋栋说的第一个数和第二个数之间的间距
        for (int i = 1; i < t; i++) {
            num += d;
            //每次周期加的数总和相差 n*n。 例如 1，2，3和与4，5，6相差3*3
            d += n*n;
            if (num > k-1)
                num%=k;
            sum += num;
        }
        System.out.println(sum);
    }
}
