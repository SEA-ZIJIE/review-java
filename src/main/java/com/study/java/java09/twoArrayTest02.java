package com.study.java.java09;/**
 * ClassName: twoArrayTest02
 * Package: com.study.java.java09
 * Description:
 *
 * @Author wangzijie
 * @Create 2025/11/11 15:33
 * @Version 1.0
 */

/**
 * <p>标题: </p>
 * <p>功能描述: </p>
 *
 * <p>创建时间: 2025/11/11 15:33</p>
 * <p>作者：王贤 </p>
 * <p>修改历史记录：</p>
 * ====================================================================<br>
 * 维护单：<br>
 * 修改日期：<br>
 * 修改人：<br>
 * 修改内容：<br>
 */
public class twoArrayTest02 {
    public static void main(String[] args) {

        int[][] arr = new int[3][5];
        int value = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = value;
                System.out.print(arr[i][j] + "\t");

            }
            value++;
            System.out.println();
        }
    }
}
