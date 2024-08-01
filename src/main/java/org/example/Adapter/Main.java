package org.example.Adapter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new CollegeStudent());

        students.add(new SchoolStudentAdapter(new SchoolStudent()));

    }
}
