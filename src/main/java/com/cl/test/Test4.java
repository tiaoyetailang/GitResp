package com.cl.test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class Test4 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
//        FileReader reader;
//
//        try {
//             reader = new FileReader("src/main/resources/123");
//            char arr[]=new char[10];
//             int s;
//           if(( s=reader.read(arr))!=-1){
//               System.out.println(new String(arr,0,s));
//           }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        FutureTask<Integer> future = new FutureTask<>(new Callb());
      new Thread(future).start();
        System.out.println(123);
        System.out.println(future.get());
        System.out.println(6666);


    }
}


class  Callb implements Callable<Integer>{

    @Override
    public Integer call() throws Exception {
        return 1;
    }
}
