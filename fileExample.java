// This program is Crreated By Aryaan Rabara 21CE112
// GITHUB LINK: https://github.com/21CE112/21CE112_JAVA_PRAC_5.git
// Aim:: WAP to show use of character and byte stream.

import java.io.*;
public class fileExample {

    public static void main(String[] args)
        throws IOException
    {
 
        // Initially assigning null as we have not read anything
        FileReader sourceStream = null;
 
        // Here We Use Try-Catch Block
        try {
            sourceStream = new FileReader("C:/Users/aryaa/Desktop/file.txt");
 
           //Here Compiler read the file character by charecter
 
            int temp;
 
            // If there is content inside file than read
            while ((temp = sourceStream.read()) != -1)
            {
                System.out.print((char)temp);
            }
           
           
          // Display message if successful execution of program
          
          System.out.println("\nThis program is Created By Aryaan Rabara 21CE112");

        }
        catch(Exception e){
            System.out.println(e);
        }
        finally {
 
            // Closing stream if no longer Use
            if (sourceStream != null)
                sourceStream.close();
        }
    }
}