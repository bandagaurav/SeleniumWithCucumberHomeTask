package Prep.Lesson4.HomeTask7;

public class HomeTask7{
    public static void main(String[] args) {
TriFunction1<String,String,Double,Employee> employeeCreator=Employee::new;
Employee employee=employeeCreator.apply("Gaurav","AARTYUT786",75000.00);
System.out.println(employee);

    }




    }

