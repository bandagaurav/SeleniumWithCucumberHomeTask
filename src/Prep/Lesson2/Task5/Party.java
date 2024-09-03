package Prep.Lesson2.Task5;

import java.util.Scanner;

public class Party {
    public static void main(String args[]) {
        System.out.println("Please enter Tea: ");
        Scanner scanner = new Scanner(System.in);
        int tea=scanner.nextInt();
        System.out.println("Please enter Candy: ");
        scanner = new Scanner(System.in);
        int candy=scanner.nextInt();
        int outcome=partyOutcome(tea,candy);
        switch (outcome){
            case 0: System.out.println("the party is always bad");
            break;
            case 1: System.out.println("A party is good");
                break;
            case 2: System.out.println("the party is great");
                break;

        }



    }

    private static int partyOutcome(int tea, int candy) {
        if(tea<5 || candy<5){
            return 0;
        } else if (tea>=candy *2 || candy>=tea*2 ) {
            return 2;
            
        }


        return 1;
    }
}
