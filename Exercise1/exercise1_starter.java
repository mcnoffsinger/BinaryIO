import java.io.*;

/**
 * Exercise 1: Write 100 random integers to a text file
 * 
 * Requirements:
 * - Create a file named Exercise17_01.txt if it does not exist
 * - If the file already exists, APPEND new data (don't overwrite)
 * - Write 100 integers created randomly (use Math.random())
 * - Integers should be separated by a space
 * - Use text I/O (PrintWriter)
 * 
 * @author Your Name
 */
public class Exercise17_01 {
    
    public static void main(String[] args) throws IOException {
        // TODO: Create a File object for "Exercise17_01.txt"
        File file = new File("Exercise17_01.txt");

        // TODO: Create PrintWriter in APPEND mode
        // Hint: Use FileWriter with append parameter set to true
        PrintWriter writer = new PrintWriter(new FileWriter(file, true));
        
        // TODO: Generate and write 100 random integers
        // Hint: Use Math.random() to generate random integers
        // Hint: Separate integers with a space
        for (int i = 0; i<100;i++){
            int randomNumber = (int)(Math.random()*100);
            writer.write(randomNumber + " ");
        }
        
        // TODO: Close the file (or use try-with-resources)
        writer.close();
        
        System.out.println("100 random integers written to Exercise17_01.txt");
    }
}