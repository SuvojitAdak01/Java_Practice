package com.Java_Training.March_22;

public class Employee {
    int id;
    String name;
    String compName;
    double salary;

    public Employee(int id){
        this.id = id;
    }

    public Employee(int id, String name){
        this(id);
        this.name = name;
    }
    public Employee(int id, String name, String compName){
        this(id, name);
        this.compName = compName;
    }
    public Employee(int id, String name, String compName, double salary){
        this(id, name, compName);
        this.salary = salary;
    }
}
