package 入门训练.b3_圆的面积;

import java.util.Scanner;

/**
 * Description:给定圆的半径r，求圆的面积。
 * User: zhenghb03
 * Date: 2018-03-16
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        System.out.printf("%.7f",r*r*Math.PI);
    }
}
