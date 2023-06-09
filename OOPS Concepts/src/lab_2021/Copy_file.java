package lab_2021;

import java.io.*;
 
// Main Class
public class Copy_file {
 
    // Main driver method
    public static void main(String[] args)
        throws IOException
    {
 
        // Creating two stream
        // one input and other output
        FileInputStream fis = null;
        FileOutputStream fos = null;
 
        // Try block to check for exceptions
        try {
 
            // Initializing both the streams with
            // respective file directory on local machine
 
            // Custom directory path on local machine
            fis = new FileInputStream(
                "C:\\Users\\ASUS\\eclipse-workspace\\JAVA_BASIC\\source.txt");
 
            // Custom directory path on local machine
            fos = new FileOutputStream(
                "C:\\Users\\ASUS\\eclipse-workspace\\JAVA_BASIC\\Destination.txt");
 
            int c;
 
            // Condition check
            // Reading the input file till there is input
            // present
            while ((c = fis.read()) != -1) {
 
                // Writing to output file of the specified
                // directory
                fos.write(c);
            }
 
            // By now writing to the file has ended, so
 
            // Display message on the console
            System.out.println(
                "copied the file successfully");
        }
 
        // Optional finally keyword but is good practice to
        // empty the occupied space is recommended whenever
        // closing files,connections,streams
        finally {
 
            // Closing the streams
 
            if (fis != null) {
 
                // Closing the fileInputStream
                fis.close();
            }
            if (fos != null) {
 
                // Closing the fileOutputStream
                fos.close();
            }
        }
    }
}