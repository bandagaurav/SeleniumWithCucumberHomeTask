package Prep.Collections.HomeTask6;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String args[]) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(4);
        list.add(4);
        list.add(100);
        list.add(100);
        list.add(65);
        list.add(65);

        System.out.println(removeDuplicates(list));

    }

    private static LinkedList removeDuplicates(LinkedList<Integer> list) {
        Set<Integer> set=new TreeSet<>();
        set.addAll(list);
        list.clear();
        list.addAll(set);
        return list;

    }

}
