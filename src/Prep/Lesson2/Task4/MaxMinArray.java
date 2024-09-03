package Prep.Lesson2.Task4;

import java.util.Arrays;

public class MaxMinArray {
    public static void main(String args[]) {

        int arr[] = {2, 3, 7, 8, 9, 44, 22, 33, 66, 55, 56, 57, 98, 99, 100};
        Arrays.sort(arr);
        System.out.println("Maximum Numer is "+arr[arr.length-1]);
        System.out.println("Minimum Numer is "+arr[0]);

    }

}
