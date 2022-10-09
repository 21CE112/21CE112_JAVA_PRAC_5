//This program is created by Aryaan Rabara 21CE112
//https://github.com/21CE112/21CE112_JAVA_PRAC_5.git
//Write a program to transfer data from one file to another file so that if the destination file does 
//not exist, it is created
import java.util.*;
import java.io.*;
class file_copy
{
    public File copy(File one,File two) throws Exception
    {
        FileInputStream fin = new FileInputStream(one);
        FileOutputStream fout = new FileOutputStream(two);
            
         // Here We Use Try-Catch Block
        try {
        int i;
        while((i=fin.read()) != -1)
        {
            //First of all compiler read character by character in 
            //file one after that it will copy the content of file one in second file
            fout.write(i);
        }

        } catch (Exception e) {
            System.out.println(e);
        }
        finally
        {
            if(fin != null && fout != null)
            {
                fin.close();
                fout.close();
            }
        }
        return two;
    }
}

public class write_into_file {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file path:-");
        String s1 = sc.nextLine();
        System.out.println("Enter the file path:-");
        String s2 = sc.nextLine();
        File one = new File(s1);
        File two = new File(s2);
        // Initially assigning null as we have not read anything
        FileInputStream f = null;
        try{
        if(!two.exists())
        {
            // System.out.println("ok");
            if(two.createNewFile())
            {
                System.out.println("created  "+ two.getName());
            }
            else
            {
                System.out.println("There was an error while creating the file");
            }
        }
        file_copy f1 = new file_copy();
        two = f1.copy(one, two);
         f = new FileInputStream(two);
        int i;
        while((i = f.read()) != -1)
        {
            System.out.print((char)i);
        }
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
    finally
    {
        System.out.println("\nThis program is created by Aryaan Rabara 21CE112");
        if(f!=null)
            {
                // Closing stream if no longer Use
                sc.close();
                f.close();
            }
    }
    }
}
