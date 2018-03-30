package 基础练习.b12_十六进制转八进制;

import java.util.Scanner;

/**
 * Description:十六进制转八进制
 *      1.首先将每一位十六进制数转换为四位二进制数（一定要转为4位，使用前导0），保存为字符串；
 *      2.将字符串长度化为3的倍数，以便向八进制转化；
 *      3.每三位转化为八进制，去掉前导零；
 * User: zhenghb03
 * Date: 2018-03-27
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] result = new String[11];//保存最后输出的结果
        /*十六进制转化为二进制*/
        for (int i = 0; i < n; i++) {
            String h = in.next();
            StringBuilder tempB = new StringBuilder();
            for (int m = 0; m < h.length(); m++) {
                char numH = h.charAt(m);
                //System.out.print("第"+m+"个字符："+numH);
                String b = Integer.toBinaryString(Integer.valueOf(String.valueOf(numH), 16));

                //System.out.print("\t二进制："+b);
                for (int k = b.length(); k < 4; k++) {
                    b = '0' + b;
                }
                //System.out.println("\t添加前导0后："+b);
                tempB.append(b);
            }
            //System.out.println("tempB："+tempB);

            /*二进制转化为八进制*/
            StringBuilder tempO = new StringBuilder();//长度变为3的倍数，需要补的前导0的个数
            int addZero = 3 - tempB.length() % 3;
            //System.out.println("addZero："+addZero);
            for (int p = 0; p < addZero; p++) {
                tempB = new StringBuilder("0").append(tempB);
            }
            //System.out.println("经过处理后的tempB："+tempB);
            for (int m = 0; m < tempB.length(); m += 3) {
                //把字符串长度转换为三的倍数添加前导0
                String numB = tempB.substring(m, m + 3);
                //System.out.println("numB："+numB);
                String o = Integer.toOctalString(Integer.valueOf(String.valueOf(numB), 2));
                tempO.append(o);
            }
            //System.out.println("tempO："+tempO);
            result[i] = tempO.toString().replaceAll("^(0+)", "");//用正则表达式去掉前导零
        }
        for (int i = 0; i < n; i++) {
            System.out.println(result[i]);
        }
    }
}
