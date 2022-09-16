package com.tedu;

import java.util.*;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/15 19:02
 */

enum Gender {
    MALE, FEMALE, NONE;

    public static void value(Gender gender) {
        switch (gender) {
            case MALE:
                System.out.println("男士");
                break;
            case FEMALE:
                System.out.println("女士");
                break;
            default:
                System.out.println("未知");
        }
    }
}


public class test {

    static void print(List<Object> list) {
        System.out.println(list);
    }

    public static void main(String[] args) {

        for (; ; ) {
            System.out.println(new Date());
        }
    }
}


