import java.util.*;
import java.util.stream.Collectors;

public class Employee {
    private final int id;
    private final String name;
    private final String department;
    private final double salary;
    private final String city;

    public Employee(int id, String name, String department, double salary, String city) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.city = city;
    }

    public String getCity() {
        return city;
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
        return "Employee{" +
                "city='" + city + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
                new Employee(101, "Rishabh", "IT", 95000, "Bangalore"),
                new Employee(102, "Akshay", "Finance", 88000, "Delhi"),
                new Employee(103, "Neha", "IT", 105000, "Bangalore"),
                new Employee(104, "Ritu", "Finance", 99000, "Mumbai"),
                new Employee(105, "Aman", "IT", 78000, "Delhi"),
                new Employee(106, "Simran", "HR", 65000, "Bangalore"),
                new Employee(107, "Karan", "HR", 70000, "Delhi"),
                new Employee(108, "Vikas", "Finance", 120000, "Delhi")
        );

        // collecting employee
        Map<String, Employee> collect = employees.stream().collect(Collectors.groupingBy(
                Employee::getDepartment, Collectors.collectingAndThen(
                        Collectors.maxBy(Comparator.comparing(Employee::getSalary)),
                        Optional::get
                )
        ));
        System.out.println(collect);

        Map<String, Long> collect1 = employees.stream().collect(Collectors.groupingBy(Employee::getCity, Collectors.counting()));
        System.out.println(collect1);

        //Sort employees per dept by salary desc
        Map<String, List<Employee>> collect2 = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.collectingAndThen(
                                Collectors.toList(),
                                list -> list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed())
                                        .collect(Collectors.toList())
                        )));
        System.out.println(collect2);

    //Find 2nd highest salary employee overall

        Employee sechighest = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary))
                .skip((long) employees.size() - 2)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("all salaries are equal"));
        System.out.println(sechighest);

        // Salary sum per department
        Map<String, Double> collect3 = employees.stream()
                .collect(
                        Collectors.groupingBy(Employee::getDepartment,
                                Collectors.summingDouble(Employee::getSalary)
                        ));

        System.out.println(collect3);

        //top 3 highest salaries overall
        List<Employee> salaries = employees.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(salaries);
    }
}
