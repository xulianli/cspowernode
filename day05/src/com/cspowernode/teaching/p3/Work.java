package com.cspowernode.teaching.p3;

/**
 * @author 汪洋
 * @Date 2023/3/9 16:27
 * @Description
 * 1.随机1-100的数字，当你随机到一个质数的时候，结束该循环，然后统计循环了多少次
 * 2.循环1-100的随机数，随机到的数字用来进行累加操作，如果累加的和等于100，那么输出该表达式，并且结束循环，统计一共
 * 失败了多少次，如果累加的和大于100，那么计失败一次，重新开始进行累加；
 */
public class Work {
    public static void main(String[] args) {
        work1();
        work2();
    }

    private static void work2() {
        //1.定义一个用来统计失败次数的count
        int count = 0;
        //2.定义用来展示加法表达式的字符串
        String addStr = "";
        //3.定义用来累加随机数的变量
        int sum = 0;
        //4.因为不确定循环次数，所以使用死循环
        while(true){//5+10+50+35+
            //5.拿到随机数
            int num = (int)(Math.random()*99)+1;
            //6.把该随机数和sum进行累加操作
            sum+=num;
            //7.把该随机数和之前的加法表达式拼接在一起
            addStr += num+"+";
            //8.判断该累加的变量是否等于100
            if(sum==100){
                //8.1.如果是100，那么输出该加法表达式，并且输出一共失败了多少次
                System.out.println("一共失败了"+count+"次");
                //8.2.去掉加法表达式中的加号
                addStr = addStr.substring(0,addStr.length() - 1);
                System.out.println(addStr+" = 100");
                //8.3.结束循环
                break;
            //9.判断该累加的变量如果超过了100，就代表本次累加失败了
            }else if(sum>100){
                //9.1.为count进行加1
                count++;
                //9.2.为sum来重置
                sum = 0;
                //9.3.为加法表达式重置
                addStr = "";
            }
        }
    }

    private static void work1() {
        //1.先定义一个变量count用来统计次数
        int count = 0;
        //2.因为不确定循环次数，所以使用死循环
        while(true){
            //3.拿到随机数
            int num = (int)(Math.random()*100)+1;
            //4.进行计数器加1
            count++;
            //5.把该数字拿来判断是否是质数
            for(int i = 2;i<=num;i++){
                if(num%i==0&&num==i){
                    System.out.println("一共随机了"+count+"次，才随机到这个质数："+num);
                    //6.如果找到了质数，那么就意味着程序已经运行完了，所以直接return结束方法
                    return;
                }else if(num%i==0){
                    break;
                }
            }
        }
    }
}
