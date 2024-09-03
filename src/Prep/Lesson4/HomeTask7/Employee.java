package Prep.Lesson4.HomeTask7;

public class Employee {
    String name;
    String account;
    Double salary;

    public Employee(String name, String account, Double salary) {
this.name=name;
this.account=account;
this.salary=salary;


    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", account='" + account + '\'' +
                ", salary='" + salary + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = Double.valueOf(salary);
    }


}
