/* 3. Write a Java program to implement a lambda expression to convert a list of strings to uppercase and lowercase. */
import java.util.Scanner;

@FunctionalInterface
interface StringConverter 
{
    void convert(String s);
}

public class LambdaThird 
{

    public static void main(String[] args) 
	{
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = scanner.nextLine();

        StringConverter toUpperCase = s -> System.out.println("Uppercase: " + s.toUpperCase());
		
        StringConverter toLowerCase = s -> System.out.println("Lowercase: " + s.toLowerCase());

        toUpperCase.convert(str);
        toLowerCase.convert(str);

    }
}
	
