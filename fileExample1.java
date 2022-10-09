// This program is Crreated By Aryaan Rabara 21CE112
// GITHUB LINK: https://github.com/21CE112/21CE112_JAVA_PRAC_5.git
// Aim:When to use Character Stream over Byte Stream? When to use Byte 
//Stream over Character Stream? Give example
import java.io.*;
import java.util.*;
public class fileExample1 {

    public static void main(String[] args)
        throws IOException
    {
 
        // Initially assigning null as we have not read anything
        FileReader sourceStream = null;
        FileWriter w = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String you want to insert in file :-");
        String s = sc.nextLine();
        char c[] = s.toCharArray();
        // Here We Use Try-Catch Blo
        try {
            w = new FileWriter("C:/Users/aryaa/Desktop/Aryaan.txt");
            for (char a : c) {
                //Here we write the file using Byte Stream
                w.write((byte)a);
               
            }
            //Here Compiler read the file Byte by Byte
            w.close();
            int temp;
            
            // If there is content inside file than read
            sourceStream = new FileReader("C:/Users/aryaa/Desktop/Aryaan.txt");
            while ((temp = sourceStream.read()) != -1)
            //Here read the file By Character Stream
                System.out.print((char)temp);
           
         
          
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