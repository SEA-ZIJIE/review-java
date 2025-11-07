package com.study.java.java05;/**
 * ClassName: forforTest
 * Package: com.study.java.java05
 * Description:
 *
 * @Author wangzijie
 * @Create 2025/11/7 17:57
 * @Version 1.0
 */


public class forforTest {
    public static void main(String[] args) {
        for(int i =1; i<=5;i++) {
            for(int j =1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
