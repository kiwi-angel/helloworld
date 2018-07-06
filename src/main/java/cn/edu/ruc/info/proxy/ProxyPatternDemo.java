package cn.edu.ruc.info.proxy;

/**
 * @Author: Lishuai
 * @Date: Created on 2018/7/6
 */
public class ProxyPatternDemo {

    public static void main(String[] args) {

        Image image = new ProxyImage("test_10mb.jpg");
        System.out.println("*****a*****");
        //图像将从磁盘加载
        image.display();
        System.out.println("***");

        //图像将无法从磁盘加载
        image.display();  // 两次调用display()函数得到的结果不同，是因为第一次时，realImage对象为空，需要加载，第二次调用时对象不为空，直接使用即可。

        System.out.println("*****b*****");

        Image image1 = new RealImage("testFile.jpg");
        System.out.println("***");
        image1.display();
        System.out.println("***");
        image1.display();


    }
}
