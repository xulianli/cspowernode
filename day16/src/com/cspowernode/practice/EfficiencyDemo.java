package com.cspowernode.practice;

/**
 * @Author 徐联理
 * @Date 2023/3/24 14:53
 * @Description
 */
public class EfficiencyDemo {
    public static void main(String[] args) {
        StringAppend();
        StringBufferAppend();
        StringBuilderAppend();

    }

    private static void StringBuilderAppend() {
        //StringBuilder
        StringBuilder sb = new StringBuilder();
        long now1 = System.currentTimeMillis(); // 开始时间
        for (int i = 0; i < 10000; i++) { // 进行10000次字符串拼接
            sb.append(i);
        }
        long now2 = System.currentTimeMillis(); // 结束时间
        System.out.println("StringBuilder耗时：" + (now2 - now1) + "ms");
    }

    private static void StringBufferAppend() {
        //StringBuffer
        StringBuffer sb2 = new StringBuffer();
        long time5 = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            sb2.append(i);
        }
        long time6 = System.currentTimeMillis();
        System.out.println("StringBuffer耗时："+(time6-time5)+ "ms");
    }

    private static void StringAppend() {
        //String
        String sc1 = "";
        long time1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            sc1 = sc1+i;
        }
        long time2 = System.currentTimeMillis();
        long efficiency = time2- time1;
        System.out.println("String耗时："+efficiency+ "ms");
    }
}
