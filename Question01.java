class Student {
    private int studentID;
    private String name;
    private int daysAttended;

    public Student(int studentID, String name, int daysAttended) {
        this.studentID = studentID;
        this.name = name;
        this.daysAttended = daysAttended;
    }

    public int getStudentId() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public int getDaysAttended() {
        return daysAttended;
    }

    public void setDaysAttended(int daysAttended) {
        this.daysAttended = daysAttended;
    }

    public void displayStudentDetails() {
        System.out.println("ID: " + studentID + ", Name: " + name + ", Days Attended: " + daysAttended);
    }
}

public class Classroom {
    private Student[] students- new Student[];
    private int studentCount = 0;
    
    }

    public void displayAllStudents() {
        for (int i = 0; i < studentCount; i++) {
           
        }
    }
}

class Question01 {
    public static void main(String[] args) {
        Classroom classroom = new Classroom();

        classroom.addStudent(new Student(101, "Alice Smith", 12));
        classroom.addStudent(new Student(102, "Bob Jones", 15));
        classroom.addStudent(new Student(103, "Carol Lee", 10));

        classroom.updateAttendance(102, 16);
        classroom.updateAttendance(104, 5); 

        classroom.displayAllStudents();
    }
}
