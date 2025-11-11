package com.study.java.java08;

import java.util.Arrays;

/**
 * ClassName: ArraysTest02
 * Package: com.study.java.java08
 * Description:
 *
 * @Author wangzijie
 * @Create 2025/11/10 17:40
 * @Version 1.0
 */


public class ArraysTest02 {
    public static void main(String[] args) {
        int[] arr = {12,4,523,6,8,4,376};


        int target = 6;
        int index = Arrays.binarySearch(arr, target);
        System.out.println("index = " + index);

        target = 4;
        int search = Arrays.binarySearch(arr, target);
        System.out.println("search = " + search);

    }
}
