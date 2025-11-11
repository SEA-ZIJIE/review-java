package com.study.java.java09;/**
 * ClassName: twoArrayTest03
 * Package: com.study.java.java09
 * Description:
 *
 * @Author wangzijie
 * @Create 2025/11/11 15:39
 * @Version 1.0
 */


public class twoArrayTest03 {
    public static void main(String[] args) {

        int [][] arr =new int [4][];
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[count];
            count++;
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = j;
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();

        }
    }
}
