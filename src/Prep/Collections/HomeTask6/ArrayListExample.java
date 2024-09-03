package Prep.Collections.HomeTask6;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String args[]){

        ArrayList<String> list=new ArrayList<>();
        list.add("Apple");
        list.add("Cat");
        list.add("Fish");
        list.add("rain");

        list.sort(Collections.reverseOrder());
        for(String str:list){
            System.out.println(str);
        }


    }
}
