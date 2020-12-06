package com.cl.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class CTest {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
             haha(new BB());

    }

    public static  void haha(AA a){
       a.run();
    }

    }


class AA{
   static int a;
    public AA() {
    }

    public void run(){
        System.out.println("AA");


    }

    public void show(){

    }


}

class BB extends AA{
    @Override
    public void run() {
        System.out.println("BB");
        int i = this.hashCode();
        System.out.println(i);
    }
}


abstract class CC{
    public CC() {
    }

    public abstract  void run();



}