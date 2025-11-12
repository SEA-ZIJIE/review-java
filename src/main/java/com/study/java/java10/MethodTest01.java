package com.study.java.java10;/**
 * ClassName: MethodTest01
 * Package: com.study.java.java10
 * Description:
 *
 * @Author wangzijie
 * @Create 2025/11/12 16:11
 * @Version 1.0
 */

/**
 * <p>标题: </p>
 * <p>功能描述: </p>
 *
 * <p>创建时间: 2025/11/12 16:11</p>
 * <p>作者：王贤 </p>
 * <p>修改历史记录：</p>
 * ====================================================================<br>
 * 维护单：<br>
 * 修改日期：<br>
 * 修改人：<br>
 * 修改内容：<br>
 */
public class MethodTest01 {
    //    求任意两个整数的和
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int a = 10;

        int b = 20;
        int i = add(a, b);
        System.out.println(i);
    }


}
