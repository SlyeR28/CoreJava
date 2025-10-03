package ArrayList.Student;


public class Students {
    private int rollNo;
    private String name;
    private float marks;
    private String course;


    public Students() {
    }

    public Students( int rollNo ,String name,float marks, String course ) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        this.course = course;
    }


    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Students{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                ", course='" + course + '\'' +
                '}';
    }
}
