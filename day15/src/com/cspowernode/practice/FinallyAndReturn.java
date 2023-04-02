package com.cspowernode.practice;

/**
 * @Author 徐联理
 * @Date 2023/3/23 18:53
 * @Description
 */
public class FinallyAndReturn {
    public static void main(String[] args) {
		System.out.println(test(null));
//		System.out.println(test("0"));
//        System.out.println(test(""));
    }
    private static int test(String str) {
        try{
            return str.charAt(0)-'0';
        }catch(NullPointerException e){
            e.printStackTrace();
            System.out.println("a");
            return 1;
        }catch(RuntimeException e){
            e.printStackTrace();
            System.out.println("b");
            return 2;
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("c");
            return 3;
        }finally{
            System.out.println("d");
            //如果finally里面没有return的话，结果如何
            return 4;
        }
    }

}
