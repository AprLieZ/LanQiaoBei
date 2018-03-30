package 第七届省赛.煤球数目;

/**
 * Description:
 *  煤球数目
 *  有一堆煤球，堆成三角棱锥形。具体：
 *  第四层10个（排列成三角形），
 *  ….
 *  如果一共有100层，共有多少个煤球？
 * User: zhenghb03
 * Date: 2018-03-29
 */
public class Main {
    public static void main(String[] args) {
        int sum = 1;    //煤球总和
        int flag = 1;
        int temp = 1;
        while(flag < 100){
            flag ++;
            temp += flag;
            sum += temp;
        }
        System.out.println(sum);
    }
}
