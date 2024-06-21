package Concepts.Comparator_Comparable;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ClientComparator {

        public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 23));
        students.add(new Student("Bob", 21));
        students.add(new Student("Charlie", 22));

        // Sorting by age using Comparator
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.getAge(), s2.getAge());
            }
        });

        System.out.println("Sorted by age:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Sorting by name using Comparator
        students.sort(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getName().compareTo(s2.getName());
            }
        });

        System.out.println("Sorted by name:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
