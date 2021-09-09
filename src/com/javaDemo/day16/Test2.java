package com.javaDemo.day16;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeMap;

public class Test2 {
    public static void main(String[] args){
        HashMap<String, String> map = new HashMap<String,String>();
        map.put("张三","张三1");
        map.put("张三11","张三111");
        map.put("张三22","张三222");
        map.put("张三33","张三333");
        map.put("张三44","张三444");
        System.out.println(map.get("张三"));
        System.out.println(map.get("李四"));

        System.out.println(map);
        Set<String> s1 = map.keySet();
        for(String s2 : s1){
            System.out.println(s2);

        }

        Collection<String> values = map.values();
        for(String v : values){
            System.out.println(v);
        }

        Set<String> strings = map.keySet();
        for(String s3 : strings){
            String s = map.get(s3);
            System.out.println(s3 + "---" + s);
        }


    }
}
