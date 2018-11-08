package com.learn.java.strategy.impl;

import com.learn.java.strategy.CashSuper;

/**
 * @Author: Lishuai
 * @Date: Created on 2018/9/18
 */
public class CashReturn implements CashSuper {

    private double moneyCondition;
    private double moneyReturn;

    public CashReturn(String moneyCondition, String moneyReturn) {
        this.moneyCondition = Double.parseDouble(moneyCondition);
        this.moneyReturn = Double.parseDouble(moneyReturn);
    }

    @Override
    public double acceptCash(double money) {
        double result = money;
        if (money >= moneyCondition)
            result = money - Math.floor(money / moneyCondition) * moneyReturn;  /* Math.floor() 向下取整 */
        return result;
    }
}
