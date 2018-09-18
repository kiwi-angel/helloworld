package cn.edu.ruc.info.factory;

/**
 * @Author: Lishuai
 * @Date: Created on 2018/9/18
 */
public class OperationMultiplication extends Operation {

    @Override
    public double getResult(){
        return getNumber_A() * getNumber_B();
    }
}
