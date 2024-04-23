package com.simform.record_patterns;

public class RecordPatternsDemo {

    void main() {
        Employee employee = new Employee(1, "Test");

        if (employee instanceof Employee(int id, String name)) {
            System.out.println(STR."ID : \{id} and NAME :  \{name}");
        } else {
            System.out.println("Not an instance of Employee");
        }
    }
}

record Employee(int id, String name) {
}
