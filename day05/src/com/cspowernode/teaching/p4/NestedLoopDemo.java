package com.cspowernode.teaching.p4;

/**
 * @author 汪洋
 * @Date 2023/3/9 17:07
 * @Description
 * 嵌套循环的使用
 * 1.所谓嵌套循环其实就是循环里面套循环，那么我们会把外部的循环称之为外循环，里面的循环称之为内循环，它们之间
 * 是存在一定的联系的：
 *  外循环循环一次，内循环循环整轮；
 * 2.在嵌套循环中如何使用continue和break；
 * 3.如何在内循环中结束整个循环
 *  a、使用return来结束--->前提是循环的下面没有代码了，因为return会结束掉整个方法
 *  b、类似于C++里面的转跳语句--->为循环上面加标签，然后在break后面接标签名，缺点：会影响程序的原本结构
 *  注意：在两层嵌套循环里面，没有必要使用continue+标签，因为这就是break的逻辑；
 *  c、通过代码逻辑来实现--->比较麻烦
 *      ①.在内层循环之上定义一个标记
 *      ②.在内层循环的判断条件里面把该标记进行修改，然后break
 *      ③.在内层循环结束之后，判断该标记是否被修改过，如果被修改过，继续break
 * 4.嵌套循环的经验总结
 *  a、一般情况下，嵌套循环不要超过3层，否则代码逻辑会非常复杂；
 *  b、我们如果题目有很明显的行和列的痕迹的话，那么不用说，外层循环肯定是行，内层循环肯定是列；
 *  c、如果每一行的元素个数随着列数而发生变化的话，那么这个内层循环的条件肯定要跟外层循环有关系；
 */
public class NestedLoopDemo {
    public static void main(String[] args) {
        for(int i = 0;i<10;i++){
            //1.定义一个标记
            int flag = 0;
            for(int j = 0;j<10;j++){
                if(i==5&&j==5){
                    //2.在内层循环里面修改该标记
                    flag = 1;
                    break;
                }
                System.out.print("i:"+i+",j:"+j+"\t");
            }
            //3.判断标记是否被修改
            if(flag==1){
                break;
            }
            System.out.println();
        }
        System.out.println("这里是循环之外的代码");
    }
    //使用在循环上打标签的形式来解决内循环跳出外循环的问题
    public static void main1(String[] args) {
        x:for(int i = 0;i<10;i++){
            for(int j = 0;j<10;j++){
                if(i==5&&j==5){
//                    continue x;
                    break x;
//                    return;
                }
                System.out.print("i:"+i+",j:"+j+"\t");
            }
            System.out.println();
        }
        System.out.println("这里是循环之外的代码");
    }
}
