package readnumbers;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner digit = new Scanner(System.in);
	System.out.print("Enter Number: ");
	int num = digit.nextInt();
	System.out.print("Number Entered is: " +num+ " ");
    }
}
