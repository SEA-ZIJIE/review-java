package com.study.basic.day15.array;/**
 * ClassName: Student
 * Package: com.study.basic.day15.array
 * Description:
 *
 * @Author wangzijie
 * @Create 2025/11/17 22:12
 * @Version 1.0
 */

/**
 * <p>标题: </p>
 * <p>功能描述: </p>
 *
 * <p>创建时间: 2025/11/17 22:12</p>
 * <p>作者：王贤 </p>
 * <p>修改历史记录：</p>
 * ====================================================================<br>
 * 维护单：<br>
 * 修改日期：<br>
 * 修改人：<br>
 * 修改内容：<br>
 */
public class Student {
    private String mame;
    private int score;
    public Student(String mame, int score) {
        this.mame = mame;
        this.score = score;
    }

    public String getMame() {
        return mame;
    }

    public void setMame(String mame) {
        this.mame = mame;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Student() {
    }

    //    无参构造
}
