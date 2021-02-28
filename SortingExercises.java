package com.company;

public class SortingExercises {

    public static void main(String []ages){
        int array[]= new int [5];

        for (int i =0;i<5;i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i]+" ");
        }
//for (int j =0;j< array.length;j++){
//            for (int i = j;i<array.length;i++) {
//                if (array[i] < array[j]) {
//                    int temp = array[i];
//                    array[i] = array[j];
//                    array[j] = temp;

          for(int j =0;j<array.length-1;j++) {
              for (int i = j+1; i < array.length; i++) {
                  if (array[i] < array[j]) {
                      int temp = array[j];
                      array[j] = array[i];
                      array[i]= temp;
                  }
              }
          }

         System.out.println();
        for (int i = 0;i<array.length;i++){
            System.out.print(array[i]+" ");

        }

    }
}
