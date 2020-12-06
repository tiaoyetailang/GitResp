package com.cl.test;


import java.util.ArrayList;
import java.util.Comparator;

public class TTTEEE implements  Runnable {

    boolean a = true;

    public void add() {
        synchronized (TTTEEE.class) {
            System.out.println(123);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (this) {
                System.out.println(456);
            }
        }

    }

    public void show() {
        synchronized (this) {
            System.out.println(567);
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (TTTEEE.class) {
                System.out.println(678);
            }
        }

    }


    public static void main(String[] args) {
      TTTEEE t=  new TTTEEE();
        new Thread(t).start();
        new Thread(t).start();
    }




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TTTEEE ttteee = (TTTEEE) o;

        return a == ttteee.a;
    }


    @Override
    public void run() {
        if (a) {
            a=false;
            add();

        }

        show();





    }



}