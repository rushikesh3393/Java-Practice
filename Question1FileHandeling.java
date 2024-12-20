/* 1.Write a program  to create and store information in a text file.
Test Data :
Input a sentence for the file : This is the content of the file test.txt.
Expected Output :

 The file test.txt created successfully...!!   */
 
 import java.io.*;
 import java.util.*;
 
 public class Question1FileHandeling
 {
	 public static void main(String x[])throws IOException
	 {
		 File f=new File("F:\\test.txt");
		 boolean b=f.createNewFile();
		 
		 if(b)
		 {
			 System.out.printf("The file test.txt created successfully...!!");
		 }
		 else
		 {
			 System.out.printf("There is some problem");
		 }
		 
		 FileWriter fw=new FileWriter("F:\\test.txt");
		 
		 
		 String abc="This is the content of the file test.txt.";
		 
		 fw.write(abc);
		 fw.close();
		 
	 }
 }