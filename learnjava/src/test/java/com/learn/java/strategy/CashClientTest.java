package com.learn.java.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @Author: Lishuai
 * @Date: Created on 2018/9/18
 */
public class CashClientTest {

    @Test
    public void cashTest() {
        double total = 0;
        CashContext cashContext = new CashContext("return");
        total = cashContext.getResult(2000);
        assertEquals(total, 1400);
    }


}