import java.util.*;

class ArrOp 
{
    int a[];

    ArrOp(int a[]) 
	{
        this.a = a;
    }

    void FindSecSmall(int k) 
	{
        
        for (int i = 0; i < a.length - 1; i++) 
		{
            for (int j = i + 1; j < a.length; j++) 
			{
                if (a[i] > a[j]) 
				{
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        
        if (k > 0 && k <= a.length) 
		{
            System.out.printf("%d is the %d-th smallest number\n", a[k - 1], k);
        } 
		else 
		{
            System.out.println("Invalid value for k");
        }
    }
}

public class FindSecondSmall 
{
    public static void main(String x[]) 
	{
        Scanner xyz = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = xyz.nextInt();
        int a[] = new int[n];

        System.out.print("Enter the array elements: ");
        for (int i = 0; i < a.length; i++) 
		{
            a[i] = xyz.nextInt();
        }

        System.out.print("Enter the value of k: ");
        int k = xyz.nextInt();

        ArrOp ap = new ArrOp(a);
        ap.FindSecSmall(k);
    }
}
