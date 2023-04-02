package com.cspowernode.teaching;

/**
 * @author 汪洋
 * @Date 2023/3/4 17:09
 * @Description
 */
public class Test {
    void test(){
        //3.3.尝试在其他的类中来访问常量
        System.out.println(VarDemo.MAX_VALUE);
        //3.4.尝试修改常量，发现无法被修改，原因是它的修饰词final造成的
//        VarDemo.MAX_VALUE = 66666;
    }
}
