package com.learn.java.leetcode;

/**
 * @Author: Lishuai
 * @Date: Created on 2018/8/13
 */
public class LongestCommonPrefix {

    public static void main(String[] argv){
        String[] input = {"flower","flow","flight"};
        String output;
        output = solution(input);
        System.out.println(output);
    }

    public static String solution(String[] strs){
        if (strs.length == 0) return "";
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) return "";
            }
        return prefix;
    }
}
