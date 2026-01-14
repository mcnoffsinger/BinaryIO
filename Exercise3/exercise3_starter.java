import java.io.*;

/**
 * Exercise 3: Track how many times a program has been executed
 * 
 * Requirements:
 * - Store an execution count in a file named Exercise17_03.dat
 * - Each time this program runs, increment the count by 1
 * - Display the current count
 * - Use the file persistence pattern:
 *   1. Read existing count (if file exists)
 *   2. Increment the count
 *   3. Write updated count back to file
 * @date 1/13/25
 * @author Maxwell Noffsinger
 */
public class Exercise17_03 {
    
    public static void main(String[] args) throws IOException {
        
        File file = new File("Exercise17_03.dat");
        int count = 0;
        
        // STEP 1: Read existing count if file exists
        // TODO: Check if file exists using file.exists()
        if (file.exists()){
            // TODO: If file exists, open DataInputStream and read the count
            DataInputStream input = new DataInputStream(new FileInputStream(file));
            count = input.read();
            // TODO: Close the input stream (or use try-with-resources)
            input.close();
        }
        

        // STEP 2: Increment the count
        // TODO: Add 1 to count
        count += 1;
        
        // STEP 3: Write updated count back to file
        // TODO: Create DataOutputStream for the file
         DataOutputStream output = new DataOutputStream(new FileOutputStream(file));

        
        // TODO: Write the updated count
        output.write(count);
        
        // TODO: Close the output stream (or use try-with-resources)
        output.close();
        
        // Display the result
        System.out.println("This program has been executed " + count + " time(s).");
    }
}