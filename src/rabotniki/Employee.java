package rabotniki;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class Employee {

    private String name;
    private String company;
    private double salary;
    private int age;

    public Employee(String name, String company, double salary, int age) {
        this.name = name;
        this.company = company;
        this.salary = salary;
        this.age = age;
    }



    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                '}';
    }
}
