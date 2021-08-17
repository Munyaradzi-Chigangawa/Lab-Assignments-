package com.company;

public class Main {

    public static void main(String[] args) {
	String a = "Hello there!";
	String b = " " + "My name is Munyaradzi, Level 2.2 Computer Science at MSU.";
	String c = a.concat(b);

	System.out.println(c);
    }
}

	//Here is a Java program which illustrates how you can concatenate two strings in Java. The meaning of concatenation is that two words can be joined as a single word. In other words, this pre defined method is used to append one string to the end of other string (Here string a with string b). This method returns a String in the form of result with the value of the String passed into the method, attached to the end of the String creating a new string.

		//In this program, first a class name JavaConcat is declared with the access specifier public and inside it the main() method has been defined. Inside the main(), 2 string type variables has been defined named a and b. The new concatenated string which gets generated after using concat() is being stored in another String variable name c which is being initialized by the predefined method concat() and operates on two strings 'a' and 'b' to concatenate then as one.

		//The concatenation in Java can also be done in other ways. One simple way is by using + symbol between two string operands. Another way of doing is by the use of pre defined method concat() as done above.