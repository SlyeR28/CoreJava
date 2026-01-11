import java.util.*;
import java.util.stream.Collectors;

public class Employees {
    private int id;
    private String name;
    private String department;
    private double salary;

    public Employees() {
    }

    public Employees(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "department='" + department + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {
         List<Employees> employees = Arrays.asList(
                new Employees(101, "Ramesh", "IT", 75000.0),
                new Employees(102, "Suresh", "HR", 65000.0),
                new Employees(103, "Mahesh", "IT", 82000.0),
                new Employees(104, "Rajesh", "Finance", 90000.0),
                new Employees(105, "Lokesh", "HR", 68000.0)
        );

       Map<String, Optional<Employees>> ans =  employees.stream().collect(Collectors.groupingBy(Employees::getDepartment,
               Collectors.maxBy(Comparator.comparingDouble(Employees::getSalary))));
        System.out.println(ans);
    }


}
