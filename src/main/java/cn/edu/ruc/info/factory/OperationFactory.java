package cn.edu.ruc.info.factory;

/**
 * @Author: Lishuai
 * @Date: Created on 2018/9/18
 */
public class OperationFactory {

    public static Operation createOperation(String operate) {
        Operation operation = null;
        switch (operate) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSubtraction();
                break;
            case "*":
                operation = new OperationMultiplication();
                break;
            case "/":
                operation = new OperationDivision();
                break;
        }
        return operation;
    }
}
