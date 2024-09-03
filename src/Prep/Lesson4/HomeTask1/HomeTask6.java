package Prep.Lesson4.HomeTask1;

import java.util.*;

public class HomeTask6 {
    public static void main(String args[]) {
    isSortedwithoutLambda();
isSortedwithLambda();


    }

    private static void isSortedwithLambda() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 25));
        employees.add(new Employee("Alice", 30));
        employees.add(new Employee("Bob", 22));

        Collections.sort(employees, (e1, e2) -> e1.getName().compareTo(e2.getName()));

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    private static void isSortedwithoutLambda() {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 25));
        employees.add(new Employee("Alice", 30));
        employees.add(new Employee("Bob", 22));

        Collections.sort(employees, new NameComparator());

        for (Employee employee : employees) {
            System.out.println(employee);
        }

}
}
