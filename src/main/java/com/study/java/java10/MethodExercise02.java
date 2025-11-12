package com.study.java.java10;

import java.util.Scanner;

/**
 * ClassName: MethodExercise02
 * Package: com.study.java.java10
 * Description:
 *
 * @Author wangzijie
 * @Create 2025/11/12 8:27
 * @Version 1.0
 */


public class MethodExercise02 {
    public static int max(int a, int b) {
        return a > b ? a : b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("c = " + c);
        int d = sc.nextInt();
        int biggest = max(c,d);
        System.out.println("biggest = " + biggest);
        sc.close();
    }
}
