import java.util.Scanner;
class Circle
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String args[])
    {
        System.out.print("Enter the radius: ");
        /*We are storing the entered radius in double
         * because a user can enter radius in decimals
         */
        double radius = sc.nextDouble();
        //Area = PI*radius*radius
        double area = Math.PI * (radius * radius);
        System.out.println("The area of circle is: " + area);
        //Circumference = 2*PI*radius
        double circumference= Math.PI * 2*radius;
        System.out.println( "The circumference of the circle is:"+circumference) ;
    }
}

// we will see how to calculate area and circumference of circle in Java. There are two ways to do this:
//
//1) With user interaction: Program will prompt user to enter the radius of the circle
//2) Without user interaction: The radius value would be specified in the program itself.