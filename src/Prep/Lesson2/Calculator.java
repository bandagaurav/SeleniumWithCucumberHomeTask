package Prep.Lesson2;

import java.util.Scanner;

public class Calculator {
    public static void main(String args[]) {
        System.out.println("Please enter First Number: ");
        Scanner scanner=new Scanner(System.in);
        int firstNumber=scanner.nextInt();
        System.out.println("Please enter Second Number: ");
        scanner=new Scanner(System.in);
        int secondNumber=scanner.nextInt();
        System.out.println("Please enter Operation(+,-,*,/,% )");
         scanner=new Scanner(System.in);
        String operation=scanner.next();

        switch(operation){
            case "+":System.out.println("Addition of two numbers are :"+(firstNumber+secondNumber));
                       break;
            case "-":System.out.println("Subtraction of two numbers are :"+(firstNumber-secondNumber));
                break;
            case "*":System.out.println("Multiplication of two numbers are :"+(firstNumber*secondNumber));
                break;
            case "/":System.out.println("Division of two numbers are :"+(firstNumber/secondNumber));
                break;
            case "%":System.out.println("Remainder of two numbers are :"+(firstNumber%secondNumber));
                break;
        }



    }
    }
