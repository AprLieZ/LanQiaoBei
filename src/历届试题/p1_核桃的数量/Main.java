package 历届试题.p1_核桃的数量;

import java.util.Scanner;

/**
 * Description:
 *      小张是软件项目经理，他带领3个开发组。工期紧，今天都在加班呢。
 *      为鼓舞士气，小张打算给每个组发一袋核桃（据传言能补脑）。他的要求是：
 *      尽量提供满足1,2条件的最小数量（节约闹革命嘛）
 * User: zhenghb03
 * Date: 2018-03-28
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int min = a;
        int b = in.nextInt();
        if(min > b) {
            min = b;
        }
        int c = in.nextInt();
        if (min > c) {
            min = c;
        }
        in.close();
        for (int i = min; i > 0; i++) {
            if (i % a == 0 && i % b == 0 && i % c == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
