package com.learn.java.learnexception;

/**
 * @Author: Lishuai
 * @Date: Created on 2018/11/1
 */
public class ForTryAndTryFor {

    public static void main(String[] args) {
        tryFor();
        forTry();
    }

    // todo 使用javap -c fileName.class输出对应的字节码

    public static void tryFor() {
        int j = 3;
        try {
            for (int i = 0; i < 1000; i++) {
                Math.sin(j);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void forTry() {
        int j = 3;
        for (int i = 0; i < 1000; i++) {
            try {
                Math.sin(j);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
