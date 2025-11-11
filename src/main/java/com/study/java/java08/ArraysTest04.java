package com.study.java.java08;/**
 * ClassName: ArraysTest04
 * Package: com.study.java.java08
 * Description:
 *
 * @Author wangzijie
 * @Create 2025/11/10 17:50
 * @Version 1.0
 */

import com.sun.tools.javac.Main;

import java.util.Arrays;


public class ArraysTest04 {
    public static void main(String[] args) {
        int[] arr = {12,4,523,6,8,4,376};

        int[] nums = Arrays.copyOf(arr, 5);
        System.out.println(Arrays.toString(nums));
    }
}
