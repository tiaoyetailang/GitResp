package com.cl.test;

public class DTest {
    public static void main(String[] args) {

        for (int i = 0; i <=100; i++) {
            for (int j = 0; j <= 100; j++) {
                for (int k = 0; k <=100; k++) {
                    if((i+j+k==100)) {
                        if (k % 3 == 0) {
                            if (i * 5 + j * 3 + k / 3 == 100)
                                System.out.println("大鸡为:"+i + " " +"小鸡为:"+ j + " "+"小小鸡为:" + k);
                        }
                    }
                }
            }
        }


    }
}
