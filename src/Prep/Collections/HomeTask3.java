package Prep.Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HomeTask3 {
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        Map<String,String> map=new HashMap<>();

        int entry=Integer.parseInt(scanner.nextLine());
        for(int i=0;i<entry;i++){

            String name=scanner.nextLine().trim();
            String phoneNumber=scanner.nextLine().trim();
            map.put(name,phoneNumber);
        }

        while(scanner.hasNextLine()){
            String query=scanner.nextLine().trim();
            if (map.containsKey(query)) {

                System.out.println(query+" = "+map.get(query));
            }else{
                System.out.println("Not Found");
            }

        }

scanner.close();

    }
}
