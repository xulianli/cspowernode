package com.cspowernode.teaching.p2;

/**
 * @Author 汪洋
 * @Date 2023/3/24 14:25
 * @Description
 * 完成QQ号码的验证
 * 1.长度在5-12位
 * 2.首位不能是0
 * 3.里面不能有非数字字符
 *
 * 完成以上的验证，并且以下下面几种方式来完成
 * 1.最基本的写法：逐一的验证；
 * 2.用异常来解决非法字符的问题；
 * 3.尝试用matches来直接书写规则；--->能写就写
 */
public class QQCheckDemo {
    public static void main(String[] args) {
        String qq = "213113";
//        check1(qq);
//        check2(qq);
        check3(qq);
    }

    private static void check3(String qq) {
        System.out.println(qq.matches("[1-9][0-9]{4,11}")?"qq号码正确":"qq号码有误");
    }

    private static void check2(String qq) {
        if(qq.startsWith("0")){
            System.out.println("首位不能是0");
            return;
        }
        if(qq.length()<5||qq.length()>12){
            System.out.println("qq号码长度不正确");
            return;
        }
        try {
            Long.parseLong(qq);
        }catch (NumberFormatException e) {
            System.out.println("qq号码有非法字符");
            return;
        }
        System.out.println("您的qq号码正确");
    }
    private static void check1(String qq) {
        if(qq.startsWith("0")){
            System.out.println("首位不能是0");
            return;
        }
        if(qq.length()<5||qq.length()>12){
            System.out.println("qq号码长度不正确");
            return;
        }
        for (int i = 0; i < qq.length(); i++) {
            if(!Character.isDigit(qq.charAt(i))){
                System.out.println("有非法字符");
                return;
            }
        }
        System.out.println("您的qq号码正确");
    }
}
