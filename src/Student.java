import java.util.ArrayList;
import java.util.List;

public class Student {
    String name;
    List<Integer> student;
    public Student (String name, List<Integer>student ){
        this.name = name;
        this.student = student;
    }
    public String toString(){
        return "Студент " + name + " с оценками " + student;
    }
    public static void test1_3() {
        List<Integer> student = new ArrayList<>();
        student.add(3);
        student.add(4);
        student.add(5);
        Student student1 = new Student("Вася", student);
        student.set(0, 5);

        List<Integer> student2 = new ArrayList<>(student);
        Student student3 = new Student("Петя", student2);

        student2.set(0, 5);

        List<Integer> student4 = new ArrayList<>(student);
        Student student5 = new Student("Андрей", student4);

        student.set(0, 2);

        System.out.println(student1);
        System.out.println(student3);
        System.out.println(student5);
    }
}
