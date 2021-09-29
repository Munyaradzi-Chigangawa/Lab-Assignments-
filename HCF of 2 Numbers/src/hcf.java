import java.util.Scanner;

class HCFProgram {

    public static int findHCF(int num1, int num2){

        // declare variable to store hcf value
        int hcf = 0;
        int i = 1;

        while(i<=num1 && i<=num2) {
            if(num1%i==0 && num2%i==0)
                hcf = i;
            i++;
        }

        return hcf;
    }

    public static void main(String[] args) {

        // declare variables
        int number1 = 0;
        int number2 = 0;
        int hcf = 0;

        // create Scanner class object
        Scanner scan = new Scanner(System.in);

        // take input
        System.out.print("Enter two integer numbers::");
        number1 = scan.nextInt();
        number2 = scan.nextInt();

        // find HCF of both numbers
        hcf = findHCF(number1, number2);

        // display HCF value
        System.out.println("HCF(" + number1
                + "," + number2 + ") = " + hcf );

        // close Scanner class object
        scan.close();
    }
}

// Procedure to find the HCF of two numbers,
//1) Take two numbers
//2) Declare a temporary variable hcf to store the HCF value
//3) Take an iterator variable and initialize it with 1 i.e. i=1
//4) Check both numbers are divisible by iterator variable (i) or not?
//5) If yes then hcf = i
//6) Increase the iterator variable by 1
//7) Repeat 4 to 6 step until the iterator variable is less than both numbers