package com.study.java.java08;

import java.util.Arrays;

/**
 * ClassName: SystemTest
 * Package: com.study.java.java08
 * Description:
 *
 * @Author wangzijie
 * @Create 2025/11/10 19:46
 * @Version 1.0
 */


public class SystemTest {
    public static void main(String[] args) {
        int[] arr = {12,41,5,6,7,3,8,3,14};
        int[] nums = new int[10];
        System.arraycopy(arr,0,nums,0,arr.length);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(nums));
    }
}
