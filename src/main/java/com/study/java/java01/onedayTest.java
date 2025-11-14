package com.study.java.j01;/**
 * ClassName: onedayTest
 * Package: com.study.java.java01
 * Description:
 *
 * @Author wangzijie
 * @Create 2025/11/3 15:54
 * @Version 1.0
 */


public class onedayTest {
    String str = new String("good");
    char[] ch = { 'a', 'b', 'c' };

    public static void main(String args[]) {
        onedayTest ex = new onedayTest();
        ex.change(ex.str, ex.ch);
        System.out.print(ex.str + " and ");
        System.out.print(ex.ch);
    }

    public static void change(String str, char ch[])
    {
        str = "test ok";
        ch[0] = 'g';
    }
}