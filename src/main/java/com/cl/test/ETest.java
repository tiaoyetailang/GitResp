package com.cl.test;

import java.util.HashSet;

public class ETest {
    public static void main(String[] args) {
        //System.out.println("20个月后总数为:"+fun(20));
        int i=1;
        i=i++;
        System.out.println(i);

    }

    public static  int fun(int a){
        if(a<3){
            return 2;
        }
     return   fun(a-3)*2;


    }
}
