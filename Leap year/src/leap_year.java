import java.util.Scanner;
class Demo {

    public static void main(String[] args) {

        int year;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any Year:");
        year = scan.nextInt();
        scan.close();
        boolean isLeap = false;

        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                if ( year % 400 == 0)
                    isLeap = true;
                else
                    isLeap = false;
            }
            else
                isLeap = true;
        }
        else {
            isLeap = false;
        }

        if(isLeap==true)
            System.out.println(year + " is a Leap Year.");
        else
            System.out.println(year + " is not a Leap Year.");
    }
}


// Here we will write a java program to check whether the input year is a leap year or not. Before we see the program, lets see how to determine whether a year is a leap year mathematically:
//To determine whether a year is a leap year, follow these steps:
//1. If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
//2. If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
//3. If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
//4. The year is a leap year (it has 366 days).
//5. The year is not a leap year (it has 365 days).