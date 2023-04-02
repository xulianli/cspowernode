package com.cspowernode.teaching.异常面试题;

class Demo3 {
    public static void main(String[] args) {
        try {
            throw new B();
        } catch (Exception e) {
            System.out.println(e.toString());
        }
        //加上下面被注释的代码之后效果怎么样
//		catch(A e){
//			System.out.println(e.toString());
//		}
    }
}
class A extends Exception {
}
class B extends A {
}

