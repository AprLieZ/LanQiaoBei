package 算法训练.a1_区间k大数查询;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Description:给定一个序列，每次询问序列中第l个数到第r个数中第K大的数是哪个。
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
        int m = in.nextInt();
        int[] l = new int[m];
        int[] r = new int[m];
        int[] k = new int[m];
        int[] temp;
        int[] flag = new int[m];
        for (int i = 0; i < m; i++) {
            l[i] = in.nextInt();
            r[i] = in.nextInt();
            k[i] = in.nextInt();
            temp = Arrays.copyOfRange(arr,l[i]-1,r[i]);
            Arrays.sort(temp);
            flag[i] = temp[ temp.length - k[i] ];
        }
        for (int i = 0; i < flag.length; i++) {
            System.out.println(flag[i]);
        }
    }
}
