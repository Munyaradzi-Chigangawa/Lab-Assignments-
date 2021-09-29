import java.util.Scanner;

class Number {

    public static void findFactor(int n) {
        for(int i=1; i <= n; i++) {
            if(n % i == 0)
                System.out.print(i+"\t");
        }
    }

    public static void main(String[] args) {

        // declare variable
        int number = 0;

        // create Scanner class object
        Scanner scan = new Scanner(System.in);

        // take input
        System.out.print("Enter a number:: ");
        number = scan.nextInt();

        // find the factor of the number
        System.out.print("The factors are:: ");
        findFactor(number);

        // close Scanner class object
        scan.close();

    }
}

// To find the factor of a positive number “N” divide that number using natural numbers 1 to “N”. If the number is divisible by the natural number then that natural number is the factor. A number N can have factors only in between 1 to N.
//
//Steps to find the factors of a number:-
//1) Take a number N as input
//2) Take an iterator variable and initialize it with 1
//3) Dividing the number N with an iterator variable
//4) If it is divisible then it is a factor of the given number N
//5) Increase the iterator variable
//6) Repeat the 4 and 5 steps until the iterator variable becomes equal to N.