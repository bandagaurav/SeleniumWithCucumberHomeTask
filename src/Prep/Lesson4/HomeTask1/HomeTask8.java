package Prep.Lesson4.HomeTask1;

import java.util.Comparator;
import java.util.TreeSet;

public class HomeTask8 {
    public static void main(String args[]) {
sortByName();
        sortByNameUsingLambda();

    }

    private static void sortByNameUsingLambda() {
        TreeSet<Employee> set=new TreeSet<>((e1,e2) -> e1.getName().compareTo(e2.getName()));
        set.add(new Employee("Alice",77));
        set.add(new Employee("Bob",22));
        set.add(new Employee("Gaurav",44));
        set.add(new Employee("Saurav",33));
        System.out.println(set);


    }

    private static void sortByName() {
        TreeSet<Employee> set=new TreeSet<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        set.add(new Employee("John",11));
        set.add(new Employee("Alice",77));
        set.add(new Employee("Bob",22));
        set.add(new Employee("Gaurav",44));
        set.add(new Employee("Saurav",33));
        System.out.println(set);




    }
}
