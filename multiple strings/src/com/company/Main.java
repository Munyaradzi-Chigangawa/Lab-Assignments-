package com.company;

public class Main {

    public static void main(String[] args) {
        String[] strArray = {
                "I'm Munyaradzi Chigangawa.",
                "Currently level 2.2,",
                "doing Computer Science.",
                "My Lecturer for OOP is",
                "Mrs Ruvinga."
        };
        String delimiter = " ";

        String output1 = String.join(delimiter, strArray);
        System.out.println(" Multiple Strings Output => " + output1);
    }
}
