import java.util.*;
public class TwoArrayEqualOrNot
{
    public static void main(String x[])
    {
	 int a[][]=new int[3][3];
         int b[][]=new int[3][3];
      
         int i,j;
	 Scanner xyz = new Scanner(System.in);

	 System.out.println("Enter values in first matrix");
	 for( i=0; i<a.length;i++)
	 {
	   for( j=0;j<a[i].length; j++)
	   {
		a[i][j]=xyz.nextInt();
	   }
	 }   
	 System.out.println("Display array valuesin First Matrix Are");
	 for( i=0; i<a.length; i++)
	 {
	   for( j=0;j<a[i].length;j++)
	   {
		 System.out.printf("%d\t",a[i][j]);
	   }
	    System.out.printf("\n");
	}

         System.out.println("Enter values in Second matrix");
	 for( i=0; i<b.length;i++)
	 {
	   for( j=0;j<a[i].length; j++)
	   {
		b[i][j]=xyz.nextInt();
	   }
	 }   
	 System.out.println("Display array valuesin Second Matrix Are");
	 for( i=0; i<b.length; i++)
	 {
	   for( j=0;j<a[i].length;j++)
	   {
		 System.out.printf("%d\t",b[i][j]);
	   }
	    System.out.printf("\n");
	}
        
        boolean flag=false;
        for(i=0;i<a.length;i++)
         { 
           for(j=0;j<a.length;j++)
           {
             if(a[i][j]==b[i][j]){
             flag=true;}
           }
         }
        if(flag)
           {
             System.out.println("The Two matrices Are Equal");
           }
       else
           {
             System.out.println("The Two matrices Are not Equal");
           }
     }
}
