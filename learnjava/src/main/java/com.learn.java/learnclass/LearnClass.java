package com.learn.java.learnclass;

/**
 * @Author: Lishuai
 * @Date: Created on 2018/10/18
 */
public class LearnClass {

    public static void main(String[] argv) {

        ChildClass child = new ChildClass();

        System.out.println("aaa");

        child.childMethod();

        System.out.println("aaa");

        child.parentMethod();
    }
}
