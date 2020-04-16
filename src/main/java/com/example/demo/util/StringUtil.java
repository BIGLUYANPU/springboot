package com.example.demo.util;

public final class StringUtil {
    private StringUtil(){}

    public static boolean isEmpty(String target){
        return "".equals(target) || null ==target;
    }
}
