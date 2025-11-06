package com.study.java.java03;

import java.util.Scanner;

/**
 * ClassName: Exam
 * Package: com.study.java.java03
 * Description:
 *
 * @Author wangzijie
 * @Create 2025/11/5 12:59
 * @Version 1.0
 */


public class Exam {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("请输入姓名");
        String name = input.nextLine();
        System.out.println("name =" + name);
        System.out.println("\"请输入年龄：");
        int age = input.nextInt();
        System.out.println("age = " + age);
        input.close();
    }
}
