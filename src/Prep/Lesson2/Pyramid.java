package Prep.Lesson2;

import java.util.Scanner;

public class Pyramid {

    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of rows for the pyramid :");
    int rows=scanner.nextInt();
    printPyramid(rows);

    System.out.println("Using While loop");
        printPyramidWhile(rows);

    }

    private static void printPyramidWhile(int rows) {
        int i=0;
        int number=0;
        while(i<rows){
            int j=0;
            while(j<=i){
                System.out.print(number++ +"\t");

number++;
j++;
            }
            System.out.println();
            i++;
        }

    }

    private static void printPyramid(int rows) {
        int number=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<=i;j++){
                System.out.print(number++ +"\t");
            }
            System.out.println();
        }




    }


}
