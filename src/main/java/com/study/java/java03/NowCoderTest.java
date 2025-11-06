package com.study.java.java03;/**
 * ClassName: NowCoderTest
 * Package: com.study.java.java03
 * Description:
 *
 * @Author wangzijie
 * @Create 2025/11/5 21:47
 * @Version 1.0
 */



    public class NowCoderTest{
        static boolean out(char c){
            System.out.print(c);
            return true;
        }
        public static void main(String[] argv){
            int i = 0;
            for(out('A');out('B') && (i<2);out('C')){
                i++;
                out('D');
            }
        }
    }

