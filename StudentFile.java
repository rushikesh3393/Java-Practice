/* . WAP to create document file name as resume.doc and store student data in file like as 

Name : name 
Objective : objective
SkillSet: C,C++,
Project Title
Project Description
Note:use BufferedWriter class
 */
 
 import java.io.*;
 import java.util.*;
 import java.io.FileWriter;
 
 public class StudentFile
 {
	 public static void main(String x[])
	 {
		 FileWriter fw=new FileWriter("F:\\resumedoc.doc");
		 
		 BufferedWriter bw = new BufferedWriter(fw);
     
	     Scanner xyz=new Scanner(System.in);
		  
            bufferedWriter.write("Name: " + name);
            bufferedWriter.newLine(); 
            bufferedWriter.write("Objective: " + objective);
            bufferedWriter.newLine();
            bufferedWriter.write("SkillSet: " + skillSet);
            bufferedWriter.newLine(); 
            bufferedWriter.write("Project Title: " + projectTitle);
            bufferedWriter.newLine(); 
            bufferedWriter.write("Project Description: " + projectDescription);
            
            System.out.println("Resume has been created successfully.");
            
           
            bw.close();
            fw.close();
	 }
 }
 /* mport java.io.*;
import java.util.*;
class Writefile
{
  public static void main(String args[]) throws Exception
  {
       FileWriter w = new FileWriter("D:\\FileUpload\\test.txt");
         BufferedWriter bf = new BufferedWriter(w);
          Scanner sc = new Scanner(System.in);
           System.out.println("Enter the String");
            String s = sc.nextLine();
            bf.write(s);
            System.out.println("String added successfully...");
         bf.close();
FileReader a = new FileReader("D:\\FileUpload\\test.txt");

        BufferedReader r = new BufferedReader(a);


        

            int ch,sum=0;
                           StringBuilder str = new StringBuilder();

            while((ch=r.read())!=-1)
            {
                 str.append((char) ch);
            }
          
 FileWriter ww = new FileWriter("D:\\FileUpload\\demo.txt");
         BufferedWriter bff = new BufferedWriter(ww);
         System.out.println("---> "+str);
bff.write(str);

 System.out.println("data added succesfully.............");
     
   
  }

}
 */