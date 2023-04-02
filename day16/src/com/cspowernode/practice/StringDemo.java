package com.cspowernode.practice;

import java.util.Scanner;

/**
 * @Author 徐联理
 * @Date 2023/3/24 11:55
 * @Description
 * 完成QQ号码的验证
 * 1.长度在5-12位
 * 2.首位不能是0
 * 3.里面不能有非数字字符
 *
 * 完成以上的验证，并且以下下面几种方式来完成
 * 1.最基本的写法：逐一的验证；
 * 2.用异常来解决非法字符的问题；
 * 3.尝试用matches来直接书写规则
 *
 */
public class StringDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入QQ号：");
        String qq = sc.next();
        if (qq.length()<5 || qq.length()>12){
        try {
            throw new IllegalStringLength();
        } catch (IllegalStringLength illegalStringLength) {
            illegalStringLength.printStackTrace();
        }}
        if ('0'==qq.charAt(0)){
            try {
                throw new IllegalStartElement();
            } catch (IllegalStartElement illegalStartElement) {
                illegalStartElement.printStackTrace();
            }
        }
        for (int i = 0; i < qq.length(); i++) {
            if (qq.charAt(i) < '0' || qq.charAt(i) > '9'){
                try {
                    throw new IllegalElement();
                } catch (IllegalElement illegalElement) {
                    illegalElement.printStackTrace();
                }
            }
        }
        System.out.println("QQ号码正确");
    }
}

class IllegalStringLength extends Exception{
    public IllegalStringLength() {
        super("QQ号码长度不正确");
    }
}
class IllegalStartElement extends Exception{
    public IllegalStartElement() {
        super("QQ号码首位不能为0");
    }
}
class IllegalElement extends Exception{
    public IllegalElement() {
        super("QQ号码不能含有非数字字符");
    }
}
