package com.cspowernode.teaching.p2;

/**
 * @Author 汪洋
 * @Date 2023/3/17 16:11
 * @Description
 * 该类的作用是来测试同一个包下访问AccessDemo里面的资源
 */
public class AccessDemo1 {
    public void test(){
        AccessDemo ad = new AccessDemo();
//        System.out.println(ad.a);
        System.out.println(ad.b);
        System.out.println(ad.c);
        System.out.println(ad.d);
    }
}
