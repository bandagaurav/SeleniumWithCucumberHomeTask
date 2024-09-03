package Prep.Collections.HomeTask6;

import java.util.*;

public class HashMapExample {
    public static void main(String args[]) {

HashMap<String,Integer> map=new HashMap<>();
map.put("Gaurav",11);
map.put("Saurav",22);
map.put("Rajesh",33);
map.put("Twinkle",88);

        List<Map.Entry<String,Integer>> list=new ArrayList<>(map.entrySet());

        list.sort(Map.Entry.comparingByKey(Collections.reverseOrder()));

        System.out.println(list);

    }
    }
