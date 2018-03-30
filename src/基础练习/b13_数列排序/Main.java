package 基础练习.b13_数列排序;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Description:给定一个长度为n的数列，将这个数列按从小到大的顺序排列。1<=n<=200
 * User: zhenghb03
 * Date: 2018-03-27
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        in.close();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
