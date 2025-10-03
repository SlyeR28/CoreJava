import javax.swing.*;
import java.util.Arrays;

public class ClaasesAndObject {
    public  static void main(String[] args) {
        Student [] students = new Student[5];
      //  System.out.println(Arrays.toString(students));
        //manipulation of object
        Student student1 = new Student(1 , "rishabh kumar" , 98.0f);
        Student student2 = new Student();

//        student2.Name = "rayichuuu";
//        student2.rollno = 56;
//        student2.Marks = 89.00f;
//
//        System.out.println(student2.Name);
//        System.out.println(student2.rollno);
//        System.out.println(student2.Marks);


        Student ramdom2 = new Student();
        System.out.println(ramdom2.rollno + "  " + ramdom2.Marks + " " + ramdom2.Name);

        Student random1 = new Student(45 , "judge" , 78.05f);
        System.out.println(random1.rollno + "  " + random1.Marks + " " + random1.Name);
    }





  public static class Student{
        int rollno;
        String Name;
        Float Marks ;

        Student(int rollno , String Name, Float Marks){
            this.rollno = rollno;
            this.Name = Name;
            this.Marks = Marks;
        }

        Student(Student other){
            this.rollno = other.rollno;
            this.Name = other.Name;
            this.Marks = other.Marks;
        }
        Student(){
            this(16 , "randomlyy " , 78.0f);
        }


    }
}
