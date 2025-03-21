package com.Java_Training.March_22;

public class EmployeeDriver {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Suvojit", "Capgemini", 50000);
        System.out.println(e1.id + " " + e1.name + " " + e1.compName + " " + e1.salary);
    }
}
