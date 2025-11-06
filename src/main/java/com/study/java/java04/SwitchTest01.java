package com.study.java.java04;

import java.util.Scanner;

/**
 * ClassName: SwitchTest01
 * Package: com.study.java.java04
 * Description:
 *
 * @Author wangzijie
 * @Create 2025/11/6 23:34
 * @Version 1.0
 */


public class SwitchTest01 {
    public static void main(String[] args) {
//        计算这一天是这一年的第几天
        Scanner sc = new Scanner(System.in);

        System.out.println("");
        int year = sc.nextInt();
        System.out.println();
        int month = sc.nextInt();
        System.out.println();
        int day = sc.nextInt();

        int days = 0;
        switch (month) {

            case 12:
                days += 31;
            case 11:
                days += 31;
            case 8:
                days += 31;
            case 7:
                days += 31;
            case 6:
                days += 31;
            case 5:;
                days += 31;
            case 4:
                days += 31;
            case 3:
                days += year % 4 ==0 && year%100!=0||year%400 == 0?29:28;
            case 2:
                days +=31;
            case 1:
                days += day;
        }
        System.out.println(year+"年"+month+"月"+days+"天");





    }
}
