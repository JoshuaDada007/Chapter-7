// Chapter 7.12.1
public class Student {
    private long id;
    private int age;
    private double gpa;
    private int creditHoursAccomplished;

    public Student(long id, int age, double gpa, int creditHoursAccomplished) {
        this.id = id;
        this.age = age;
        this.gpa = gpa;
        this.creditHoursAccomplished = creditHoursAccomplished;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public int getCreditHoursAccomplished() {
        return creditHoursAccomplished;
    }

    public void setCreditHoursAccomplished(int creditHoursAccomplished) {
        this.creditHoursAccomplished = creditHoursAccomplished;
    }



// Chapter 7.12.2
    public boolean equals(Student student) {
        if (this.id == student.getId()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {

        return "From the Student class\n ID: " + id;
    }


    public static void main(String[] args) {
        Student student = new Student(21020201, 12, 3.5, 60);
        Student student1 = new Student(21020201,13,3.5,60);
        System.out.println(student.equals(student1));
        System.out.println(student);

    }
}
