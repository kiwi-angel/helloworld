package cn.edu.ruc.info.learnclass;

/**
 * @Author: Lishuai
 * @Date: Created on 2018/10/18
 */
public class ChildClass extends ParentClass{

    private Integer childFiled;

    private Boolean isChild = true;

    public ChildClass(){

        super();
    }

    public ChildClass(Integer parentFiled, Boolean isParent) {
        super(parentFiled, isParent);
        this.childFiled = parentFiled;
        this.isChild = isParent;
    }

    public void childMethod(){
        System.out.println("This is child class! ChildFiled " + childFiled);
        parentMethod();
    }

}
