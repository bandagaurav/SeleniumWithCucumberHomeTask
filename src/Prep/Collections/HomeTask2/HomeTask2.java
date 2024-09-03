package Prep.Collections.HomeTask2;

import java.util.Arrays;
import java.util.Scanner;

public class HomeTask2 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ;
        Player[] players = new Player[n];
        for (int i = 0; i < n; i++) {
            players[i] = new Player(scanner.next(), scanner.nextInt());
        }
scanner.close();
        Arrays.sort(players,new Checker());
        for(Player player:players){
            System.out.println(player.name+"  "+player.score);
        }

    }
}