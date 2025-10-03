public class Human {
    int Age;
    String Name;
    int Salary;
    boolean Married;
    static long Population;

    public Human(int age, String name, int salary, boolean married) {
        Age = age;
        Name = name;
        Salary = salary;
        Married = married;
        Human.Population +=1;
    }
}
