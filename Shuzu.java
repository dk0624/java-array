package com.company;

public class Shuzu {
    public static void main(String []ages){
        int [] a = new int[5];
        a[0]=(int)(Math.random()*100);
        a[1]=(int)(Math.random()*100);
        a[2]=(int)(Math.random()*100);
        a[3]=(int)(Math.random()*100);
        a[4]=(int)(Math.random()*100);

        for(int i=1;i<=5;i++){

            System.out.println("第"+i+"个数是"+a[i-1]);
        }

            }

        }



