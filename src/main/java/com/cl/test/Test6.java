package com.cl.test;

public class Test6 {
    public static void main(String[] args) {
        System.out.println(maxYueshu(12, 15));
        String s = new String();

    }

    public static int maxYueshu(int a, int b) {
    int k;
          if(b%a==0||a%b==0){
              if(a<b){
                  return a;
              }else{
                  return b;
              }
          }

          if(b<a){
              k=b;
          }else {
              k=a;
          }



            for (int i = k / 2; i > 1; i--) {
                if (a % i == 0 && b % i == 0) {
                    return i;
                }
            }



        return 0;
    }


    public static int maxGyu(int a, int b) {
        int k;



        if (a % b == 0 || b % a == 0) {
            if (a < b) {
                return b;
            } else {
                return a;
            }
        }

        if(a<b){
            k=b;
        }else{
            k=a;
        }


            for (int i = k * 2; ; i++) {
                if (i % b == 0 && i % a == 0) {
                    return i;

                }
            }

        }


    }

