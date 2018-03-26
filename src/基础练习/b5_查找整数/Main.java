package 基础练习.b5_查找整数;

import java.util.Scanner;

/**
 * Description:给出一个包含n个整数的数列，问整数a在数列中的第一次出现是第几个。
 * User: zhenghb03
 * Date: 2018-03-21
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        int flag = in.nextInt();
        int end = -1;
        for (int i = 0; i < arr.length; i++) {
            if ( arr[i] == flag) {
                end = i + 1;
                break;
            }
        }
        System.out.println(end);
    }
}
