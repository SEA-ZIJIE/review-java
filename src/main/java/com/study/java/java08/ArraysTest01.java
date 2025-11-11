package com.study.java.java08;

import java.util.Arrays;

/**
 * ClassName: ArraysTest01
 * Package: com.study.java.java08
 * Description:
 *
 * @Author wangzijie
 * @Create 2025/11/10 17:34
 * @Version 1.0
 */


public class ArraysTest01 {
    public static void main(String[] args) {
        int[] arr = {12,4,523,6,8,4,376};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
