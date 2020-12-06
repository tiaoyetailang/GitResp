package com.cl.test;

public class ATEST {
    public static void main(String[] args) {
        int a=0,b=0,c=0;
        int arr[]=new int[]{1,4,2,5,7,8,10,11,5};
        sort(arr);
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0){
                 a++;
            }else if(arr[i]>0){
                b++;
            }else {
                c++;
            }
        }
        System.out.println("负数为"+a+";"+"正数为"+b+";"+"零为"+c);
    }


    public static  void sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for (int j = i; j<arr.length-i-1; j++) {
                if(arr[j+1]<=arr[j]){
                    int temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }

            }
        }
    }
}
