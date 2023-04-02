package com.cspowernode.teaching.p2;

import java.util.Arrays;

/**
 * @Author 汪洋
 * @Date 2023/3/20 16:06
 * @Description
 * 验证不同的字符串是否拥有相同的hashcode值：构建出2个长度的大小写字母，然后判断这里面有哪些
 * 字符串不同，但是拥有相同的hashcode值
 */
public class HashcodeTest {
    public static void main(String[] args) {
        String [] src = buildArray();
        for (int i = 0; i < src.length; i++) {
            for (int j = 0; j < src.length; j++) {
                if((!src[i].equals(src[j]))&&src[i].hashCode()==src[j].hashCode()){
                    System.out.println(src[i] + " "+src[j]);
                }
            }
        }
        System.out.println("Ea".hashCode());
        System.out.println("FB".hashCode());
    }

    private static String[] buildArray() {
        String [] src = {};
        int index = 0;
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                src = Arrays.copyOf(src,src.length+4);
                src[index++] = ""+(char)('a'+i)+(char)('a'+j);
                src[index++] = ""+(char)('a'+i)+(char)('A'+j);
                src[index++] = ""+(char)('A'+i)+(char)('a'+j);
                src[index++] = ""+(char)('A'+i)+(char)('A'+j);
            }
        }
        return src;
    }
}
