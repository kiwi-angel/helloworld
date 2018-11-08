package com.learn.java.java8;

import java.util.function.Function;

/**
 * @Author: Lishuai
 * @Date: Created on 2018/5/1
 */
public class DoubleColonOperator {

    public void test(){
        Function<Double, Double> square = Hey::square;
        double ans = square.apply(23d);
    }
}

class Hey{
    public static double square(double num){
        return Math.pow(num , 2);
    }
}