package largestnumber;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int n, max;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of elements for an Array: ");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.print("Enter the elements of array: ");
        for(int i = 0; i <n; i++)
        {
            a[i] = sc.nextInt();
        }
        max = a[0];
        for(int i = 0; i<n;i++)
        {
            if (max<a[i])
            {
                max = a[i];
            }
        }
        System.out.print("Largest value in array is: "+max);
    }
}
