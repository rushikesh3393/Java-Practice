import java.util.*;

public class CheckVowelConsonant
 {
    public static void main(String x[])
 {
        Scanner xyz = new Scanner(System.in);
        System.out.println("Enter character:");
        char ch = xyz.next().charAt(0); 
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
        {
            System.out.printf("%c is Vowel", ch);
        } 

        else
        {
            System.out.printf("%c is Consonant", ch);
        }
    }
}
