package com.company;

public class For1 {
    public static void main(String []ages){
        int i,n=10,s=0;
        for ( i = 1 ;i<=n;i++){
            s = s+i;

        }System.out.println("sum=1+2+....+10="+s);

        System.out.print("Sum=");
         s = 0;
        for(i=n;i>=1;i--){

         s = s + i ;
            System.out.print(i+"+");
        }
        System.out.println(i+"="+s);

    }
}
