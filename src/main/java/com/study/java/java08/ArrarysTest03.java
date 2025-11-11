package com.study.java.java08;/**
 * ClassName: ArrarysTest03
 * Package: com.study.java.java08
 * Description:
 *
 * @Author wangzijie
 * @Create 2025/11/10 18:00
 * @Version 1.0
 */

import java.util.Arrays;


public class ArrarysTest03 {
    public static void main(String[] args) {
        int[] arr = {12,4,523,6,8,4,376};

        int[] num = Arrays.copyOfRange(arr,1,4);
        System.out.println(Arrays.toString(num));
    }
}
