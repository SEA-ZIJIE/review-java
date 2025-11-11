package com.study.java.java09;/**
 * ClassName: twoArrayTest04
 * Package: com.study.java.java09
 * Description:
 *
 * @Author wangzijie
 * @Create 2025/11/11 15:51
 * @Version 1.0
 */


public class twoArrayTest04 {
    public static void main(String[] args) {
//        杨辉三角
        int[][] yangHui = new int[10][];
        for (int i = 0; i < yangHui.length; i++) {
            yangHui[i] = new int[i + 1];

            yangHui[i][0] = 1;
            System.out.print(yangHui[i][0] + "\t");


            for (int j = 1; j < yangHui[i].length - 1; j++) {
                yangHui[i][j] = yangHui[i - 1][j - 1] + yangHui[i - 1][j];
                System.out.print(yangHui[i][j] + "\t");

            }


            if (i > 0) {
                yangHui[i][i] = 1;
                System.out.print(yangHui[i][i] + "\t");

            }
            System.out.println();
        }


    }
}
