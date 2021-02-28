package com.company;

public class Main {

    public static void main(String[] args) {
//        int[] a;
//        a = new int[5];
//
//        a[0]= 1;  //下标0，代表数组里的第一个数
//        a[1]= 2;
//        a[2]= 3;
//        a[3]= 4;
//        a[4]= 5;

//        int[] a= new int[5];
//        a[0]= 1;  //下标0，代表数组里的第一个数
//        a[1]= 2;
//        a[2]= 3;
//        a[3]= 4;
//        a[4]= 5;
//
//        System.out.println(a.length); //打印数组的长度
//
//      System.out.println(a[0]);
        int[] a = new int[5];
        a[0] = (int) (Math.random() * 100);
        a[1] = (int) (Math.random() * 100);
        a[2] = (int) (Math.random() * 100);
        a[3] = (int) (Math.random() * 100);
        a[4] = (int) (Math.random() * 100);

        System.out.println("数组中的各个随机数是:");

     int min = 101;
        for (int i = 0; i < a.length; i++) {

            System.out.println("数组中第"+(i+1)+"个随机数是:"+a[i]);
              if(a[i]<min){
                  min=a[i];

              }

    }
        System.out.println("本练习的目的是，找出最小的一个值: "+min);
}
}
