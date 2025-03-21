package com.Java_Training;

import java.sql.SQLOutput;

public class StudentDriver {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Suvojit", "UEM", 91.5);
        System.out.println(s1.id+" "+s1.name+" "+s1.collegeName+" "+s1.marks);

//        s1.name = "Suvojit";
//        s1.collegeName = "UEM";
//        s1.id = 1;
//        s1.marks = 91.5;
//
//        System.out.println(s1.name+" "+s1.collegeName+" "+s1.id+" "+s1.marks);
//        s1.study();
//
//        System.out.println("-------------------------------------------------");
//
//        Student s2 = new Student();
//
//        s2.name = "Bhaskar";
//        s2.collegeName = "UEM";
//        s2.id = 2;
//        s2.marks = 93.5;
//
//        System.out.println(s2.name+" "+s2.collegeName+" "+s2.id+" "+s2.marks);
//        s2.study();
    }
}
