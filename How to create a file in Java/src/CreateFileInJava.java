import java.io.File;
import java.io.IOException;

public class CreateFileInJava {
    public static void main(String[] args) {
        try {
            File file = new File("D:\\file.txt");
            boolean fvar = file.createNewFile();
            if (fvar) {
                System.out.println("File Created Successfully");
            }else{
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println("Error occurred");
            e.printStackTrace();
        }
    }
}


// we will see how to create a file in Java using createNewFile() method. This method creates an empty file,
// if the file doesn’t exist at the specified location and returns true.
// If the file is already present then this method returns false. It throws:
//IOException – If an Input/Output error occurs during file creation.
//SecurityException – If a security manager exists and