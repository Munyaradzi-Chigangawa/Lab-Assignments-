// Perfect square program using sqrt() method
        // The Math.sqrt() method returns the square root of the number. If the result is an integer number then the given number is a perfect square else it is not.

import java.util.Scanner;

class PerfectSquare {

    // method to check the given number is
    // perfect number or not
    public static boolean isPerfectSquare(double number) {

        // calculate square root of the number
        double root = Math.sqrt(number);

        // check square root is an integer or not
        return (root - Math.floor(root) == 0);
    }

    // main method
    public static void main(String[] args) {

        // declare variables
        double number = 0.0;
        boolean result = false;

        // create Scanner class object to
        // read input
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number::");
        number = scan.nextDouble();

        // check number
        result = isPerfectSquare(number);

        // display result
        if(result)
            System.out.println("Perfect Square");
        else
            System.out.println("Not a Perfect Square");

        // close Scanner class object
        scan.close();
    }
}