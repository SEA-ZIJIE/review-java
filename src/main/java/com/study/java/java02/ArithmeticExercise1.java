package com.study.java.java02;/**
 * ClassName: ArithmeticExercise1
 * Package: com.study.java.java02
 * Description:
 *
 * @Author wangzijie
 * @Create 2025/11/4 17:10
 * @Version 1.0
 */


public class ArithmeticExercise1 {
    public static void main(String[] args) {

        int num = 9121;

        int ge = num %10;
        System.out.println("ge = " + ge);
        int shi = num/10%100;
        System.out.println("shi = " + shi);

        String str = num+"";
        System.out.println("qian = " + str.charAt(0));

    }


}
