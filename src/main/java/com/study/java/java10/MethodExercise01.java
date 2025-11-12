package com.study.java.java10;/**
 * ClassName: MethodExercise01
 * Package: com.study.java.java10
 * Description:
 *
 * @Author wangzijie
 * @Create 2025/11/12 8:22
 * @Version 1.0
 */

import java.util.Scanner;

import static java.lang.Math.max;

/**
 * <p>标题: </p>
 * <p>功能描述: </p>
 *
 * <p>创建时间: 2025/11/12 8:22</p>
 * <p>作者：王贤 </p>
 * <p>修改历史记录：</p>
 * ====================================================================<br>
 * 维护单：<br>
 * 修改日期：<br>
 * 修改人：<br>
 * 修改内容：<br>
 */
public class MethodExercise01 {
    public static void main(int a,int b){
        if(a>b){
            System.out.println("max:"+a);
        }else {
            System.out.println("max:"+b);
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();

    max(a,b);
    sc.close();

    }
}
