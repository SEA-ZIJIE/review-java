package com.study.java.java10;/**
 * ClassName: MethodExercise03
 * Package: com.study.java.java10
 * Description:
 *
 * @Author wangzijie
 * @Create 2025/11/12 8:26
 * @Version 1.0
 */


public class MethodExercise03 {
    public static int getANumberBetween(int a,int b){
//        Math.random();
//        Math.random()*100;
        return (int)(Math.random()*(b-a)+a);
    }

    public static void main(String[] args) {

        int q = getANumberBetween(1, 100);
        System.out.println("q = " + q);
        int w = getANumberBetween(10, 20);
        System.out.println("w = " + w);
    }


}
