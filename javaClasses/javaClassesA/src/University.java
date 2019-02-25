import java.util.ArrayList;
import java.util.List;

public class University {

    private List<Student> students;

    public University(List<Student> students) {
        this.students = students;
    }

    /**
     * Implementation of how to find student by faculty
     *
     * @param facultyName String
     * @return List<Student>faculty
     */
    List<Student> getFaculty(String facultyName) {
        List<Student> faculty = new ArrayList<>();
        for (Student student : students) {
            if (student.getFaculty() == facultyName) {
                faculty.add(student);
            }
        }
        return faculty;
    }
    /**
     * Implementation of how to find student by faculty and course
     *
     * @param facultyName String
     * @param course int
     * @return List<Student>facultyAndCource
     */
    List<Student> getFacultyAndCourse(String facultyName, int course) {
        List<Student> facultyAndCource = new ArrayList<>();
        for (Student student : students) {
            if ((student.getFaculty() == facultyName) && (student.getCourse() == course)) {
                facultyAndCource.add(student);
            }
        }
        return facultyAndCource;
    }
    /**
     * Implementation of how to find student by age
     *
     * @param age int
     * @return List<Student>elderThanCurrentAge
     */
    List<Student> elderThan(int age) {
        List<Student> elderThanCurrentAge = new ArrayList<>();
        for (Student student : students) {
            if (student.getAge() > age) {
                elderThanCurrentAge.add(student);
            }
        }
        return elderThanCurrentAge;
    }
    /**
     * Implementation of how to find student by group
     *
     * @param groupName String
     * @return List<Student>group
     */
    List<Student> getGroup(String groupName) {
        List<Student> group = new ArrayList<>();
        for (Student student : group) {
            if (student.getGroup() == groupName) {
                group.add(student);
            }
        }
        return group;
    }

    @Override
    public String toString() {
        return "University{" +
                "students=" + students.toString() +
                '}';
    }
}