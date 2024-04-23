package com.simform.unnamed_patterns;

public class UnnamedPatternsDemo {

    public static void main(String[] args) {
        Department department = new Department(101, "Test");

        Employee employee = new Employee(1, "Test Emp", department);

        if (employee instanceof Employee(long id, _, Department(_, String name)))
        {
            System.out.println(STR."Employee with id \{id} is in the department name of \{name}");
        }
        else
        {
            System.out.println("Not an instance of employee");
        }
    }

}

record Department(long id, String name) {
}

record Employee(long id, String empName, Department department) {
}
