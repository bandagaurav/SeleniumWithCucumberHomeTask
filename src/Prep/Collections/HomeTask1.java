package Prep.Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class HomeTask1 {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int line= scanner.nextInt();
        ArrayList<ArrayList<Integer>> list=new ArrayList<>();
        for(int i=0;i<line;i++){
            int inte= scanner.nextInt();
            ArrayList<Integer> lines=new ArrayList<>();
            for(int j=0;j<inte;j++){
                lines.add(scanner.nextInt());
            }
            list.add(lines);
        }

        int queries= scanner.nextInt();
        for(int i=0;i<queries;i++){
            int x= scanner.nextInt();
            int y=scanner.nextInt();

            if(x<= list.size() && y<=list.get(x-1).size()){

                System.out.println(list.get(x-1).get(y-1));
            }else{
                System.out.println("ERROR!");
            }



        }

        scanner.close();

    }





}
