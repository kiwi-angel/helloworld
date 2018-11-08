package com.learn.java.filetest;

import java.io.*;
import java.util.Date;

/**
 * @Author: Lishuai
 * @Date: Created on 2018/5/2
 */
public class FileTest {

    public void generateFile() throws IOException {
        String filePath = "C:\\Users\\Li Shuai\\Desktop\\test\\testfile";
        File newFile = new File(filePath);
        if (newFile.exists()){
            System.out.println("file exist.");
            File newFile1 = new File(filePath + System.currentTimeMillis());
            newFile1.createNewFile();
            FileCopy.copyFile(newFile.getPath(), newFile1.getPath());
            System.out.println("file create.");
        } else {
            System.out.println("file not exist.");
            newFile.createNewFile();
        }
    }


    public static void main(String [] argv){
        FileTest ft = new FileTest();
        try {
            ft.generateFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
