package com.basic.hillel.lecture14;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by alpa on 12/5/19
 */
public class SetMain {

    public static void main(String[] args) {
        Set<Student> stringSet = findAllStudents();
        System.out.println("stringSet: " + stringSet.size());

        List<Student> studentList = findAllStudentsList();
        System.out.println("studentList: " + studentList.size());
        //      x§  students.addAll(studentList);
        Set<Student> students = new HashSet<>(studentList);
        System.out.println("no duplicates: " + students.size());
    }

    public static Set<Student> findAllStudents() {
        Student studentAlexey = new Student("Alexey", 10, 30);
        Student studentViktor = new Student("Viktor", 8, 25);
        Student studentAnna = new Student("Anna", 6, 35);
        Student studentBob = new Student("Bob", 2, 27);
        Student studentBob2 = new Student("Bob", 2, 27);
//        Set<Student> students = new HashSet<>();
        Set<Student> students = new LinkedHashSet<>();
        students.add(studentAlexey);
        students.add(studentViktor);
        students.add(studentAnna);
        students.add(studentBob);
        students.add(studentBob2);

        return students;
    }

    public static List<Student> findAllStudentsList() {
        Student studentAlexey = new Student("Alexey", 10, 30);
        Student studentViktor = new Student("Viktor", 8, 25);
        Student studentViktor2 = new Student("Viktor", 8, 25);
        Student studentAnna = new Student("Anna", 6, 35);
        Student studentBob2 = new Student("Bob", 2, 27);
        Student studentBob = new Student("Bob", 2, 27);
//        ArrayList<Student> students = new ArrayList<>();
//        students.add(studentAlexey);
//        students.add(studentViktor);
//        students.add(studentAnna);
//        students.add(studentBob);

        return Arrays.asList(studentAlexey, studentViktor,studentViktor2, studentAnna, studentBob, studentBob2);
    }

}
