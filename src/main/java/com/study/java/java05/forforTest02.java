package com.study.java.java05;/**
 * ClassName: forforTest02
 * Package: com.study.java.java05
 * Description:
 *
 * @Author wangzijie
 * @Create 2025/11/7 18:26
 * @Version 1.0
 */


public class forforTest02 {
    public static void main(String[] args) {
        //九九乘法表
        for(int i =1; i<=9;i++) {
            for(int j =1; j<=i;j++){
                System.out.print( j + "*" + i + "=" + i * j + "\t");
            }
            System.out.println();
        }
    }
}
