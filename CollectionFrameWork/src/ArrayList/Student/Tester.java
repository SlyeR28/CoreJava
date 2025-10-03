package ArrayList.Student;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Tester implements Comparator<Students> {


    @Override
    public int compare(Students o1, Students o2) {
        int MarksComapre = (int) (o1.getMarks() - o2.getMarks());
        int NameCompare = o2.getName().compareTo(o1.getName());
        return (NameCompare == 0)?NameCompare:MarksComapre;
    }

    public static void main(String[] args) {

       Students student1 = new Students(15 , "Joyti patel" ,95.8f  ,"Btech");
       Students student2 = new Students(22 , "Rishabh kuamr" ,67.8f  ,"Btech");
       Students student3 = new Students(32, "Prince Kumar" ,75.8f  ,"Btech");
       Students student4 = new Students(1 , "Ankit Kumar" ,88.8f  ,"Btech");
       Students student5 = new Students(12 , "Ashish Ranjan" ,75.8f  ,"Btech");
       Students student6 = new Students(7 , "Prakhar rituraj" ,66.8f  ,"Btech");

        List<Students> studentsList = Arrays.asList(student1 , student2 , student3 , student4 , student5 , student6);
         studentsList.sort(new Tester());

          for(Students students :studentsList){
              System.out.println(students);
          }
    }
}
