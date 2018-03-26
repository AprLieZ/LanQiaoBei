package 基础练习.b6_杨辉三角形;

import java.util.Scanner;

/**
 * Description:杨辉三角形
 * User: zhenghb03
 * Date: 2018-03-26
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++) {
            arr[i][0] = 1;
        }
        System.out.println(1);
        for (int i = 1; i < arr.length; i++) {
            System.out.print(arr[i][0] + " ");
            for (int j = 1; j < i+1; j++) {
                arr[i][j] = arr[i-1][j-1] + arr[i-1][j];
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
