// Chapter 7.12.3
import java.util.ArrayList;

public class School {
    private ArrayList<Student> students;

    public School() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public Student findYoungestStudent() {
        Student youngest = students.get(0); // Assuming at least one student exists

        for (Student student : students) {
            if (student.getAge() < youngest.getAge()) {
                youngest = student;
            }
        }
        return youngest;
    }

    public Student findOldestStudent() {
        Student oldest = students.get(0); // Assuming at least one student exists

        for (Student student : students) {
            if (student.getAge() > oldest.getAge()) {
                oldest = student;
            }
        }
        return oldest;
    }
}
