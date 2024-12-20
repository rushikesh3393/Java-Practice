import java.util.*;

class ArrOp1 
{
    private int a[];

    ArrOp1(int a[]) 
	{
        this.a = a;
    }

    void FindRev() 
	{
        for (int i = 0; i < a.length / 2; i++) 
		{
            int temp = a[a.length - 1 - i];
            a[a.length - 1 - i] = a[i];
            a[i] = temp;
        }

        System.out.print("The Reverse Array is: ");
        for (int i = 0; i < a.length; i++) 
		{
            System.out.print(a[i] + "\t");
        }
        System.out.println();
    }
}

public class FindRevTest 
{
    public static void main(String x[]) 
	{
        Scanner xyz = new Scanner(System.in);

        int a[] = new int[5];

        System.out.println("Enter the Array Elements:");
        for (int i = 0; i < a.length; i++) 
		{
            a[i] = xyz.nextInt();
        }

        ArrOp1 ap = new ArrOp1(a);
        ap.FindRev();
    }
}
