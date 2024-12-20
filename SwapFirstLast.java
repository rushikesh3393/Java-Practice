import java.util.*;
public class SwapFirstLast 
{
    public static void main(String x[])
 {
        int no, last, first, p, p1, count = 0, temp;
        Scanner xyz = new Scanner(System.in);

        System.out.println("\nEnter number from keyboard:");
        no = xyz.nextInt();

        temp = no;

        System.out.println("\nBefore swapping digit: " + no);            

        while (no != 0) 
        {
            no = no / 10;                                                
            ++count;
        }
        no = temp;
        p = 1;
        for (int i = 0; i < count - 1; i++)
        {
            p = p*10;                                                     
        }

        last = no % 10;        
        first = no / p;        
        no = no / 10;          
        p1 = 1;
        for (int i = 0; i < count - 1; i++)
        {
            p1 = p1*10;          
        }
        
        no = no % p1;             
        last = last * p;         
        no = no * 10;            
        no = no + first;          

        System.out.println("\nAfter swapping Digit: " + no);
    }
}