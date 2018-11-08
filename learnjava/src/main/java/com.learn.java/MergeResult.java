package com.learn.java;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Lishuai
 * @Date: Created on 2018/3/10
 */
public class MergeResult {
    public static void main(String[] args){
        List<News> layout = new ArrayList<News>();
        for (int i = 0; i < 3; i ++){
            layout.add(new News(i, i + 2, "layout"));
        }
        for (int i =0; i < layout.size(); i ++)
            layout.get(i).print();
        System.out.println("*************");

        List<News> contents = new ArrayList<News>();
        for (int i = 0; i < 6; i ++){
            contents.add(new News(i, 0, "contents"));
        }
        for (int i =0; i < contents.size(); i ++)
            contents.get(i).print();
        System.out.println("*************");;

        for (News i : merge1(layout, contents)){
            i.print();
        }
        System.out.println("*************");
    }

    static class News {
        int id;
        int order;
        String name;

        News(int id, int order, String name) {
            this.id = id;
            this.order = order;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public int getOrder() {
            return order;
        }

        public void setOrder(int order) {
            this.order = order;
        }

        public void print(){
            System.out.println( this.name +" ( "+ this.getId() + ", " + this.getOrder() + " )");
        }
    }

    public static List<News> merge(List<News> layout, List<News> contents){
        if(layout == null)
            return contents;
        else{
            if(contents == null || contents.size() == 0)
                return layout;
            else{
                List<News> mergeResult = new ArrayList<News>();
                for(int i = 0; i < layout.size(); i ++) {
                    for (int j = i; j < contents.size(); j++) {
                        News r = layout.get(i);
                        if(r.getOrder() == j) {
                            mergeResult.add(r);
                            break;
                        } else {
                            mergeResult.add(contents.get(j));
                        }
                    }
                }
                return mergeResult;
            }
        }
    }
    public static List<News> merge1(List<News> layout, List<News> contents){
        if(layout == null)
            return contents;
        else{
            if(contents == null || contents.size() == 0)
                return layout;
            else{
                List<News> mergeResult = new ArrayList<News>();
                int l = 0;
                int c = 0;
                for (int k = 0; k < (layout.size() + contents.size()); k ++){
                    if (l < layout.size() && layout.get(l).getOrder() == k){
                        mergeResult.add(layout.get(l));
                        l ++;
                    } else {
                        mergeResult.add(contents.get(c));
                        c ++;
                    }
                }
               return mergeResult;
            }
        }
    }

}
