package com.study.java.java04;

import java.sql.SQLOutput;
import java.util.Scanner;

/**
 * ClassName: SwitchExercise01
 * Package: com.study.java.java04
 * Description:
 *
 * @Author wangzijie
 * @Create 2025/11/6 17:41
 * @Version 1.0
 */


public class SwitchExercise01 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("请输入星期的数字");
        int weekday= input.nextInt();
        switch (weekday){
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;
            default:
                System.out.println("输入错误");
        }

    }
}
