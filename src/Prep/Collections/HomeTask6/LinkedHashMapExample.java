package Prep.Collections.HomeTask6;

import java.util.*;

public class LinkedHashMapExample {
    public static void main(String args[]) {

        LinkedHashMap<String,Integer> map=new LinkedHashMap<>();
        map.put("Gaurav",11);
        map.put("Saurav",22);
        map.put("Rajesh",33);
        map.put("Twinkle",88);

        List<Map.Entry<String,Integer>> list=new ArrayList<>(map.entrySet());


        System.out.println(list);

    }
}

