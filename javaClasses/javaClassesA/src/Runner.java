import java.util.Arrays;
import java.util.List;

public class Runner {

    static List<Student> students = Arrays.asList(
            new Student("Petr Petrov", 19, "Minsk", 294567894, "Mathematic", 1, "15-M"),
            new Student("Inna Kolotova", 22, "Gomel", 294567894, "Chemistry", 3, "8-C"),
            new Student("Don Kihot", 23, "Minsk", 258567894, "Mathematic", 4, "7-M"),
            new Student("Alex Ivanov", 24, "Brest", 294567894, "Physics", 5, "5-P"),
            new Student("Alina Petrova", 18, "Minsk", 291267894, "Mathematic", 1, "15-M")
    );


    public static void main(String[] args) {

        University university = new University(students);

        System.out.println("Students elder than 20 years " + university.elderThan(20).toString());
        System.out.println("Students who study on Mathematic faculty " + university.getFaculty("Mathematic").toString());
        System.out.println("Students who study on Mathematic faculty on 4 course " + university.getFacultyAndCourse("Mathematic", 4).toString());
        System.out.println("Students who study in 7-M group " + university.getGroup("7-M").toString());
    }
}
