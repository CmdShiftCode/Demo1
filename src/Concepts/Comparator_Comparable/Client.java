package Concepts.Comparator_Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {

        public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 23));
        students.add(new Student("Bob", 21));
        students.add(new Student("Charlie", 22));

        Collections.sort(students);

        for (Student student : students) {
            System.out.println(student);
        }

    }
}
