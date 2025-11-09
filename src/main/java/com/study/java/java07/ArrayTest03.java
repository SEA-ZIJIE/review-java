package com.study.java.java07;/**
 * ClassName: ArrayTest03
 * Package: com.study.java.java07
 * Description:
 *
 * @Author wangzijie
 * @Create 2025/11/9 21:38
 * @Version 1.0
 */


public class ArrayTest03 {

    public static void main(String[] args) {
//        找出最大值及其下标
    int[] arr = {12,4523,64,75,89};
    int max=arr[0];
    int index = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]>max){
                max = arr[i];
            index = i;}
        }
        System.out.println(max);
        System.out.println(index);
    
    }
}
