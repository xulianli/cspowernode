package com.cspowernode.teaching.p2;

/**
 * @Author 汪洋
 * @Date 2023/3/13 14:45
 * @Description
 * 可变参数的使用
 * 要求：能否实现不确定参数个数的add方法？
 * a.只要我方法重载写的多，有什么不能做；
 * b.把所有要相加的元素先打包成一个数组，然后方法的参数就是使用数组来进行元素的相加；
 * 1.什么是可变参数
 *  所谓可变参数就是当我们的方法的参数上要使用数组的时候，我们传递实参会比较麻烦，于是
 *  就可以使用可变参数来简化这个过程--->简化了构建成数组的过程
 * 2.可变参数和普通的数组参数相比有哪些一样和不一样的地方
 *  a.数组作为参数要写数组类型-->int [],而可变参数是吧[]改成...
 *  b.数组作为实参传递数据的时候，要保证传递的是数组，所以往往还需要进行数据的打包，否则
 *  无法正常传递数据，而可变参数就可以直接把具体的数据写在参数上即可，编译器会自动完成打包
 *  操作；
 *  c.虽然可变参数是对数组的一种简化，但是我们仍然可以在可变参数的方法上传递数组
 *  d.虽然可变参数在形参上写的是...，但是实际使用还是按照数组来操作
 * 3.使用可变参数注意事项
 *  a.一个方法中只能有一个可变参数，并且必须位于尾部
 *  b.如果方法中的参数是可变参数，那么我们传递的数据可以是0个或多个
 *  c.虽然可变参数的写法和数组不一样，但是它们两者之间是会被识别成同一个方法
 */
public class ParamChangeDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;
        int [] arr = {a,b,c,d};
        System.out.println(add(arr));
        System.out.println(add1(arr));
        System.out.println(add1(a,b,c,d,18,20,32,46));
        //可变参数的传参可以是空参
        System.out.println(add1());
    }
    public static int add(int [] arr){
        int sum = 0;
        for (int i : arr) {
            sum+=i;
        }
        return sum;
    }
    public static int add1(int ... arr){
        int sum = 0;
        for (int i : arr) {
            sum+=i;
        }
        return sum;
    }
    //这才是累加运算更加合理的写法，至少保证有一个参数
    public static int add2(int sum,int ... arr){
        for (int i : arr) {
            sum+=i;
        }
        return sum;
    }
}
