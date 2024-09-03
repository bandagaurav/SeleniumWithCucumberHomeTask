package Prep.Lesson2.Task5;

import java.util.Scanner;

public class GreatNumber {
    public static void main(String args[]) {
        System.out.println("Please enter First Number: ");
        Scanner scanner = new Scanner(System.in);
        int num1=scanner.nextInt();
        System.out.println("Please enter Second Number ");
        scanner = new Scanner(System.in);
        int num2=scanner.nextInt();
        System.out.println("Is Great Number "+isGreatNumber(num1,num2));
    }

    private static boolean isGreatNumber(int num1, int num2) {
        if(num1==6 || num2==6){
            return true;
        }else if(num1+num2==6){
            return true;
        }else if(num1-num2==6){
            return true;
        }


        return false;
    }
}
