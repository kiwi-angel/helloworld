package com.learn.java.strategy.impl;

import com.learn.java.strategy.CashSuper;

/**
 * @Author: Lishuai
 * @Date: Created on 2018/9/18
 */
public class CashNormal implements CashSuper {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
