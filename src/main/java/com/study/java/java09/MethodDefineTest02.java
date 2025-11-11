package com.study.java.java09;/**
 * ClassName: MethodDefineTest02
 * Package: com.study.java.java09
 * Description:
 *
 * @Author wangzijie
 * @Create 2025/11/11 22:36
 * @Version 1.0
 */

/**
 * <p>标题: </p>
 * <p>功能描述: </p>
 *
 * <p>创建时间: 2025/11/11 22:36</p>
 * <p>作者：王贤 </p>
 * <p>修改历史记录：</p>
 * ====================================================================<br>
 * 维护单：<br>
 * 修改日期：<br>
 * 修改人：<br>
 * 修改内容：<br>
 */
public class MethodDefineTest02 {
    public static void printRectangle(int m, int n,char c) {
        for (int i = 1; i <= m; i++) {
            for (int j =1 ; j <= n; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printRectangle(5,10,'*');
    }
}
