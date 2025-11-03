import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Student {
    private String name;
    private int standard;
    Student(String name, int standard) {
        this.name = name;
        this.standard = standard;
    }

    @Override
    public String toString() {
        return name + "-" + standard;
    }
}

class Course {
    private String name;
    Course(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }
}

public class Association {
    public static void main(String[] args) {
        Student student1 = new Student("A", 5);
        Student student2 = new Student("B", 10);
        Student student3 = new Student("C", 10);

        Course physics = new Course("physics");
        Course chemistry = new Course("chemistry");
        Course biology = new Course("biology");
        Course math = new Course("math");

        Map<Student, List<Course>> studentCourses = new HashMap<>();
        List<Course> coursePack1 = new ArrayList<>();
        coursePack1.add(chemistry);
        coursePack1.add(biology);
        studentCourses.put(student3, coursePack1);

        System.out.println(studentCourses.get(student3).toString());

    }
}
