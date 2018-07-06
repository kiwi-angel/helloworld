package cn.edu.ruc.info.proxy;

/**
 * @Author: Lishuai
 * @Date: Created on 2018/7/6
 */
public class RealImage implements Image {

    private String fileName;

    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    @Override
    public void display() {
        System.out.println("Displaying 2 " + fileName);
    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading 1 " + fileName);
    }
}
