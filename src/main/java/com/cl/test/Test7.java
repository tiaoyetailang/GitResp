package com.cl.test;

import java.util.concurrent.ForkJoinPool;

public class Test7 {
    public static void main(String[] args) {
        for (int i = 10; i<100000; i++) {
            if(Total(i)==true){
                System.out.println(i);
                return;
            }

        }




    }
    public  static  boolean Total(int k){
        return Total(5,k);

    }

    public  static  boolean Total(int i,int k){
                 if(i==0){
                     return true;
                 }else{
                        if(k%5==1){
                             k=k-k/5-2;
                            i--;
                         return    Total(i,k);
                        }else{
                           return false;
                        }

                 }


    }

    }


 class Dg {
    static int ts=0;//桃子总数
    int fs=1;//记录分的次数
    static int hs=5;//猴子数...
    int tsscope=5000;//桃子数的取值范围.太大容易溢出.
    public int fT(int t){
        if(t==tsscope){
//当桃子数到了最大的取值范围时取消递归
            System.out.println("结束");
            return 0;
        }
        else{
            if((t-1)%hs==0 && fs <=hs){
                if(fs==hs)
                {
                    System.out.println("桃子数 = "+ts +" 时满足分桃条件");
                }
                fs+=1;
                return fT((t-1)/5*4);// 返回猴子拿走一份后的剩下的总数
            }
            else
            {
//没满足条件
                fs=1;//分的次数重置为1
                return fT(ts+=1);//桃子数加+1
            }
        }
    }
    public static void main(String[] args) {
        new Dg().fT(0);
    }

}

