package practice;

import java.util.Arrays;

public class ArrayDemo
{
    public static void main(String args[]) {

     int[] myIntArray1 = {100,600,800,700};
    // myIntArray1 = new int[10];

    /* myIntArray1[0] = 100;
     myIntArray1[1] = 400;*/

        //System.out.println("index o: " +  myIntArray1[0]);
        //System.out.println("index 1: " +  myIntArray1[1]);
        //System.out.println("index 2: " +  myIntArray1[2]);
        int len1 = myIntArray1.length;


        for(int i = 0 ; i < len1 ; i++){

            System.out.println("my array index"+ i + " " + myIntArray1[i]);

        }
        Arrays.sort(myIntArray1);
        for(int i = 0 ; i < len1 ; i++){

            System.out.println("my array index"+ i + " " + myIntArray1[i]);

        }

            String[] myStringArray = {"vaibhavi" , "kartik" , "mukesh" , "bhavna"};
        System.out.println("index 0: " +  myStringArray[2]);


    }
}
