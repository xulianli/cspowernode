package com.cspowernode.teaching.p1;


import java.rmi.AlreadyBoundException;

/**
 * @Author 汪洋
 * @Date 2023/3/23 14:13
 * @Description
 * 检查时异常的解决方案2-->throws
 * 1.throw和throws的介绍
 *  a.throw代表动作，它一般出现在方法里面的某个条件表达式里面，代表当某个条件满足的时候
 *  就抛出一个指定的异常对象；一个方法里面，可以写N个throw+异常对象；
 *  b.throws代表声明，它写在方法结构的方法签名后面，后面跟的是异常类，如果有多个，那么
 *  用逗号隔开，那么调用该声明了异常类的方法就一定需要处理该异常，即告诉方法的调用者，该
 *  方法里面有可能会有异常，那么你调用我的时候请准备好处理方案；
 * 2.throw和throws之间的关系以及和检查时与运行时异常的关系
 *  a.如果throw后面跟的是运行时异常，那么我们不需要在throws后面声明出来，那么该方法的调用者
 *  也不需要去解决该异常，希望异常出现，程序报错停止执行；但是你要强制写throws也不会出错，哪怕
 *  你写了，调用方法的地方也不会强制要求处理；
 *  b.如果throw后面跟的是检查时异常，那么该异常一定要throws出来，否则编译出错，并且该方法的
 *  调用者一定要解决该异常
 *      ①.直接try..catch解决
 *      ②.继续往上声明,如果是main方法了，就不要继续声明了，因为这样相当于没解决，出现就停止程序了
 */
public class CheckedExceptionDemo2 {
    //如果main方法仍然往上声明的话，其实已经是丢给虚拟机了，那么一旦出现异常就肯定会停止执行
    public static void main(String[] args){
        try {
            test1();
        } catch (AlreadyBoundException e) {
            e.printStackTrace();
        }
        System.out.println("111111");
    }
    //这样写的话，就代表有个异常该方法里面没能解决，继续往上声明，谁调谁解决
    public static void test1() throws AlreadyBoundException {
        double a = -2;
        double b = 5;
        double result = 0;
        //检查时异常的解决方案1：直接try..catch
        try {
            result = operator(a,b);
        }
        //这样写的话，代表多种异常出现的逻辑处理是一样的写法
//        catch (ClassNotFoundException | AlreadyBoundException e) {
//            e.printStackTrace();
//        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //这样写的话，代表多种异常的处理方式不同
//        catch (AlreadyBoundException e) {
//            e.printStackTrace();
//        }
        System.out.println(result);
    }

    private static double operator(double a, double b) throws ClassNotFoundException, AlreadyBoundException {
        //如果throw后面跟的是运行时异常，那么只需要抛出即可，不需要写throws声明，当然，写了也不报错
        if(a==0){
            throw new ArithmeticException("a不能为0");
        }
        if(b>100){
            throw new ClassNotFoundException("b不能大于100");
        }
        if(a<0){
            throw new AlreadyBoundException("a不能小于0");
        }
        //自己抛出去的异常自己抓
        try {
            if(a>100){
                throw new IllegalAccessException();
            }
        }catch (Exception e){

        }
        return b/a;
    }
}
