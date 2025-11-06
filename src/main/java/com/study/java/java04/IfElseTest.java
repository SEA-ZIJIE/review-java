package com.study.java.java04;

import java.util.Scanner;

/**
 * ClassName: IfElseTest
 * Package: com.study.java.java04
 * Description:
 *
 * @Author wangzijie
 * @Create 2025/11/6 7:57
 * @Version 1.0
 */


public class IfElseTest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        if (score<0 || score>100) {
            System.out.println("请输入成绩");

//            成绩输入有误，成绩范围是
            System.out.println("成绩输入有误，成绩范围是[0,100]");
        } else if (score==100) {
            System.out.println("满分");

        } else if (score>=85) {
            System.out.println("优秀");

        } else if (score>=60) {
            System.out.println("成绩及格");
        }else {
            System.out.println("成绩不及格");
        }

    }


}
