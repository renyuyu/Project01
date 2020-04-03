package com.atguigu.bean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author renyuyu
 * @Description: 测试模板快捷键
 * @date 2020-04-03 12:48 上午
 */
public class TestTemplates {

    public static final String STR = "123";
    public static final int NUM = 100;


    public static void main(String[] args) {

        //psvm ：2019现在输入m即可
        //so sout
        System.out.println();
        //soutp
        System.out.println("args = " + Arrays.deepToString(args));
        //soutf
        System.out.printf("");
        //soutv
        System.out.println("args = " + args);
        //soutm
        System.out.println("TestTemplates.main");

        //fori
        for (int i = 0; i <1 ; i++) {

        }
        //foreach
//        for (:
//             ) {
//
//        }
        for (String arg : args) {

        }

        List a = new ArrayList();
        for (Object o : a) {

        }
        for (Object o : a) {

        }

        if (a == null) {

        }
        if (a != null) {

        }





    }

}
