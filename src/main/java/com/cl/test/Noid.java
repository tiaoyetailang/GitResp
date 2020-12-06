package com.cl.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Noid implements Comparable<Noid>{
    int num;

    public Noid(int num) {
        this.num = num;
    }

    @Override
    public int compareTo(Noid o) {
         return this.num-o.num;

    }

    @Override
    public String toString() {
        return "Noid{" +
                "num=" + num +
                '}';
    }
}


class Test{

    public static void main(String[] args) {
        ArrayList<Noid> noids = new ArrayList<>();
        for(int i=0;i<10;i++){
            noids.add(new Noid(i));
        }
        noids.add(new Noid(-1));
        Collections.sort(noids, new Comparator<Noid>() {
            @Override
            public int compare(Noid o1, Noid o2) {
                return o2.num-o1.num;
            }
        });
        for(Noid n:noids){
            System.out.print(n.num+":");
        }
    }



}
