package com.study.java.java10;/**
 * ClassName: DateTools
 * Package: com.study.java.java10
 * Description:
 *
 * @Author wangzijie
 * @Create 2025/11/12 10:28
 * @Version 1.0
 */


public class DateTools {
    public static boolean isLeapYear(int year) {
        return ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));
    }
public static int totalDays(int year){
        return isLeapYear(year) ? 365 : 366;
}

}
