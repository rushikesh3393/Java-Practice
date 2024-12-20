/*Write a program to write multiple lines to a text file.
Test Data :
Input the number of lines to be written : 4
:: The lines are ::
test line 1
test line 2
test line 3
test line 4
keep

Expected Output :
The content of the file test.txt is  :                                                                       
test line 1                                                                                                   
test line 2                                                                                                   
test line 3                                                                                                   
test line 4*/

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Question3FileHandling 
{
   public static void main(String x[]) throws IOException
	{
         File f=new File("F:\\test1.txt");
        boolean b = f.createNewFile();
        
        if(b) 
		{
            System.out.println("The file test.txt created successfully...!!");
        } 
		else 
		{
            System.out.println("There is some problem");
        }
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number of lines to be written:");
        int numLines = scanner.nextInt();
        scanner.nextLine(); 
        
        String[] lines = new String[numLines];
        
      
        System.out.println(":: The lines are ::");
        for(int i = 0; i < numLines; i++) 
		{
            lines[i] = scanner.nextLine();
        }
        
        try (FileWriter fw = new FileWriter(f)) 
		{
            for(String line : lines) 
			{
                fw.write(line + "\n"); 
            }
        } 
		catch (IOException e)
		{
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
        
        try (Scanner fileReader = new Scanner(f)) 
		{
            System.out.println("\nThe content of the file test.txt is:");
            while(fileReader.hasNextLine()) 
			{
                System.out.println(fileReader.nextLine());
            }
        } 
		catch (FileNotFoundException e) 
		{
            System.out.println("File not found.");
            e.printStackTrace();
        }
    }
}
