package cn.edu.ruc.info.learnclass;

/**
 * @Author: Lishuai
 * @Date: Created on 2018/10/18
 */
public class ParentClass {

    private Integer parentFiled;

    private Boolean isParent = true;

    public ParentClass(){
        System.out.println("this is ParentClass!");
    }

    public ParentClass(Integer parentFiled, Boolean isParent){
        this.isParent = isParent;
        this.parentFiled = parentFiled;
    }

    public void parentMethod(){
        System.out.println("This is parent Class! parentFiled = " + parentFiled );
    }
}
