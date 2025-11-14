package com.study.java.java11;/**
 * ClassName: OverloadTest1
 * Package: com.study.java.java11
 * Description:
 *
 * @Author wangzijie
 * @Create 2025/11/13 9:11
 * @Version 1.0
 */


public class OverloadTest1 {
    public static int add(int a, int b) {
        return a + b;

    }
    public static double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(add(1,2));
        System.out.println(add(1.1,2.1));
    }
}
