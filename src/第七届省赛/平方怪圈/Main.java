package 第七届省赛.平方怪圈;

/**
 * Description:
 * 平方怪圈
 * 如果把一个正整数的每一位都平方后再求和，得到一个新的正整数。
 * 对新产生的正整数再做同样的处理。
 *
 * 如此一来，你会发现，不管开始取的是什么数字，
 * 最终如果不是落入1，就是落入同一个循环圈。
 *
 * 请写出这个循环圈中最大的那个数字。
 * 请填写该最大数字。
 * User: zhenghb03
 * Date: 2018-03-29
 */
public class Main {
    public static void main(String[] args) {
        int n,j,ans = 0;
        n = 50;
        for (int i = 0; i < 50; i++) {
            while(n!=0) {
                j = n%10;
                ans += j*j;
                n = n/10;
            }
            System.out.println(ans);
            n = ans;
            ans = 0;
        }
    }
}
