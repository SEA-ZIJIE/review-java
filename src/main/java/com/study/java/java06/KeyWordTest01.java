package com.study.java.java06;

/**
 * ClassName: KeyWordTest01
 * Package: com.study.java.java06
 * Description:
 *
 * @Author wangzijie
 * @Create 2025/11/7 22:54
 * @Version 1.0
 */


public class KeyWordTest01 {
    public static void main(String[] args) {
        //    平年十二个月以及每个月的总天数
        for (int i = 1; i <= 12; i++) {
            switch (i) {
                case 2 -> System.out.println(i + "月是28天");
                case 4, 6, 9, 11 -> System.out.println(i + "月是30天");
                default -> System.out.println(i + "月是31天");
            }
        }
    }


}
