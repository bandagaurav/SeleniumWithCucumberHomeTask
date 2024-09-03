package Prep.Lesson2.Task5;

import java.util.Scanner;

public class CaughtSpeeding {
    public static void main(String args[]) {
        System.out.println("Please enter Speed: ");
        Scanner scanner = new Scanner(System.in);
        int speed=scanner.nextInt();
        System.out.println("Please enter Whether your Birthday or not: ");
        scanner = new Scanner(System.in);
        boolean isBirthday=scanner.nextBoolean();
        System.out.println(caughtSpeeding(68,true));
    }

    public static int caughtSpeeding(int speed, boolean isBirthday) {
        if(!isBirthday){
            if(speed<=60){
                return 0;
            }else if(speed>=61 && speed<=80){
                return 1;
            }else if(speed>=81){
                return 2;
            }
        }else{
            speed=speed+5;
            if(speed<=60){
                return 0;
            }else if(speed>=61 && speed<=80){
                return 1;
            }else if(speed>=81){
                return 2;
            }
        }

        return 0;
    }

}
