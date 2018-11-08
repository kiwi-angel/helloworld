package com.learn.java.paramatertransfer;

/**
 * @Author: Lishuai
 * @Date: Created on 2018/10/30
 */
public class PatameterTransfer {

    public void setParameters() {

        Integer tempPara = 222;
        ParameterBO parameterBO = new ParameterBO();
        parameterBO.setId(100);
        parameterBO.setName("hello");
        parameterBO.setCompany("world");

        transferParameters(tempPara, parameterBO);

        System.out.println(parameterBO.toString());
        System.out.println(tempPara);
    }

    private void transferParameters(Integer temp, ParameterBO parameterBO){
        parameterBO.setId(temp);
        temp = 300;
        System.out.println(temp);
    }

    public static void main(String[] argv){
        PatameterTransfer p = new PatameterTransfer();

        p.setParameters();

    }
}

