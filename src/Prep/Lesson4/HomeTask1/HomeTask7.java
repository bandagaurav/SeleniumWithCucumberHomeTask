package Prep.Lesson4.HomeTask1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class HomeTask7 {

    public static void main(String args[]) {
sortTreeSet();
        sortTreeSetwithLambda();

    }

    private static void sortTreeSetwithLambda() {
        TreeSet<Integer> set=new TreeSet<>((n1,n2)->(n2-n1));
        set.add(33);
        set.add(99);
        set.add(100);
        set.add(22);
        System.out.println("Set in reverse order"+set);
    }

    private static void sortTreeSet() {

        TreeSet<Integer> set=new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        set.add(33);
        set.add(99);
        set.add(100);
        set.add(22);
System.out.println("Set in reverse order"+set);


    }
}
