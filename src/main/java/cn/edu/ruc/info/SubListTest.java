package cn.edu.ruc.info;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Lishuai
 * @Date: Created on 2018/9/26
 */
public class SubListTest {
    public static void main(String argv[]) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 25; i++) {
            numbers.add(i);
        }
        List<Integer> subList = numbers.subList(11, 19);

        for (Integer i : numbers)
            System.out.print(i + ", ");

        System.out.println();
        System.out.println("****");

        for (Integer i : subList)
            System.out.print(i + ", ");
    }
}
