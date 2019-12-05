package com.basic.hillel.lecture14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by alpa on 12/5/19
 */
public class StudentsMain {

    public static void main(String[] args) {
        List<Student> students = findAllStudents();
        System.out.println("Students total: " + students.size());

        List<Student> filteredStudentsByRate = new ArrayList<>();
        for (Student student : students) {
            if (student.getRate() >= 6) {
                filteredStudentsByRate.add(student);
            }
        }

//        List<Student> filteredStudentsByRate = students.stream()
//                .filter(student -> student.getRate() >= 6).collect(Collectors.toList());

        System.out.println("filteredStudentsByRate: " + filteredStudentsByRate.size());
    }

    public static List<Student> findAllStudents() {
        Student studentAlexey = new Student("Alexey", 10, 30);
        Student studentViktor = new Student("Viktor", 8, 25);
        Student studentAnna = new Student("Anna", 6, 35);
        Student studentBob = new Student("Bob", 2, 27);
//        ArrayList<Student> students = new ArrayList<>();
//        students.add(studentAlexey);
//        students.add(studentViktor);
//        students.add(studentAnna);
//        students.add(studentBob);

        return Arrays.asList(studentAlexey, studentViktor, studentAnna, studentBob);
    }
}
