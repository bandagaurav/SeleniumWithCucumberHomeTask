package Prep.Lesson4.HomeTask1;

import java.util.Comparator;

class DescendingNameComparator implements Comparator<Employee> {
    public int compare(Employee e1, Employee e2) {
        return e2.getName().compareTo(e1.getName());
    }}