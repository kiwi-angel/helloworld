package cn.edu.ruc.info.strategy.impl;

import cn.edu.ruc.info.strategy.CashSuper;

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
