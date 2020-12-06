package com.cl.test;

public class Tset {
   public  static  volatile   int   a=0;
      static volatile  boolean   flag=true;

    public static void main(String[] args) throws Exception {
        Acount acount = new Acount();



        new Thread(new Man(acount),"妈妈").start();



    }


}


class Acount{
   volatile int count=0;


//    public synchronized void  dpost(int money){
//        count+=money;
//        try {
//            Thread.sleep(100);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        System.out.println(Thread.currentThread().getName()+"余额"+count);
//
//    }


    public   void shengchan(){

        if(count<20){
            ++count;
            System.out.println("生产第"+count +"个");

        }
    }


public   void xiaofei(){
        if(count>0){

            System.out.println("消费第"+count+"个");
            count--;

        }
}


}
class Person implements Runnable{
     public Person(Acount acount){
         this.acount=acount;
     }

    Acount acount;


    public void run(){
        while (true){
            acount.shengchan();
        }


    }

}

class Man implements Runnable{
    public Man(Acount acount){
        this.acount=acount;
    }

    Acount acount;


    public void run(){
        while (true){
            acount.xiaofei();
        }


    }

}


