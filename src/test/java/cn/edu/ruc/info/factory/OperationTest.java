package cn.edu.ruc.info.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @Author: Lishuai
 * @Date: Created on 2018/9/18
 */
class OperationTest {

    @Test
    public void getResultTest() throws Exception {
        Operation oper;
        oper = OperationFactory.createOperation("+");
        oper.setNumber_A(7.3);
        oper.setNumber_B(4.9);
        double result = oper.getResult();
        assertEquals(result, 12.2);
    }
}