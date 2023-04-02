package com.cspowernode.teaching.p2;

import java.util.UUID;

/**
 * @Author 汪洋
 * @Date 2023/3/25 11:43
 * @Description
 * UUID类的使用
 * 该类的作用就是生成一个32位长度的16进制的字符串，然后供我们给数据进行标识，让其永远
 * 不会发生重复
 */
public class UUIDDemo {
    public static void main(String[] args) {
        String uuid = UUID.randomUUID().toString().replace("-", "");
        System.out.println(uuid);
    }
}
