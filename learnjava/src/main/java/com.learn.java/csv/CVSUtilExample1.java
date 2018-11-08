package com.learn.java.csv;

import java.io.FileWriter;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Author: Lishuai
 * @Date: Created on 2018/6/22
 */
public class CVSUtilExample1 {

    public static void main(String[] args) throws Exception {

        String csvFile = "C:\\Users\\Li Shuai\\Desktop\\developer1.csv";
        FileWriter writer = new FileWriter(csvFile);

        List<Developer> developers = Arrays.asList(
                new Developer("mkyong", new BigDecimal(120500), 32),
                new Developer("zilap", new BigDecimal(150099), 5),
                new Developer("ultraman", new BigDecimal(99999), 99)
        );

        //for header
        CSVUtil.writeLine(writer, Arrays.asList("Name", "Salary", "Age"));

        for (Developer d : developers) {

            List<String> list = new ArrayList<>();
            list.add(d.getName());
            list.add(d.getSalary().toString());
            list.add(String.valueOf(d.getAge()));

            CSVUtil.writeLine(writer, list);

            //try custom separator and quote.
            //CSVUtils.writeLine(writer, list, '|', '\"');
        }

        writer.flush();
        writer.close();

    }
}
