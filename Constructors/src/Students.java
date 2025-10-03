import java.util.Random;

public class Students {
     private String Name;
     private int ID_Number;
     private char Class;
     private int classRollNo;
     static int studentsCount;

     static{
         System.out.println("this is basic understanding for all concept works");
     }
      private static int markstopass(int marks){

          int passedStudents = 0;
          if(marks>33){
              passedStudents++;
          }
          return passedStudents;
      }

      Students(String name , int Id_no, char aClass , int classrollno ,int studentsCount){
         this.Name = name;
         this.ID_Number = Id_no;
         this.Class = aClass;
         this.classRollNo = classrollno;
         Students.studentsCount += 1;
      }
      Students(){
         this.Name = "Unknown";
         this.ID_Number = 0;
         this.Class = 'u';
         this.classRollNo = 0;
         Students.studentsCount +=1;

      }
      private Students(Students old){


      }
      private class goodStudents{

      }

    public static void main(String[] args) {
         String Name = "rishabh";
    }

}
