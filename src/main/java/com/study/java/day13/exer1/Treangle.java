package com.study.java.day13.exer1;/**
 * ClassName: Treangle
 * Package: com.study.java.day13.exer1
 * Description:
 *
 * @Author wangzijie
 * @Create 2025/11/15 11:30
 * @Version 1.0
 */

/**
 * <p>标题: </p>
 * <p>功能描述: </p>
 *
 * <p>创建时间: 2025/11/15 11:30</p>
 * <p>作者：王贤 </p>
 * <p>修改历史记录：</p>
 * ====================================================================<br>
 * 维护单：<br>
 * 修改日期：<br>
 * 修改人：<br>
 * 修改内容：<br>
 */
public class Treangle {
    public double a;
    public double b;
    public double c;
    public Treangle() {
    }
    public Treangle(double a, double b, double c) {
        if(a<0 || b<0 || c<0||a+b<c||b+c<a){
            System.out.println();
        }else {
        this.a = a;
        this.b = b;
        this.c = c;}
    }
}
