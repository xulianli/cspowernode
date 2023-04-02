package com.cspowernode.teaching.p1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @Author 汪洋
 * @Date 2023/3/23 11:02
 * @Description
 * 检查时异常的解决方案1-->try..catch..finally
 * 1.检查时异常的机制
 *  当我们调用的方法里面出现了throws+检查时异常时，这时候，编译器就会对我们调用的这个
 *  方法进行编译报错，那么就需要我们对该方法进行处理，处理的手段有两种：
 *  a.try..catch..finally:在此时我把该异常给处理掉
 *  b.throws:无法处理，继续往上进行声明，让该方法的调用者去解决
 *  注意：我们需要遵循的原则是能解决就解决，实在解决不了抛给下一个方法来解决
 *  注意：main方法的上一层就是JVM，你在main方法中仍然往上throws的话，相当于不解决
 * 2.try..catch..finally的理解
 *  语法：
 *      try{
 *          有可能出现异常的代码块
 *      }catch(异常声明1){
 *          如果出现了异常，那么匹配到该catch时就执行这里
 *      }catch(异常声明2){
 *          如果出现了异常，那么匹配到该catch时就执行这里
 *      }
 *      ...{
 *
 *      }finally{
 *          不管怎么样都要执行的代码
 *      }
 *  a.try:
 *      ①.尝试在该代码块里面寻找有异常的代码；
 *      ②.如果try里面出现了异常,那么该异常后面的代码都不执行
 *      ③.如果try里面出现了异常，那么在此时拿到的是异常对象，然后拿着异常对象
 *      去跟catch中的异常声明进行一一匹配，匹配到之后就进入到对应的catch中执行，不会
 *      进入多个catch里面去；
 *      ④.我们在try里面的代码不一定是会有异常的，但是你必须考虑到如果出现异常，后面
 *      的代码是不执行的，所以我们还是尽量把异常有关的代码放try里面，横竖都要执行的
 *      放外面去；
 *  b.catch：
 *      ①.catch可以有0个或多个，它代表声明一些有可能会出现的异常在该catch的小括号里面；
 *      ②.catch后面的异常可以接try中异常对象的父类，但是父类一定要写在最后面，否则会
 *      编译报错，我们实际开发过程中，测试阶段不要用父类在后面兜底，尽可能把错误暴露出来
 *      进行解决，但是上线阶段，我们习惯性在后面用父类兜底，防止因为出现未知异常而导致
 *      程序报错从而程序停掉；
 *      ③.catch后面的逻辑代码往往在工作的时候会把错误信息使用日志记录下来，或者来写这类
 *      异常出现之后要进行其他的逻辑方案，如果你只是想看错误的话，就使用默认的e.printStackTrack();
 *  c.finally
 *      ①.finally可有可无，但是如果要有的话，就一定得要配套try；
 *      ②.finally里面放不管是否出现异常都要执行的代码，一般我们用来放关闭资源的代码
 *      比如数据库资源、网络连接资源、流资源，除非你调用了System.exit(0)这样会强行
 *      结束程序，那么finally就不会执行了
 *      ③.面试题：final、finally和finalized的区别
 */
public class CheckedExceptionDemo1 {
    public static void main(String[] args) {
        try{
//            "".charAt(0);
            //终止程序
            System.exit(0);
            FileInputStream fis = new FileInputStream("d:/HelloWorld.java");
            System.out.println("我这里是try里面有可能出现异常的下一行代码");
        }
        //不能把父类异常写上面，子类异常写下面，但是可以单独一个父类异常
//        catch (Exception e){
//
//        }
        catch(FileNotFoundException e){
//            System.out.println("这里抓住了FileNotFoundException");
            //打印错误堆栈跟踪信息
            e.printStackTrace();
        //try里面没有声明出来的异常，在这里是不能写出来的
        }
//        catch(ClassNotFoundException e){
//            System.out.println("这里抓住了FileNotFoundException");
//        }
//        catch (Exception e){
//
//        }
        finally{
            System.out.println("这里是finally的代码");
        }
        System.out.println(11111);
    }
}
