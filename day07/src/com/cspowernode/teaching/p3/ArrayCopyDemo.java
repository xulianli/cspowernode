package com.cspowernode.teaching.p3;

import java.util.Arrays;

/**
 * @Author 汪洋
 * @Date 2023/3/11 16:42
 * @Description
 * 数组的复制和扩容
 * 1.数组有一个很重要的特性：数组长度永远不变，所以数组的扩容从本质上来说就是数组的复制；
 * 2.数组的复制有哪几种写法：
 *  a.Arrays.copyOf(arr,length);-->局限性：必须从源数组的首位元素开始复制到目标数组中的首位去
 *  b.Arrays.copyOfRange(arr,start,end);-->能够指定源数组赋值的起始位置，但是无法指定目标数组的位置
 *  c.System.arraycopy(src,srcPos,dest,destPos,length);-->能够满足任何方式的数组复制，但是我们
 *  需要单独定义新数组出来
 */
public class ArrayCopyDemo {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        //1.把数组的容量扩大指定的长度
        arr = Arrays.copyOf(arr,arr.length+1);
        System.out.println(Arrays.toString(arr));
        //2.如果每次都只新增一个空间，那么就可以使用固定的写法为新增的空间赋值
        arr[arr.length-1] = 100;
        //3.进行数组的缩容
        arr = Arrays.copyOf(arr,3);
        System.out.println(Arrays.toString(arr));
        //4.设置源数组复制的范围
        arr = new int[]{1,2,3,4,5};
        int [] newArr = Arrays.copyOfRange(arr,1,4);
        System.out.println(Arrays.toString(newArr));
        //需求：把原始数组的3,4,5这三个元素复制到新数组中去，并且后面额外多2个大小的空间
        int [] newArr1 = Arrays.copyOfRange(arr,2,7);
        System.out.println(Arrays.toString(newArr1));
        //5.把原始数组中的234放入到一个新数组中去，形成0023400的新数组
        int [] newArr2 = new int[7];
        System.arraycopy(arr,1,newArr2,2,3);
        System.out.println(Arrays.toString(newArr2));
    }
}
