package com.cspowernode.teaching.p1;

/**
 * @Author 汪洋
 * @Date 2023/3/10 15:49
 * @Description
 * 1.定义一个求指定范围内偶数的方法，通过传递参数来求1-参数值范围内的所有偶数，然后把这些偶数输出出来；
 * 2.把嵌套循环中的第一个图形，使用方法的形式来定义行数和列数，通过调用传递的参数来展示不同的行数和列数的图形；
 * 3.把之前判断一个数字是否是质数的案例改成方法：
 * 	public static boolean isPrime(int num){
 *
 *        }
 * 4.把第三题改完之后，在判断1-100内有哪些质数，使用上面的方法来做这个题；
 * 5.模仿第三题和第四题来书写判断一个数字是否是水仙花数的方法，然后调用该方法来展示所有的水仙花数
 */
public class Work {
    public static void main(String[] args) {
//        showRangeEven(20);
//        showRectangle(8,18);
//        for (int i = 1; i <= 100; i++) {
//            if(isPrime(i)){
//                System.out.print(i+"\t");
//            }
//        }
        for (int i = 100; i < 1000; i++) {
            if(isDaffodil(i)){
                System.out.print(i+"\t");
            }
        }
    }
    public static void showRangeEven(int range){
        for (int i = 1; i <= range; i++) {
            System.out.print(i%2==0?i:""+"\t");
        }
    }

    /**
     * 根据输入的行数和列数来展示对应的矩形
     * @param rows 行数
     * @param cols 列数
     */
    public static void showRectangle(int rows,int cols){
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * 判断指定的数字是否是质数
     * @param num 任意一个整数
     * @return 如果是质数返回true，否则返回false
     */
    public static boolean isPrime(int num){
        if(num==1||num==2){
            return false;
        }
        for (int i = 2; i < num; i++) {
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
    public static boolean isDaffodil(int num){
        //非法校验
        if(num>=1000||num<100){
            throw new IllegalArgumentException("水仙花数只能是3位数-->"+num);
        }
        /*int bai = num/100;
        int shi = num/10%10;
        int ge = num%10;
        if(Math.pow(bai,3)+Math.pow(shi,3)+Math.pow(ge,3)==num){
            return true;
        }else {
            return false;
        }*/
        //简写：如果某一个变量你有且只用一次的话，那么你是可以省略声明的过程，而直接把等号右边拿来使用
        return Math.pow(num/100,3)+Math.pow(num/10%10,3)+Math.pow(num%10,3)==num;
    }
}
