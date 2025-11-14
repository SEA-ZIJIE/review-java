package com.study.java.day12;/**
 * ClassName: Book
 * Package: com.study.java.day12
 * Description:
 *
 * @Author wangzijie
 * @Create 2025/11/14 23:22
 * @Version 1.0
 */

/**
 * <p>标题: </p>
 * <p>功能描述: </p>
 *
 * <p>创建时间: 2025/11/14 23:22</p>
 * <p>作者：王贤 </p>
 * <p>修改历史记录：</p>
 * ====================================================================<br>
 * 维护单：<br>
 * 修改日期：<br>
 * 修改人：<br>
 * 修改内容：<br>
 */
public class Book {

    public String name;
    public String price;

    public Book(String name) {
        this.name = name;
    }

    public Book() {
    }

    public Book(String price, String name) {
        this.price = price;
        this.name = name;
    }
}
