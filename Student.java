package com.Java_Training;

import javax.print.attribute.Size2DSyntax;

public class Student {
    int id;
    String name;
    String collegeName;
    double marks;

//    public Student(){
//        System.out.println("This is a no arg constructor");
//    }
    public Student(int ID, String Name, String college_Name, double mark){
        id = ID;
        name = Name;
        collegeName = college_Name;
        marks = mark;
    }
    public Student(){
        System.out.println("This is a no args constructor!");
    }
    public Student(int id) {
        this.id = id;
        System.out.println("This is a 1 args constructor!");
    }
    public Student(int id, String name) {
        this(id);
        this.name = name;
        System.out.println("This is a 2 args constructor!");
    }
    public Student(int id, String name, String collegeName){
        this(id, name);
        this.collegeName = collegeName;
        System.out.println("This is a 3 args constructor!");
        }
    public void study(){
        System.out.println(name+" is studying!");
    }
}
