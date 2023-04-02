package com.cspowernode.teaching.p3;

/**
 * @Author 汪洋
 * @Date 2023/3/21 16:19
 * @Description
 * 模拟工作中，把所有常量都放在一个类里面的使用场合
 */
public class Const {
    public final static class Phone{
        /**
         * 华为手机
         */
        public static final int HUAWEI_PHONE = 1;
        /**
         * 小米手机
         */
        public static final int XIAOMI_PHONE = 2;
        /**
         * 苹果手机
         */
        public static final int APPLE_PHONE = 3;
    }
    public final static class Error{
        /**
         * 参数错误
         */
        public static final int PARAM_ERROR = 1;
        /**
         * 显示错误
         */
        public static final int SHOW_ERROR = 2;
        /**
         * 无法执行
         */
        public static final int NO_RUN_ERROR = 3;
    }
}
