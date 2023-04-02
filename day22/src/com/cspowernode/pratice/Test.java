package com.cspowernode.pratice;

import java.util.*;

/**
 * @Author 徐联理
 * @Date 2023/4/1 18:40
 * @Description
 */
public class Test {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();
        String s = "code";
        map.put(s, "1");
        map.put(s, "2");
        System.out.println(map.size());
    }
}
