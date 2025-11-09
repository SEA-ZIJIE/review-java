package com.study.java.java06;

/**
 * ClassName: ArrayTest02
 * Package: com.study.java.java06
 * Description:
 *
 * @Author wangzijie
 * @Create 2025/11/8 15:58
 * @Version 1.0
 */


public class ArrayTest02 {
    public static void main(String[] args) {
//### 26个字母
//
//（1）用一个数组存储26个英文字母的小写形式a-z
//
//（2）正序遍历输出小写字母
//
//（3）逆序遍历输出小写字母
        char[] letters = new char[26];
        for (int i = 0; i < letters.length; i++) {
            letters[i] = (char) ('a' + i);
            System.out.print(letters[i]);
        }
        System.out.println();
        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.print(letters[i]);
        }
    }
}
