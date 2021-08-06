package heapsort;

import static heapsort.heapsort.display;

public class Main {

    public static void main(String[] args) {

            int arr[] = {5, 13, 2, 25, 7, 17, 20, 8, 4};

            heapsort hs = new heapsort();
            System.out.println("Original array:");
            display(arr);
            hs.sort(arr);

            System.out.println("Heap Sorted array:");
            display(arr);
        }
    }