package com.company;

public class Main {

    public static void main(String[] args) {
        //array of numbers
        double arr[] = new double[]{3.5, 1.8, 4.2, 1,4};

        //assign first element of an array to largest and smallest
        double smallest = arr[0];
        double largest = arr[0];

        for(double i=1; i< arr.length; i++)
        {
            if(arr[(int) i] > largest)
                largest = arr[(int) i];
            else if (arr[(int) i] < smallest)
                smallest = arr[(int) i];

        }
        //finding the sum of numbers in the array
        double sum = 0;
        for(int i=1; i< arr.length; i++){
            sum =  (sum + arr[i]);
        }

        System.out.println("Smallest Number is : " + smallest);
        System.out.println("Largest Number is : " + largest);
        System.out.println("Sum of Array is: " + sum);
    }
}