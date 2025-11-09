package com.study.java.java06;

import java.util.Scanner;

/**
 * ClassName: ArrayTest03
 * Package: com.study.java.java06
 * Description:
 *
 * @Author wangzijie
 * @Create 2025/11/9 9:06
 * @Version 1.0
 */


public class ArrayTest03 {
    public static void main(String[] args) {
//### 这一天是这一年的第几天
//
//（1）已知平年12个月每个月的总天数是{ 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30,31}，
//
//（2）从键盘输入年，月，日，分别用year，month，day变量接收
//
//（3）计算这一天是这一年的第几天。
//
//（4）提示：闰年的判断标准
//
//                - 年份year可以被4整除，但不能被100整除
//                - 或年份year可以被400整除

        int[] totaDatsOfMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner input = new Scanner(System.in);

        System.out.println("请输入年月日");
        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();
        if (month >2){
            if (year%4==0&&year%100!=0||year%400==0){
                totaDatsOfMonth[1]=29;
            }
        }

        int days =day;
        for (int i = 0; i<month-1;i++){
            days+=totaDatsOfMonth[i];

        }
        input.close();
    }


}
