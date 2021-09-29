import java.util.Scanner;
class PrimeCheck
{
    public static void main(String args[])
    {
        int temp;
        boolean isPrime=true;
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter any number:");
        //capture the input in an integer
        int num=scan.nextInt();
        scan.close();
        for(int i=2;i<=num/2;i++)
        {
            temp=num%i;
            if(temp==0)
            {
                isPrime=false;
                break;
            }
        }
        //If isPrime is true then the number is prime else not
        if(isPrime)
            System.out.println(num + " is a Prime Number");
        else
            System.out.println(num + " is not a Prime Number");
    }
}

//The number which is only divisible by itself and 1 is known as prime number, for example 7 is a prime number because it is only divisible by itself and 1.
//This program takes the number (entered by user) and then checks whether the input number is prime or not. The program then displays the result. If you are looking for a program that displays the prime number between two intervals then see: Java program to display prime numbers between 1 to n.