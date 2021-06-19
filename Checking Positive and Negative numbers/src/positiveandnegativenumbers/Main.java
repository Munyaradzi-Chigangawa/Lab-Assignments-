package positiveandnegativenumbers;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
	int num;
	System.out.print("Enter number: ");
	Scanner sc = new Scanner(System.in);
	num = sc.nextInt();

	if (num > 0) {
		System.out.print(+num+" "+"is a positive number");
	}else if (num < 0) {
		System.out.print(+num+" "+"is a negative number");
	}else {
		System.out.print(+num+" "+"is neither positive or negative");
	}
    }
}
