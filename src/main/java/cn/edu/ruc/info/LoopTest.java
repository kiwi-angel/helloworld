package cn.edu.ruc.info;

/**
 * @Author: Lishuai
 * @Date: Created on 2018/5/3
 */
public class LoopTest {

    public void BreakLoop(){
        for (int i = 0; i < 10; i ++){
            if (i == 5) break;
            System.out.println(i);
        }
    }

    public void ContinueLoop(){
        for (int i = 0; i < 10; i ++){
            if (i == 6) continue;
            System.out.println(i);
        }
    }

    public static void main(String[] argv){
        LoopTest l = new LoopTest();

        System.out.println("Break");
        l.BreakLoop();

        System.out.println("Continue");
        l.ContinueLoop();
    }
}
