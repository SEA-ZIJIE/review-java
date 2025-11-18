package com.study.basic.day14.method;/**
 * ClassName: Chinese
 * Package: com.study.basic.day14.method
 * Description:
 *
 * @Author wangzijie
 * @Create 2025/11/16 16:11
 * @Version 1.0
 */

/**
 * <p>标题: </p>
 * <p>功能描述: </p>
 *
 * <p>创建时间: 2025/11/16 16:11</p>
 * <p>作者：王贤 </p>
 * <p>修改历史记录：</p>
 * ====================================================================<br>
 * 维护单：<br>
 * 修改日期：<br>
 * 修改人：<br>
 * 修改内容：<br>
 */
public class Chinese {
    private static String country;
    private String name;
    private int age;

    public Chinese() {//无参构造
    }

    public Chinese(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static String getCountry() {
        return country;
    }

    public static void setCountry(String country) {
        Chinese.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
