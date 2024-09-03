package Prep.Lesson2.Task4;

import java.util.HashSet;

public class MissingNumber {
    public static void main(String args[]) {
int arr[]={2,3,7,8,9,44,22,33,66,55,56,57,98,99,100};
printMissingNumber(arr);


    }

    private static void printMissingNumber(int[] arr) {
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i< arr.length;i++){
            set.add(arr[i]);
        }
        for (int j=1;j<=100;j++){
            if(!set.contains(j)){
                System.out.print(" "+j);
            }


        }


    }
}
