 class MultiplicationTable {
    public static void main(String[] args) {

        System.out.println("Multiplication table from 1 to 10:: ");
        for(int i=1; i<= 10; i++) {
            for(int j=1; j<=10; j++) {
                // to format the output use - flag modifier
                System.out.printf("%d*%-2d=%-5d", j, i, i*j );
            }
            System.out.println(); // new line
        }
    }
}

// we will develop a Java program to display the multiplication table. In mathematics, a multiplication table is a mathematical table used to define a multiplication operation for an algebraic system. We will also develop a Java program to display the multiplication table from 1 to 10.
//
//Method to print the Multiplication table in using while loop,