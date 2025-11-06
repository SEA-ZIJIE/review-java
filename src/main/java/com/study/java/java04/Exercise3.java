package com.study.java.java04;

import java.util.Scanner;

/**
 * ClassName: Exercise3
 * Package: com.study.java.java04
 * Description:
 *
 * @Author wangzijie
 * @Create 2025/11/6 15:44
 * @Version 1.0
 */


public class Exercise3 {
    public static void main(String[] args) {
//        由键盘输入三个整数分别存入变量num1、num2、num3，实现从小到大输出三个整数。
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();


//        冒泡排序
       if(num1>num2 ){
          int temp = num1;
          num1 = num2;
          num2 = temp;
       }

       if(num2>num3 ){
          int temp = num2;
          num2 = num3;
          num3 = temp;
       }
       if(num1>num2){
          int temp = num1;
          num1 = num2;
          num2 = temp;
       }
        System.out.println(num1+"<="+num2+"<="+num3);
        input.close();
    }


}
