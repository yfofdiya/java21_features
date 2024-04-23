package com.simform.unnamed_variables;

public class UnnamedVariablesDemo {

    public static void main(String[] args) {
        try {
            double _ = 100/0;
            System.out.println("No Exception");
        } catch (Exception _) {
            System.out.println("Got an exception");
        }
    }
}
