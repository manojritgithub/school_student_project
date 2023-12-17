package studentproject;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Example usage

        // Create students
        Student student1 = new Student("John", "Doe", 1, 70, 1);
        Student student2 = new Student("Jane", "Smith", 2, 85, 1);
        Student student3 = new Student("Bob", "Johnson", 3, 55, 1);

        // Create course
        Course course = new Course("Java Programming", "Prof. Johnson", 2023);

        // Enroll individual students
        course.enroll(student1);
        course.enroll(student2);

        // Print student count and best grade
        System.out.println("Number of students: " + course.countStudents());
        System.out.println("Best grade in the course: " + course.bestGrade());

        // Enroll a list of students
        List<Student> studentList = Arrays.asList(student2, student3);
        course.enroll(studentList);

        // Print updated student count and best grade
        System.out.println("Number of students after enrolling a list: " + course.countStudents());
        System.out.println("Best grade in the course after enrolling a list: " + course.bestGrade());
    }
}