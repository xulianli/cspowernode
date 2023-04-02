package com.cspowernode.teaching.p3;

/**
 * @author 汪洋
 * @Date 2023/3/7 14:42
 * @Description
 * switch的使用
 * 1.switch也是一种条件结构，它的语法如下
 *  switch(变量){
 *      case 变量有可能的值1:当变量为该值1的时候执行这里的逻辑;break;
 *      case 变量有可能的值2:当变量为该值2的时候执行这里的逻辑;break;
 *      ...
 *      default:如果以上条件都不满足，那么执行这里的代码;
 *  }
 *  注意事项：
 *  a.变量只能是以下几种类型：byte,short,int,char,enum,从JDK1.7开始支持了字符串
 *  b.在case里面我们没必要把所有的变量有可能的值都写进去，但是如果没匹配到的话就会直接
 *  进入到default中去；
 *  c.在case后面的值只能是等于变量的值，不能在某个范围，也不能大于或者小于；
 *  d.case的冒号后面可以跟多条代码语句，记住结尾使用break，break代表结束整个switch结构
 *  后面的代码就都不会执行了，如果忘记写了break，那么就会发生穿透的行为，直到执行完所有
 *  的代码或者碰到下一个break；所以我们要合理的利用穿透这个特点来帮我们直线一些比较繁琐
 *  的事情；
 *  e.default可以不写，如果前面的case都包含了变量的所有情况的话，那么default不写也无所谓
 * 2.switch和if的区别
 *  a、if能做的事情，switch不一定能做，但是反之却一定可以；
 *  b、switch只适合做精准数据的判定操作，而if结构既可以做精准数据判定还可以做范围判定
 *  总结：一般来说，我们更加习惯使用if..else结构，但是在后期工作中，如果你工作环境里面设置
 *  了很多有精准值的常量的话，那么使用switch会看上去可读性更强一些；
 */
public class SwitchDemo {
    public static void main(String[] args) {
        //案例:month代表月份，根据月份输出对应的季节。
        //春季：3、4、5 夏季：6、7、8 秋季：9、10、11 冬季：12、1、2
        int month = 3;
        /*//1.非法校验
        if(month<1||month>12){
            System.out.println("你输入的月份不正确！");
            return;
        }
        //2.进行if..else的判断
        if(month>=3&&month<=5){
            System.out.println("春季");
        }else if(month>=6&&month<=8){
            System.out.println("夏季");
        }else if(month>=9&&month<=11){
            System.out.println("秋季");
        }else{
            System.out.println("夏季");
        }*/
        //换成switch结构
        switch(month){
            case 3: case 4: case 5:
                System.out.println("春季");
                break;
            case 6: case 7: case 8:
                System.out.println("夏季");
                break;
            case 9: case 10: case 11:
                System.out.println("秋季");
                break;
            case 12: case 1: case 2:
                System.out.println("冬季");
                break;
            default:
                System.out.println("您输入的月份不正确");
        }
    }
}
