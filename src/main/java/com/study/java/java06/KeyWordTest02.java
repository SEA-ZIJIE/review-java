package com.study.java.java06;

import com.sun.tools.javac.Main;

import java.util.Scanner;

/**
 * ClassName: KeyWordTest02
 * Package: com.study.java.java06
 * Description:
 *
 * @Author wangzijie
 * @Create 2025/11/8 9:45
 * @Version 1.0
 */


public class KeyWordTest02 {

    public static void main(String[] args) {

        //    从键盘输入一个正整数，必须是3的倍数，否则重新输入，提示输入整数用 input.nextInt();
        Scanner input = new Scanner(System.in);
        int num;
        do {
            System.out.println("请输入一个正整数，必须为三的倍数");
            num = input.nextInt();
            if (num > 0 && num % 3 ==0) {
                System.out.println("num = " + num);
            }
        } while (num <= 0 || num % 3 != 0);
        input.close();
    }


}
