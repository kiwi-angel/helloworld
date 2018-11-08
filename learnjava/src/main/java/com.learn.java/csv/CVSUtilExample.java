package com.learn.java.csv;

import java.io.FileWriter;
import java.util.Arrays;

/**
 * @Author: Lishuai
 * @Date: Created on 2018/6/22
 */
public class CVSUtilExample {

    public static void main(String[] args) throws Exception {

        String csvFile = "C:\\Users\\Li Shuai\\Desktop\\hello.csv";
        FileWriter writer = new FileWriter(csvFile);

        CSVUtil.writeLine(writer, Arrays.asList("a", "b", "c", "d"));

        //custom separator + quote
        CSVUtil.writeLine(writer, Arrays.asList("aaa", "bb,b", "cc,c"), ',', '"');

        //custom separator + quote
        CSVUtil.writeLine(writer, Arrays.asList("aaa", "bbb", "cc,c"), '|', '\'');

        //double-quotes
        CSVUtil.writeLine(writer, Arrays.asList("aaa", "bbb", "cc\"c"));


        writer.flush();
        writer.close();

    }
}
