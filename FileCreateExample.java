// This Program Is created by Aryaan Rabara 21CE112
// GITHUB LINK: https://github.com/21CE112/21CE112_JAVA_PRAC_5.git
// Write a program to show how to create a file with different mode and methods of File class 
// to find path, directory etc.
import java.io.*;
public class FileCreateExample {
    public static void main(String[] args) throws IOException {
        //Here We Give The path to the path
        File file=new File("C:/Users/aryaa/Desktop/File.txt");
        try{
            //Here we create a file named file.txt
            boolean createFile=file.createNewFile();
            if(createFile){
                System.out.println("New file is created");}
                else{
                    System.out.println("File is Already exist");
                    System.out.println("\nThis Program Is created by Aryaan Rabara 21CE112");
                }}
                catch(IOException e)
                {
                    e.printStackTrace();
                }
                    //here we opened writting mode And write Hii Aryaan
                FileWriter fw = new FileWriter(file);
                fw.write("Hii Aryaan!!!");
                fw.close();
            
        
    }
}
