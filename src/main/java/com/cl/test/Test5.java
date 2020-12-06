package com.cl.test;

import java.util.Scanner;

public class Test5 {
  static   StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
          fun(400);
        System.out.println(sb);


    }

   public static  void fun(int a){
       while(true){
           for(int i=2;i<=a/2;i++){
               if(a%i==0){
                   break;
               }
               if(i==a/2){
                   sb.append(a);
               }

           }
           break;
       }


    for(int i=2;i<a/2;i++){

        if(a%i==0){
            sb.append(i);

            fun(a/i);
            break;

        }


}




   }



}
