package com.study.java.java10;/**
 * ClassName: DateToolsTest
 * Package: com.study.java.java10
 * Description:
 *
 * @Author wangzijie
 * @Create 2025/11/12 10:59
 * @Version 1.0
 */

import java.util.Scanner;

/**
 * <p>标题: </p>
 * <p>功能描述: </p>
 *
 * <p>创建时间: 2025/11/12 10:59</p>
 * <p>作者：王贤 </p>
 * <p>修改历史记录：</p>
 * ====================================================================<br>
 * 维护单：<br>
 * 修改日期：<br>
 * 修改人：<br>
 * 修改内容：<br>
 */
public class DateToolsTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年份");
        int year = sc.nextInt();

        boolean flag = DateTools.isLeapYear(year);
        System.out.println(flag?"润年":"平年");

        int totalDays = DateTools.totalDays(year);
        System.out.println(totalDays);

        sc.close();
    }
}
