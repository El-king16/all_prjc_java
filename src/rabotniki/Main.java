package rabotniki;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("СиПлюсПлюс", "ИнтелиджиАйдиКомьюнитиЭдишн", "ChatДжэбэте", "ПэДЭЭф", "БлэкЗем", "Мамэ", "Гугл", "ИлонСаск", "ГэбНьюэл", "你的老婆");
            List<String> companies = Arrays.asList("Spring Sale 2025", "Amazov", "Двач", "Pear", "Meincraft", "Cockstar Games", "Союз Мультфильм");
        Random random = new Random();

        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            String name = names.get(random.nextInt(names.size()));
            String company = companies.get(random.nextInt(companies.size()));
            double salary = Math.round((random.nextDouble(110000) + 10000) * 100.0) / 100.0;
            int age = 21 + random.nextInt(40);
            employees.add(new Employee(name, company, salary, age));
        }

        System.out.println("Original List:");
        for (Employee e : employees) {
            System.out.println(e);
        }


        System.out.println("\nSorted by Name:");
        for (Employee e : employees) {
            System.out.println(e);
        }

        System.out.println("\nSorted by Name and Salary:");
        for (Employee e : employees) {
            System.out.println(e);
        }

        employees.sort((a, b) -> {
            int nameComparison = a.getName().compareTo(b.getName());
            if (nameComparison != 0) return nameComparison;
            int salaryComparison = Double.compare(a.getSalary(), b.getSalary());
            if (salaryComparison != 0) return salaryComparison;
            int ageComparison = Integer.compare(a.getAge(), b.getAge());
            if (ageComparison != 0) return ageComparison;
            return a.getCompany().compareTo(b.getCompany());
        });
        System.out.println("\nSorted by Name, Salary, Age, and Company:");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }
}
