package com.learn.java.factory;

/**
 * @Author: Lishuai
 * @Date: Created on 2018/9/18
 */
public class OperationSubtraction extends Operation {

    @Override
    public double getResult(){
        return getNumber_A() - getNumber_B();
    }
}
