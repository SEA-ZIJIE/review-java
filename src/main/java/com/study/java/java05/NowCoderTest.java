package com.study.java.java05;

import java.util.Date;

public class NowCoderTest extends Date {
    private static final long serialVersionUID = 1L;

    private void test() {
        System.out.println(super.getClass().getName());
    }

    public static void main(String[] args) {
        new NowCoderTest().test();
    }
}

