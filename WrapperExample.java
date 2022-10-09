//This program is created By Aryaan Rabar 21CE112
//Github Link:-https://github.com/21CE112/21CE112_JAVA_PRAC_5.git
//Write a program to demonstrate methods of wrapper class 
 
        public class WrapperExample{  
            public static void main(String args[]){  
            //Converting int into Integer  
            int a=1000;  
            Integer i=Integer.valueOf(a);//converting int into Integer explicitly  
            Integer j=a;//now compiler will write Integer.valueOf(a) internally  
              
            System.out.println(a+" "+i+" "+j);  
            System.out.println("This program is created By Aryaan Rabar 21CE112"); 
      
            }}   
    