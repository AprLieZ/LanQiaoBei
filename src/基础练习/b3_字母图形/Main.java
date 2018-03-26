package 基础练习.b3_字母图形;

import java.util.Scanner;

/**
 * Description:输入一行，包含两个整数n和m，分别表示你要输出的图形的行数的列数。
 * ABCDEFG
 * BABCDEF
 * CBABCDE
 * DCBABCD
 * EDCBABC
 * User: zhenghb03
 * Date: 2018-03-20
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        in.close();
        for (int i = 0; i < n; i++) {
            int flag = 0;
            for (int j = i; j > 0; j--) {
                System.out.print((char)(65+j));
                flag++;
                if (flag == m)
                    break;
            }
            for (int j = 0; j < m-i; j++) {
                System.out.print((char)(65+j));
            }
            System.out.println();
        }
    }
}
