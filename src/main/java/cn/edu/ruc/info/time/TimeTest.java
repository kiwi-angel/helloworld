package cn.edu.ruc.info.time;

/**
 * @Author: Lishuai
 * @Date: Created on 2018/8/1
 */
public class TimeTest {

    private Long lastUpdateTime = 0L;

    public static void main(String[] argv){
        Long lastUpdateTime = 0L;
        Long currentTime = System.currentTimeMillis();
        if (currentTime - 86400000 < lastUpdateTime){

        }
        System.out.println( currentTime - 86400000 );
        System.out.println( currentTime );
    }

    private void updateCatch(){
        Long currentTime = System.currentTimeMillis();
        if (currentTime - 86400000 > lastUpdateTime){  // 一天更新
            lastUpdateTime = currentTime;
            System.out.println( "update data!" );
        }
    }
}
