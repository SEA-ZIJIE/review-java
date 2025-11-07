package com.study.java.java05;/**
 * ClassName: ForForTest03
 * Package: com.study.java.java05
 * Description:
 *
 * @Author wangzijie
 * @Create 2025/11/7 19:41
 * @Version 1.0
 */


public class ForForTest03 {
    //菱形
    public static void main(String[] args) {


//注意空格
//    上半部分
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print( "* ");
            }
            System.out.println();
        }
//        下半部分
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= 9-2 * i ; j++) {
                System.out.print( "* ");
            }
            System.out.println();
        }




    }




}