package 历届试题.p2_打印十字图;

import java.util.Scanner;

/**
 * Description:
 *      输入：一个正整数 n (n<30) 表示要求打印图形的层数。
 * User: zhenghb03
 * Date: 2018-03-28
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int N = 5+4*n;
        char[][] arr = new char[N][N];

        //先把'$'符号铺满该图
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = '$';
            }
        }
        //画总图的四分之一：左上角的部分
        arr[0][0] = arr[0][1] = '.';
        for (int i = 1; i < (N-1)/2; i+=2) {
            for (int j = i-1; j <= i; j++) {
                arr[i][j] = '.';
            }
            for (int j = i+2; j < (N+1)/2; j++) {
                arr[i][j] = '.';
                arr[j][i] = '.';
            }
        }
        for (int i = 2; i < (N-1)/2; i+=2) {
            arr[i][i+1] = '.';
        }
        //左右对称
        for (int i = 0; i < (N+1)/2; i++) {
            for (int j = N-1; j > (N-1)/2; j--) {
                arr[i][j] = arr[i][N-j-1];
            }
        }
        //上下对称
        for (int i = N-1; i > (N-1)/2; i--) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = arr[N-i-1][j];
            }
        }
        //输出
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
