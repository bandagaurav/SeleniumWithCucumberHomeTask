package Prep.Collections;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class HomeTask5 {
    public static void main(String args[]){

        Scanner scanner=new Scanner(System.in);
        int T= scanner.nextInt();
        scanner.nextLine();
        for(int i=0;i<T;i++){
            int Q= scanner.nextInt();
            scanner.nextLine();
            TreeMap<Integer,Integer> map=new TreeMap<>();
            StringBuilder result=new StringBuilder();
            String[] queries=scanner.nextLine().split(" ");
            int index=0;
            while(index< queries.length){

                char queryType=queries[index].charAt(0);
                switch (queryType){
                    case 'a':
                        int key=Integer.parseInt(queries[++index]);
                        int value=Integer.parseInt(queries[++index]);
                        map.put(key,value);
                        break;
                    case 'b':
                        int keyToPrint=Integer.parseInt(queries[++index]);
                        result.append(map.getOrDefault(keyToPrint,-1)).append(" ");
                        break;
                    case 'c':
                        result.append(map.size()).append(" ");
                        break;
                    case 'd':
                        int keyToRemove=Integer.parseInt(queries[++index]);
                        map.remove(keyToRemove);
                        break;
                    case 'e':
                        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
                            result.append(entry.getValue()).append(" ");
                        }break;

                }
            index++;
            }
            System.out.println(result.toString().trim());

        }
scanner.close();

    }
}
