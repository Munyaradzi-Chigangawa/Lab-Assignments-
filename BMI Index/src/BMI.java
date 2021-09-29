// The BMI stands for Body Mass Index. It is a measure of health based on height and weight. It can be calculated by taking the weight in kilograms and dividing it by the square of your height in meters.

// Formula for Calculating BMI in Metric Units,
//
//BMI = (Weight in Kg) / (Height in Meters * Height in Meters)
//
//For example,
//weight = 75 kg, height = 1.5 m
//BMI = 75 / (1.5*1.5) = 33.33

import java.util.Scanner;

 class BMICalculator {

    // method to check bmi category
    public static String bmiCategory(double weight,
                                     double height) {

        // calculate bmi
        double bmi = weight / ( height * height) ;

        // check range
        if(bmi < 18.5)
            return "Thinness";
        else if(bmi < 25)
            return "Normal";
        else if(bmi < 30)
            return "Overweight";
        else
            return "Obese";
    }

    public static void main(String[] args) {

        // declare variables
        double weightInKg = 0.0f;
        double heightInMeters = 0.0f;
        String result = null;

        // create Scanner class object to
        // take input
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter weight in Kg: ");
        weightInKg = scan.nextDouble();
        System.out.print("Enter height in meters: ");
        heightInMeters = scan.nextDouble();

        // calculate BMI index
        result = bmiCategory( weightInKg,
                heightInMeters );

        // display result
        System.out.println(result);

        // close Scanner class object
        scan.close();
    }
}
