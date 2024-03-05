import java.io.*;

class Student implements Serializable{
    static int id;
    private int age;
    private String name;

    public Student(String name,int age){
        id++;
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return ("ID: " + id + ", name: " + name + " and age: " + age);
    }
}

class Course implements Serializable{
    private String courseCode, courseName, instructor;

    public Course(String courseCode, String courseName, String instructor){
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.instructor = instructor;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getInstructor() {
        return instructor;
    }

    @Override
    public String toString() {
        return ("Course code: " + courseCode + ", course name: " + courseName + " and courses instructor: " + instructor);
    }
}

class Enrollment implements Serializable{
    private Student student;
    private Course course;
    private String enrollmentDate;

    public Enrollment(){

    }

    public Enrollment(Student s, Course c, String enrollmentDate){
        this.student = s;
        this.course = c;
        this.enrollmentDate = enrollmentDate;
    }

    private void setStudent(String name, int age){
        student = new Student(name, age);

    }

    private void setCourse(String code, String name, String instructor){
        course = new Course(code, name, instructor);
    }
}

public class Task3 {
    private final static String FILENAME = "enrollment.dat";
    public static void main(String[] args) {
        File f = new File(FILENAME);
        Student s = new Student("Aarni", 24);
        Course c = new Course("OTO24", "Olio", "Simo");
        Enrollment e = new Enrollment();

        if(f.exists() && f.isFile()){
            try (FileInputStream inputStream = new FileInputStream(FILENAME);
                ObjectInputStream objects = new ObjectInputStream(inputStream);
                ) {
                    e = (Enrollment) objects.readObject();
            } catch (Exception ex) {
                System.err.println("Reading enrollment: "+ex);
            }
        } else {
            e = new Enrollment(s, c, "9.1.2024");
            try (
                    FileOutputStream outputStream = new FileOutputStream(FILENAME);
                    ObjectOutputStream objects = new ObjectOutputStream(outputStream);
                    ){
                objects.write(e);
            } catch (FileNotFoundException ex) {
                throw new RuntimeException(ex);
            } catch (Exception ex) {
                System.err.println("Writing enrollment: "+ex);
            }
        }

    }
}
