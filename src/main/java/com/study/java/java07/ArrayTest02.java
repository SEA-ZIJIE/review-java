package com.study.java.java07;/**
 * ClassName: ArrayTest02
 * Package: com.study.java.java07
 * Description:
 *
 * @Author wangzijie
 * @Create 2025/11/9 20:54
 * @Version 1.0
 */


public class ArrayTest02 {
//    随机产生10个[0,100]的正数放到数组中,找出最大值和最小值
public static void main(String[] args) {

int[] arr =new int[10];
    for (int i = 0; i < arr.length; i++) {
        arr[i] = (int) (Math.random()*100);
        System.out.print(arr[i]+" ");
    }
    System.out.println();

    int max = arr[0];
    int min = arr[0];
    for (int i = 1; i < arr.length; i++) {
        if(arr[i]>max){
            max = arr[i];
        }
        if(arr[i]<min){
            min = arr[i];
        }
    }
    System.out.println("max = " + max);
    System.out.println("min = " + min);
}
}