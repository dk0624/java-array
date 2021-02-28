package com.company;

import com.sun.org.apache.xerces.internal.xs.ItemPSVI;

public class Sort2 {
    public static void main(String []ages){
        int array[]= {18,62,68,82,65,9};

        for (int i = 0;i<array.length;i++){
            System.out.print(array[i]+"  ");
        }

               for(int j =0;j<array.length;j++){
                   for (int i = 0;i<array.length-j-1;i++){
                       if (array[i]>array[i+1]) {
                           int temp = array[i];
                           array[i] = array[i+1];
                           array[i+1]   =  temp ;
                       }
                   }
               }

        System.out.println();
        for (int i = 0;i<array.length;i++){
            System.out.print(array[i]+"  ");
        }

    }

}
