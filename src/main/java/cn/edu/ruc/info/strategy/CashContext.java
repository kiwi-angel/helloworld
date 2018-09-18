package cn.edu.ruc.info.strategy;

import cn.edu.ruc.info.strategy.impl.CashNormal;
import cn.edu.ruc.info.strategy.impl.CashRebate;
import cn.edu.ruc.info.strategy.impl.CashReturn;

/**
 * <h1>策略模式</h1>
 * 是一种定义一系列算法的方法，
 * 从概念上来看，所有这些算法完成的都是相同的工作，只是实现不同，
 * 它可以以相同的方式调用所有的算法，减少了各种算法类与使用算法类之间的耦合
 *
 * @Author: Lishuai
 * @Date: Created on 2018/9/18
 */
public class CashContext {

    private CashSuper cashSuper;

    public CashContext(CashSuper cashSuper) {
        this.cashSuper = cashSuper;
    }

    public CashContext(String type) {
        switch (type) {
            case "normal":
                cashSuper = new CashNormal();
                break;
            case "return":
                cashSuper = new CashReturn("300", "100");
                break;
            case "rebate":
                cashSuper = new CashRebate("0.8");
                break;
        }
    }

    public double getResult(double money) {
        return cashSuper.acceptCash(money);
    }
}
