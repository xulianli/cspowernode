package com.cspowernode.teaching.p3;

/**
 * @author 汪洋
 * @Date 2023/3/6 15:56
 * @Description
 * java中基本数据类型的转换
 * 1.为什么需要数据类型的转换
 *  因为很多时候，我们所要使用的数据类型与我们所得到的数据类型之间是存在差异性的，那么为了让
 *  这个差异性消失，所以我们就需要学会如何完成类型的转换
 * 2.基本数据类型的转换分类
 *  a、自然转换：把小类型的数据放入到大类型的空间中，不需要进行任何的人为操作
 *  byte-->short-->int-->long-->float-->double
 *                  ↑
 *                 char
 *  注意：long类型转为float类型会有可能[遗失精度]
 *  b、强制转换：把大类型的数据放入到小类型的空间中，因为大类型的数据有可能造成数据的溢出，所以
 *  一旦我们这样进行存放了，编译器就会警告我们有可能出问题，于是我们就需要使用在数据前加小括号，
 *  小括号里面放等号左边的类型的方式来告诉编译器我们确定要这样做；
 *  注意：如果大类型的数据超出了小类型的空间大小的话就会产生数据溢出，所以我们在进行强转的时候
 *  尽可能要确定数据是否能够存放的进去，避免[数据溢出]
 *  提示：我们可以通过强转的形式来抹去浮点型的小数位；
 *
 */
public class DataTypeTranslationDemo {
    public static void main(String[] args) {
        //1.演示自然转换
        byte a = 10;
        short b = a;
        int c = b;
        long d = c;
        float e = d;
        double f = e;
        char g = 'a';
        int h = g;
        //2.自然转换中一个特殊的场景：long-->float
        long x1 = 123456789012345L;
        float x2 = x1;
        System.out.println(x2);
        //3.强转的演示
        int y1 = 100;
        byte y2 = (byte) y1;
        //4.我们可以利用强转来强行抹掉浮点型的小数位
        double y3 = 3.14;
        int y4 = (int)y3;
        System.out.println(y4);
    }
}
