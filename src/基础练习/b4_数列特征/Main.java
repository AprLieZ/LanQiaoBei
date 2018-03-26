package 基础练习.b4_数列特征;

import java.util.Scanner;

/**
 * Description:给出n个数，找出这n个数的最大值，最小值，和。
 * User: zhenghb03
 * Date: 2018-03-21
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        int max = -10001;
        int min = 10001;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
            sum = sum + arr[i];
            if (max < arr[i])
                max = arr[i];
            if (min > arr[i])
                min = arr[i];
        }
        System.out.println(max);
        System.out.println(min);
        System.out.println(sum);
        in.close();
    }
}
