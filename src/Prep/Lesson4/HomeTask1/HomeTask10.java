package Prep.Lesson4.HomeTask1;

import java.util.Map;
import java.util.TreeMap;

public class HomeTask10 {
    public static void main(String args[]) {
sortByNameTreeMap();
sortByNameTreeMapwithLambda();

    }

    private static void sortByNameTreeMapwithLambda() {
        TreeMap<Employee1, Integer> treeMap = new TreeMap<>((e1, e2) -> e2.getName().compareTo(e1.getName()));

        treeMap.put(new Employee1("John", 25), 1);
        treeMap.put(new Employee1("Alice", 30), 2);
        treeMap.put(new Employee1("Bob", 22), 3);

        for (Map.Entry<Employee1, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }

    private static void sortByNameTreeMap() {
        TreeMap<Employee1, Integer> treeMap = new TreeMap<>();

        treeMap.put(new Employee1("John", 25), 1);
        treeMap.put(new Employee1("Alice", 30), 2);
        treeMap.put(new Employee1("Bob", 22), 3);

        for (Map.Entry<Employee1, Integer> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
