package com.cspowernode.teaching.p2;

/**
 * @author 汪洋
 * @Date 2023/3/9 14:50
 * @Description
 * 循环控制语句
 * 1.在循环中当满足某个条件的时候，可以控制循环的节奏，这就是循环控制语句；
 * 2.循环控制语句主要有如下2个：
 *  a、continue
 *      结束本轮循环，开始下轮循环--->作用：阻断循环中还未执行的那些代码
 *  b、break
 *      结束离它最近的这个循环--->作用：结束整个循环
 * 3.注意事项
 *  a、continue、break、return这几个关键字的下面都不能写代码，否则报错
 *  b、break不仅仅能用在循环语句中，还可以用在switch中，但是你如果直接写在没有循环的if里面，那么
 *  就会报错，continue只能写在循环里；
 */
public class LoopControllerDemo {
    public static void main(String[] args) {
        for(int i = 0;i<10;i++){
            if(i==5){
//                continue;
                break;
//                System.out.println(123);
            }
            System.out.println(i);
        }
    }
}
