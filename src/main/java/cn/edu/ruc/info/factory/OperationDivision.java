package cn.edu.ruc.info.factory;

/**
 * @Author: Lishuai
 * @Date: Created on 2018/9/18
 */
public class OperationDivision extends Operation {

    @Override
    public double getResult() throws Exception {
        if (getNumber_B() == 0)
            throw new Exception("division number can not be 0!");
        else
            return getNumber_A() / getNumber_B();
    }
}
