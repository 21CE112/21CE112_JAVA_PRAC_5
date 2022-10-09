//This Program is created by Aryaan Rabara 21CE112
//Github link:-https://github.com/21CE112/21CE112_JAVA_PRAC_5.git
//Write a program to enter any 15 numbers from the user and store only even numbers in a file named “Even.txt”. 
//And display the contents of this file on the console. (BufferedReader / BufferedWriter)
import java.util.*;
import java.io.*;
class bufferreader
{
    //Here we use throws and try catch block
    public void bufferwrite(String s,int a[]) throws Exception
    {
        FileWriter fout = new FileWriter(s);
        // // Initially assigning null as we have not read anything
        FileReader fin = null;
        BufferedWriter b = new BufferedWriter(fout);
        BufferedReader r = null;
        try {
            for(int i=0;i<15;i++)
            {
                if(a[i] % 2 == 0)
                {
                   
                    b.write(a[i]+"  ");
                }
            }
             // Closing stream if no longer Use
            b.close();
            fout.close();
            fin = new FileReader(s);
            r = new BufferedReader(fin);
           System.out.println(r.readLine()); 

        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}

public class buffer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //First we take 15 numbers from user
        //Here We Applied Even number logic And Answer are print in file
        System.out.println("Enter any 15 numbers:-");
        int a[] = new int[15];
        for(int i=0;i<15;i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the path of file:-");
        String s = sc.next();
        System.out.println("This Program is created by Aryaan Rabara 21CE112");
        bufferreader b = new bufferreader();
        try {
            b.bufferwrite(s,a);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
