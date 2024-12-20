/* WAP to create user defined function name as int [] mergeArray (int a[],int b[]) this function can accept two array as input 
and merge them and return third array and function calling point. */

import java.util.Scanner;

public class TestSecTwoOne 
{
    
    public static void main(String[] args)
	{ 
        Scanner xyz = new Scanner(System.in);
        
        System.out.printf("Enter the Size of First array: ");
        int size1 = xyz.nextInt();
        
        System.out.printf("Enter the Size of Second array: ");
        int size2 = xyz.nextInt();
        
        int[] a = new int[size1];
        int[] b = new int[size2];
        
        System.out.printf("Enter the Values in first Array: ");
        for(int i = 0; i < a.length; i++) 
		{
            a[i] = xyz.nextInt();
        }
        
        System.out.printf("Enter the Values in Second Array: ");
        for(int j = 0; j < b.length; j++) 
		{
            b[j] = xyz.nextInt();
        }
        
        int[] c = mergeArray(a, b); 
        
        System.out.printf("\nThe Merged Array is:\n");
        for(int k = 0; k < c.length; k++) 
		{
            System.out.printf("%d \t", c[k]);
        }
    }

    private static int[] mergeArray(int[] aa, int[] bb) 
	{ 
        int size3 = aa.length + bb.length;
        
        int[] cc = new int[size3];
        
        for(int i = 0; i < cc.length; i++) 
		{
            if(i < aa.length) 
			{
                cc[i] = aa[i];
            } 
			else 
			{ 
                cc[i] = bb[i - aa.length];
            }
        }
        return cc;
    }
}


	
	
	
		