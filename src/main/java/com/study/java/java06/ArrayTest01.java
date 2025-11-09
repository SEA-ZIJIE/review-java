package com.study.java.java06;/**
 * ClassName: ArrayTest01
 * Package: com.study.java.java06
 * Description:
 *
 * @Author wangzijie
 * @Create 2025/11/8 15:37
 * @Version 1.0
 */


public class ArrayTest01 {
    public static void main(String[] args) {
        int[] score ={1243,214,534,645,567,53,876,234};
        for (int i = 0; i < score.length; i++) {
            System.out.println("第"+(i+1)+"个同学的成绩 "+score[i]);
        }
    }
}
