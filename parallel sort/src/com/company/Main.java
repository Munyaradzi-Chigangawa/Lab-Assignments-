package com.company;
import java.util.Arrays;

public class Main {

        public static void main(String[] args)
        {
            // Creating an array
            int arr1 [] = {1, 7, 3, 9, 4};

            // Printing unsorted Array
            System.out.print("Unsorted Array: ");
            // Iterating the Elements using stream
            Arrays.stream(arr1)
                    .forEach(n -> System.out.print(n + " "));
            System.out.println();

            // Using Arrays.parallelSort()
            Arrays.parallelSort(arr1);

            // Printing sorted Array
            System.out.print("Sorted Array: ");
            // Iterating the Elements using stream
            Arrays.stream(arr1)
                    .forEach(n -> System.out.print(n + " "));
        }
    }
