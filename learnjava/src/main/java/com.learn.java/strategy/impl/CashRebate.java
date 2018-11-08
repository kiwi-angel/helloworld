package com.learn.java.strategy.impl;

import com.learn.java.strategy.CashSuper;

/**
 * @Author: Lishuai
 * @Date: Created on 2018/9/18
 */
public class CashRebate implements CashSuper {

    private double moneyRebate = 1;

    public CashRebate(String moneyRebate){
        this.moneyRebate = Double.parseDouble(moneyRebate);
    }

    @Override
    public double acceptCash(double money) {
        return money * moneyRebate;
    }
}
