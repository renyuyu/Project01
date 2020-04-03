package com.atguigu.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class TryWithResource {

    private static final int a= 1;



    public static void main(String[] args) {
//dsf
        /*
        * sdfsd
        * */
        try (FileInputStream inputStream = new FileInputStream(new File("test"))) {
            System.out.println(inputStream.read());
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage(), e);
        }

        for (String arg : args) {

        }

        for (int i = 0; i < args.length; i++) {
            String arg = args[i];

        }



    }

}
