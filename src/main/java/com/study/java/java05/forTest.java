package com.study.java.java05;/**
 * ClassName: forTest
 * Package: com.study.java.java05
 * Description:
 *
 * @Author wangzijie
 * @Create 2025/11/7 9:15
 * @Version 1.0
 */


public class forTest {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
            System.out.println("i = " + i);

        }
        System.out.println("sum = " + sum);
    }
}
