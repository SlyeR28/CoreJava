package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Students  implements Runnable{
    private int roll_No;
    private String name;
    private String course;


    public Students(int roll_No , String name,String course) {
        this.roll_No = roll_No;
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Students{" +
                "course='" + course + '\'' +
                ", roll_No=" + roll_No +
                ", name='" + name + '\'' +
                '}';
    }

    public Students() {
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_No() {
        return roll_No;
    }

    public void setRoll_No(int roll_No) {
        this.roll_No = roll_No;
    }

    public static void main(String[] args)  {

        Students students1 = new Students(1, "rishabh kumar" , "btech");
        Students students2 = new Students(2, "prince kumar" , "btech");
        Students students3 = new Students(3, "Ankit kumar" , "btech");
        Students students4 = new Students(4, "Kushi Patel" , "btech");


        List<Students> studentsList = Collections.synchronizedList(new ArrayList<>());
         studentsList.add(students1);
         studentsList.add(students2);
         studentsList.add(students3);
         studentsList.add(students4);

//        System.out.println(students1.toString());

         for(Students students : studentsList){
             students1.setCourse("mba");
             System.out.println(students.toString());
             Students s1 = new Students();
             s1.run();
         }






    }

    @Override
    public void run() {
        for(int i = 0; i<10; i++){
            System.out.println(Thread.currentThread().getName());
            System.out.println("my name is rishabh kumar");
        }

    }
}