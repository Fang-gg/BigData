package com.javaDemo.day16;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
*
 *  "aababcabcdabcde",获取字符串中每一个字母出现的次数要求结果:a(5)b(4)c(3)d(2)e(1)
 *      分析：
 *          1、定义一个字符串（可以改进用键盘录入）
 *          2、定义一个TreeMap
 *              键：Character
 *              值：Integer
 *          3、将字符串转换成字符数组
 *          4、遍历字符数组，得到每一个字符
 *          5、拿到字符作为键去集合中找值，看返回值
 *              是null,说明该字符没有作为键存在，就把该字符作为键，value设置为1
 *              不是null,说明该键存在，把value值加1，然后重新写回集合
 *          6、定义一个StringBuilder作为拼接
 *          7、遍历集合，得到键和值，按照a(5)b(4)c(3)d(2)e(1)要求拼接
 *          8、把StringBuilder转换成String输出
 *    输入：aababcabcdabcde
 *     输出：a(5)b(4)c(3)d(2)e(1)
 */
public class Test1 {
    public static void main(String[] args){
        //1.定义一个字符串
        String s = "aababcabcdabcde";
        //2.定义一个TreeMap
        TreeMap<Character, Integer> map = new TreeMap<Character,Integer>();
        //3.将字符串转化成字符数组
        char[] c = s.toCharArray();
        //4.遍历字符数组，得到每一个字符
        for(char c1 : c){
//            System.out.println(c1);
            //拿到字符作为键去集合中找值，看返回值
            Integer i = map.get(c1);

            if(i == null){
                map.put(c1,1);
            }else{
                i++;
                map.put(c1,i);
            }
        }
        //5.定义一个StringBuilder作为拼接
        StringBuffer sb = new StringBuffer();
        //6.遍历集合，得到键和值，按照a(5)b(4)c(3)d(2)e(1)要求拼接
        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        for(Map.Entry<Character,Integer> entry : entries){
            Character key = entry.getKey();
            Integer value = entry.getValue();
            sb.append(key).append("(").append(value).append(")");
        }
        String s1 = sb.toString();
        System.out.println(s1);
    }

}
