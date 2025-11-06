package com.study.java.java04;

import java.util.Scanner;

/**
 * ClassName: Exercise2
 * Package: com.study.java.java04
 * Description:
 *
 * @Author wangzijie
 * @Create 2025/11/6 11:41
 * @Version 1.0
 */


public class Exercise2 {
    public static void main(String[] args) {

/*
//    假设你想开发一个玩彩票的游戏，程序随机地产生一个两位数的彩票，提示用户输入一个两位数，然后按照下面的规则判定用户是否能赢。
//
//            1)如果用户输入的数匹配彩票的实际顺序，奖金10 000美元。
//
//            2)如果用户输入的所有数字匹配彩票的所有数字，但顺序不一致，奖金 3 000美元。
//
//            3)如果用户输入的一个数字仅满足顺序情况下匹配彩票的一个数字，奖金1 000美元。
//
//            4)如果用户输入的一个数字仅满足非顺序情况下匹配彩票的一个数字，奖金500美元。
//
//            5)如果用户输入的数字没有匹配任何一个数字，则彩票作废。
*/
        int randNum =(int)(Math.random()*90+10);


        Scanner input = new Scanner(System.in);
        System.out.println("请输入一个两位数（0,100）");
         int inputNum = input.nextInt();
         if(inputNum == randNum){
             System.out.println("奖金10000美元");
         }else if(inputNum/10 ==  randNum%10&&inputNum%10 ==randNum/10){
             System.out.println("奖金1000美元");
         }else if(inputNum/10 ==  randNum/10||inputNum%10 ==randNum%10){
             System.out.println("奖金100美元");
         }else if(inputNum/10 ==  randNum%10||inputNum%10 ==randNum/10){
             System.out.println("奖金50美元");
         } else  {
             System.out.println("谢谢惠顾");

         }

        System.out.println("本期中奖号码为:"+randNum);
         input.close();

//    提示：使用Math.random() 产生随机数
//
//> Math.random() 随机产生1个[0,1)范围的小数
//>
//        > Math.random() * 90：可以得到1个[0,90)范围的小数
//>
//        > Math.random() * 90 + 10：可以得到1个[10,100) 范围的小数
//>
//        > (int)(Math.random() * 90  + 10)：可以得到1个[10, 99]范围的整数

    }

}
