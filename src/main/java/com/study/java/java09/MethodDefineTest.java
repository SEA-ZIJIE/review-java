package com.study.java.java09;

/**
 * ClassName: MethodDefineTest
 * Package: com.study.java.java09
 * Description:
 *
 * @Author wangzijie
 * @Create 2025/11/11 21:56
 * @Version 1.0
 */


public class MethodDefineTest {
    //    求任意两个整数的和
    public static int add(int a, int b) {
        return a + b;

    }

    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int sum =add(x, y);
        System.out.println("sum = " + sum);
    }


}
