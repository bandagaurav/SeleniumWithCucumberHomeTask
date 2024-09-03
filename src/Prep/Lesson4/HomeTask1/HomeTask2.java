package Prep.Lesson4.HomeTask1;

import java.util.*;

public class HomeTask2 {
    public static void main(String args[]) {
    int[] numbers={22,99,55,88,12,65};
        Arrays.sort(numbers);
        System.out.println("Second Highest Number is "+numbers[numbers.length-2]);
        List<Integer> list=Arrays.asList(20,40,60,100,88,44);
        Optional<Integer> optional=findSecondHighest(list);
System.out.println("Second Highest Number is"+optional.get());
    }

    private static Optional<Integer> findSecondHighest(List<Integer> list) {
        return list.stream().distinct().sorted(Comparator.reverseOrder())
                .skip(1).findFirst();


    }
}
