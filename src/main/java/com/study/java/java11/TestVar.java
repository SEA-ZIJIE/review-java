package com.study.java.java11;/**
 * ClassName: TestVar
 * Package: com.study.java.java11
 * Description:
 *
 * @Author wangzijie
 * @Create 2025/11/14 14:58
 * @Version 1.0
 */

/**
 * <p>标题: </p>
 * <p>功能描述: </p>
 *
 * <p>创建时间: 2025/11/14 14:58</p>
 * <p>作者：王贤 </p>
 * <p>修改历史记录：</p>
 * ====================================================================<br>
 * 维护单：<br>
 * 修改日期：<br>
 * 修改人：<br>
 * 修改内容：<br>
 */
public class TestVar {
    public static void main(String[] args) {
        VarParamExercuse01 chilrenDay = new VarParamExercuse01();
        chilrenDay.year = 2025;
        chilrenDay.month = 6;
        chilrenDay.day = 7;
        System.out.println(chilrenDay.year+chilrenDay.month +chilrenDay.day);
        VarParamExercuse01 chilrenDay2 = new VarParamExercuse01();
        chilrenDay2.year = 2025;
        chilrenDay2.month = 10;
        chilrenDay2.day = 24;
        System.out.println(chilrenDay2);
    }
}
