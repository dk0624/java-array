package com.company;

public class Sort {
    public static void main(String []ages){

        //段凯个人总结：该题思路：array[0]与array[i]所有的相比较；如果array[i]<array[0]，那么取一个中间值temp ，利用temp把array[i]和array[0]转换，这里看array[0]=18,array[4]=9
        // 所以array[0]通过temp转换成了9，所以array[0]=9,array[4]=18  以此类推只需要转换array[i]里i的值为0~~array.length，然后循环比较array[1]和array[i],array[2]和array[i]
        //array[3]和array[i]，array[4]和array[i]，array[5]和array[i]，因为该数组长度为6，所以只能循环到array[5]和array[i]
        // 把0~~5换成j,在外部套一个j循环，int j =0;j<array.length;j++,循环后再该层for循环外打印出来就行了

       int array[]= {18,62,68,82,65,9};

     //排序前，先打印出来，看看不排序是什么样的
       for (int i = 0;i<array.length;i++) {
           System.out.print(array[i] + "  ");
       }

        for (int j =0;j< array.length;j++){
            for (int i = j;i<array.length;i++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        System.out.println( );//换行
        //下面就是排序后打印出来，i的值不变一直是0~array.length，变的是j
            for (int i = 0;i<array.length;i++) {
                System.out.print(array[i] + "  ");
            }
        }
       }




