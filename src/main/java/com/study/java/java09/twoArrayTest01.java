package com.study.java.java09;

/**
 * ClassName: twoArrayTest01
 * Package: com.study.java.java09
 * Description:
 *
 * @Author wangzijie
 * @Create 2025/11/11 15:29
 * @Version 1.0
 */


public class twoArrayTest01 {
    public static void main(String[] args) {
        int[][] arr = {{1, 41, 5, 634}, {1, 5, 6, 7, 4, 7, 8}, {1, 63, 6, 7, 8, 85, 8}};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
