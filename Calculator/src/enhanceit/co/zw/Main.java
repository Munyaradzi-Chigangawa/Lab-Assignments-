package enhanceit.co.zw;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	System.out.print("Enter First Number: ");
	double num1 = input.nextDouble();
	System.out.print("Enter Second Number: ");
	double num2 = input.nextDouble();

	System.out.print("Enter Operator (+, -, *, /): ");
	char operator = input.next().charAt(0);
	double result;

	switch(operator){
        case '+':
            result = num1 + num2;
            break;
        case '-':
            result = num1 - num2;
            break;
        case '*':
            result= num1 * num2;
            break;
        case '/':
            result = num1 / num2;
            break;

        default:
            System.out.print("Error! Operator is not correct!");
            return;
    }
    System.out.printf("%.2f %c %.2f = %2f \n",num1,operator,num2,result);
    }
}
