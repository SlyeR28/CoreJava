public abstract class Employee {
    private String Name;
    private  int Id;
    private double salary;

    public Employee(String name, int id, double salary) {
        Name = name;
        Id = id;
        this.salary = salary;
    }

    public abstract void calculateBonus();

    public void displayinfo(){
        System.out.println("Details of employee with salary hike...");
    }
}
