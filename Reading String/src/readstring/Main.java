package readstring;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner string = new Scanner(System.in);
        System.out.print("Enter string: ");
        String text = string.next();
        System.out.print("String Entered is: " +text+ " ");
    }
}
