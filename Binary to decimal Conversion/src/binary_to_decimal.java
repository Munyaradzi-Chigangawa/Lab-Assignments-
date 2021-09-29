import java.util.Scanner;
class BinaryToDecimal {
    public static void main(String args[]){
        Scanner input = new Scanner( System.in );
        System.out.print("Enter a binary number: ");
        String binaryString =input.nextLine();
        System.out.println("Output: "+Integer.parseInt(binaryString,2));
    }
}

// 1) Using Integer.parseInt() method of Integer class.