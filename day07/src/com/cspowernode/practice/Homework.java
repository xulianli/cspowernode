package com.cspowernode.practice;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author 徐联理
 * @Date 2023/3/11 15:49
 * @Description
 * 1.完成身份证验证的题目
 *  * 提示：字符串转数组：toCharArray()，以及不要直接把char类型的数字和int类型的数字进行算术运算，会出错
 * 身份证第18位（校验码）的计算方法 ：
 * 			1、将前面的身份证号码17位数分别乘以不同的系数。
 * 				   从第一位到第十七位的系数分别为：
 * 				   7－9－10－5－8－4－2－1－6－3－7－9－10－5－8－4－2。
 * 			2、将这17位数字和系数相乘的结果相加。
 * 			3、用加出来和除以11，看余数是多少？
 * 			4、余数只可能有
 * 				   0－1－2－3－4－5－6－7－8－9－10这11个数字。
 * 				   其分别对应的最后一位身份证的号码为
 * 				   1－0－X－9－8－7－6－5－4－3－2。
 * 			5、通过上面得知如果余数是2，就会在身份证的第18位数字上出现罗马数字的Ⅹ。
 * 					 如果余数是10，身份证的最后一位号码就是2。
 * 					 例如：某男性的身份证号码是34052419800101001X。我们要看看这个身份证是
 * 					 不是合法的身份证。首先我们得出前17位的乘积和是189，然后用189除以11得出
 * 					 的结果是17+2/11，也就是说其余数是2。最后通过对应规则就可以知道余数2对应
 * 					 的数字是x。 所以，可以判定这是一个合格的身份证号码
 *
 * 2.完成元素的插入练习题
 * 3.完成元素的删除练习题
 * 4.假设有一个长度为n的数组，然后让其往右移动m位，移动出去的m位元素会到该数组的前面m位去，请完成该方法的书写：
 * 比如数组为{1,2,3,4,5,6}，现在让其移动2位，就变成{5,6,1,2,3,4}
 */
public class Homework {
    public static void main(String[] args) {
        idNumber();
        //insert();
        //delete();
        //rightShift();

    }

    private static int[] rightShift(int[] arr, int m) {
        //非法校验
        if(m<0||m>arr.length){
            throw new IndexOutOfBoundsException("位数越界:"+m);
        }
        int n = arr.length;
        //将右移出去的元素存入新的数组中
        int[] leftArr = Arrays.copyOfRange(arr,n-m,n);
        //将剩下的元素从第m位开始存入新数组中
        int[] newArr= new int[n];
        System.arraycopy(arr,0,newArr, m,n-m);
        //将右移出去的元素复制到新数组中
        for (int i = 0; i < m; i++) {
            newArr[i]=leftArr[i];
        }
        return newArr;
    }

    private static int[] delete(int[] arr, int index) {
        if (index<0 || index>arr.length)
            throw new IndexOutOfBoundsException("索引越界:"+index);
        int[] newArr = new int[arr.length-1];
        System.arraycopy(arr,index+1,newArr,index,arr.length-1-index);
        for (int i = 0; i < index; i++) {
            newArr[i]=arr[i];
        }
        return newArr;
    }

    private static int[] insert(int[] arr, int index, int value) {
        if (index<0 || index>arr.length)
            throw new IndexOutOfBoundsException("索引越界:"+index);
        int[] newArr = new int[arr.length+1];
        System.arraycopy(arr,index,newArr,index+1,arr.length-index);
        for (int i = 0; i < index; i++) {
            newArr[i]=arr[i];
        }
        newArr[index]=value;
        return newArr;
    }

    private static void idNumber() {
        //将系数录入int数组中
        int[] mulNum = {7,9,10,5,8,4,2,1,6,3,7,9,10,5,8,4,2};
        char[] lastID ={'1','0','X','9','8','7','6','5','4','3','2'};
//      输入身份证号码，并将身份证号的字符串转换为char数组
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入身份证号码：");
        String str = sc.nextLine();
        if (str.length()!=18)
            throw new IllegalArgumentException("身份证位数不正确");
        char[] idChar = str.toCharArray();
//      将前面的身份证号码17位数分别乘以不同的系数, 将这17位数字和系数相乘的结果相加。
//      用加出来和除以11，得余数
        int sum=0;
        for (int i = 0; i < mulNum.length; i++) {
            sum+=mulNum[i]*(idChar[i]-48);
        }
        int remain = sum%11;
        //验证身份证号码最后一位
        System.out.println(idChar[idChar.length-1]==lastID[remain]? "身份证号码合法":"身份证号码不合法");
    }


}
