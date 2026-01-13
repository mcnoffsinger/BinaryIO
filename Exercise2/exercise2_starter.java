import java.io.*;
import java.util.Date;

/**
 * Exercise 2: Write and read binary data
 * 
 * Requirements:
 * Part 1 - WRITE:
 * - Store an array of five int values: 1, 2, 3, 4, 5
 * - Store a Date object for the current time
 * - Store the double value 5.5
 * - Write all to file named Exercise17_02.dat
 * 
 * Part 2 - READ:
 * - In the same program, read the data back
 * - Display all values to verify they were stored correctly
 *
 * @date 1/13/26
 * @author Maxwell Noffsinger
 */
public class Exercise17_02 {
    
    public static void main(String[] args) throws IOException {
        
        // Data to write
        int[] numbers = {1, 2, 3, 4, 5};
        Date currentTime = new Date();
        double value = 5.5;
        
        // PART 1: WRITE DATA
        // TODO: Create DataOutputStream for "Exercise17_02.dat"
        DataOutputStream output = new DataOutputStream(new FileOutputStream("Exercise17_02.dat"));

        
        
        // TODO: Write the array of integers
        // Hint: Loop through the array and use writeInt() for each element
        for (int number : numbers){
            output.writeInt(number);
        }
        
        
        // TODO: Write the Date object
        // Hint: Use writeLong() to write currentTime.getTime()
        output.writeLong(currentTime.getTime());
        
        // TODO: Write the double value
        output.writeDouble(value);
        
        // TODO: Close the output stream (or use try-with-resources)
        output.close();
        
        System.out.println("Data written to Exercise17_02.dat");
        
        
        // PART 2: READ DATA
        // TODO: Create DataInputStream for "Exercise17_02.dat"
        DataInputStream input = new DataInputStream(new FileInputStream("Exercise17_02.dat"));
        
        // TODO: Read the array of integers
        // Hint: Create a new array and use readInt() five times
        int[] arraynew = new int[5];
        for (int x = 0;x<5;x++){
            arraynew[x] = input.readInt();
        }
        
        // TODO: Read the Date object
        // Hint: Use readLong() and create new Date with that value
        Date newdate = new Date(input.readLong());
        
        // TODO: Read the double value
        double newdouble = input.readDouble();
        
        // TODO: Close the input stream (or use try-with-resources)
        input.close();
        
        // TODO: Display all the data you read
        System.out.println("\nData read from Exercise17_02.dat:");
        // Display array, date, and double value
        for (int x = 0;x<5;x++){
            System.out.println(arraynew[x]);
        }
        System.out.println(newdate);
        System.out.println(newdouble);
    }
}