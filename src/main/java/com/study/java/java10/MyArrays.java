package com.study.java.java10;/**
 * ClassName: MyArrays
 * Package: com.study.java.java10
 * Description:
 *
 * @Author wangzijie
 * @Create 2025/11/12 9:37
 * @Version 1.0
 */


public class MyArrays {
    public static int getSum(int[] arr){
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {

        int[] nums ={1,1,4,5,67};
        int sum = getSum(nums);
        System.out.println("sum = " + sum);
    }
}
