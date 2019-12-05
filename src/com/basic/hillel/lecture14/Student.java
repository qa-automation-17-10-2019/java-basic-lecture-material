package com.basic.hillel.lecture14;

import java.util.Objects;

/**
 * Created by alpa on 12/5/19
 */
public class Student {

    private String name;
    private int rate;
    private int age;

    public Student(String name, int rate, int age) {
        this.name = name;
        this.rate = rate;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getRate() {
        return rate;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getRate() == student.getRate() &&
                getAge() == student.getAge() &&
                Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getRate(), getAge());
    }
}
