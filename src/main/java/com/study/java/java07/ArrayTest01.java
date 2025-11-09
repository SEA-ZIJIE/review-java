package com.study.java.java07;

import java.util.Scanner;

/**
 * ClassName: ArrayTest01
 * Package: com.study.java.java07
 * Description:
 *
 * @Author wangzijie
 * @Create 2025/11/9 19:47
 * @Version 1.0
 */


public class ArrayTest01 {
    public static void main(String[] args) {
//        从键盘输入小组的人数，以及每一个人的成绩，成绩存到数组中，然后输出你们组的总分，平均分
        Scanner input = new Scanner(System.in);

        int count;
        while (true) {
            System.out.println("输入本组的人数");
            count = input.nextInt();
            if (count > 0) {
                break;
            } else if (count > Integer.MAX_VALUE) {
                System.out.println("输入错误");
            } else {
                System.out.println("输入错误，人数应该为正数");
            }
        }
//定义数组
        int[] score = new int[count];
//        输入成绩
        for (int i = 0; i < score.length; i++) {
            System.out.println("" + (i + 1) + ":");
            score[i] = input.nextInt();
        }
//统计平均分
        int sum = 0;
        System.out.println("成绩如下");
        for (int i = 0; i < score.length; i++) {
            System.out.print(score[i] + "");
            sum += score[i];

        }
        System.out.println();
        System.out.println("总分：" + sum);
        System.out.println("平均分" + sum / count);
        input.close();

    }
}
