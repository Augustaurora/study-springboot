package com.aurocal.test;

import java.util.*;

public class Test {

    public static void main(String [] args){
        Hashtable<String,String> hashtable=new Hashtable<String, String>( );
        hashtable.put("1","aa");
        hashtable.put("2","bb");
        hashtable.put("3","cc");
        //第一种遍历
        System.out.println("第一种遍历方式");
        for (Iterator<String> iterator=hashtable.keySet().iterator();((Iterator) iterator).hasNext();) {
            String key=iterator.next();
            System.out.print("key>>>>>>:"+key);
            System.out.println(",value>>>>>>:"+hashtable.get(key));
        }
        //第二种遍历
        System.out.println("第二种遍历方式");
        for (Iterator<Map.Entry<String,String>> iterator = hashtable.entrySet().iterator(); ((Iterator) iterator).hasNext();) {
           Map.Entry<String,String> entry=iterator.next();
            System.out.print("key>>>>>>:"+entry.getKey());
            System.out.println(",value>>>>>>:"+entry.getValue());
        }
        //第三种遍历
        System.out.println("第三种遍历方式");
        for (Map.Entry<String,String> entry: hashtable.entrySet()) {

            System.out.print("key>>>>>>:"+entry.getKey());
            System.out.println(",value>>>>>>:"+entry.getValue());
        }
        //第四种遍历
        System.out.println("第四种遍历方式");
        Enumeration<String> e=hashtable.keys();
        while (e.hasMoreElements()){
            String key=e.nextElement();
            System.out.print("key>>>>:"+key);
            System.out.println(",value>>>>:"+hashtable.get(key));
        }
        //第五种遍历
        System.out.println("第五种遍历方式");
        Enumeration<String> e2=hashtable.keys();
        while (e2.hasMoreElements()){
            String key=e2.nextElement();
            System.out.print("string>>>>:"+key);
            System.out.println(",value>>>>:"+hashtable.get(key));
        }





    }

}
