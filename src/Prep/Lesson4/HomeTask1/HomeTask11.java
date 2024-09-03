package Prep.Lesson4.HomeTask1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HomeTask11 {
    public static void main(String args[]) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 25));
        employees.add(new Employee("Alice", 30));
        employees.add(new Employee("Bob", 22));


        Collections.sort(employees, new DescendingNameComparator());

        for (Employee employee : employees) {
            System.out.println(employee);
        }
        withLambda();
    }

    private static void withLambda() {

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 25));
        employees.add(new Employee("Alice", 30));
        employees.add(new Employee("Bob", 22));

        Collections.sort(employees, (e1, e2) -> e2.getName().compareTo(e1.getName()));

        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }


}
