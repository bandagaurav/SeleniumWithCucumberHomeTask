package Prep.Lesson4.HomeTask1;

public class Employee1 implements Comparable<Employee1>{
    String name;
    int age;

    public Employee1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }




    @Override
    public int compareTo(Employee1 other) {
        return other.name.compareTo(this.name);
    }
}
