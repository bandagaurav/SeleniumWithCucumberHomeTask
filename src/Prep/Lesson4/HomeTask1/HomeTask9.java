package Prep.Lesson4.HomeTask1;

import java.util.*;

public class HomeTask9 {
    public static void main(String args[]) {
sortTreeMapinReverseOrder();
sortTreeMapinReverseOrderusingLambda();
    }

    private static void sortTreeMapinReverseOrderusingLambda() {
        TreeMap<Integer, String> treeMap = new TreeMap<>((a, b) -> b.compareTo(a));

        treeMap.put(1, "One");
        treeMap.put(3, "Three");
        treeMap.put(2, "Two");
        treeMap.put(4, "Four");
        treeMap.put(5, "Five");

        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }

}

    private static void sortTreeMapinReverseOrder() {

        TreeMap<Integer,Integer> map=new TreeMap<>();
        map.put(11,11);
        map.put(22,22);
        map.put(33,33);
        map.put(44,44);
        List<Map.Entry<Integer,Integer>> list=new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.comparingByValue(Collections.reverseOrder()));
        System.out.println(list);


    }
}
