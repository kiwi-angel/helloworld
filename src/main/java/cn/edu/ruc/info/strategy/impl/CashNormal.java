package cn.edu.ruc.info.strategy.impl;

import cn.edu.ruc.info.strategy.CashSuper;

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
