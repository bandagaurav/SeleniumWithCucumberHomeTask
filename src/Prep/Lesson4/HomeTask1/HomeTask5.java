package Prep.Lesson4.HomeTask1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HomeTask5 {
    public static void main(String args[]) {
    sortWithoutLambda();
        sortWithLambda();



    }

    private static void sortWithLambda() {
        List<Integer> list= Arrays.asList(22,88,99,44,55,76);

list.sort(Comparator.reverseOrder());
        System.out.println("Sorted list in reverse order is"+list);



    }

    private static void sortWithoutLambda() {
        List<Integer> list= Arrays.asList(22,88,99,44,55,76);
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });
        System.out.println("Sorted list in reverse order is"+list);
    }
}
