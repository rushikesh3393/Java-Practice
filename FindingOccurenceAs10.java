import java.util.*;
class Occurence
{
  int count=0;
  int a[]=new int[8];  

  void setArray(int arr[])
  {
     a=arr;
  }

  void getOccurrence()
  {
    for (int i = 0; i < a.length; i++)
     {
        if (a[i] > 0) 
         {
            count = 1; 
            for (int j = i + 1; j < a.length; j++) 
            {
                if (a[i] == a[j]) 
                {
                    count++;
                    a[j] = -1; 
                }
            }
            System.out.printf("\nThe Occurrence of %d is %d", a[i], count);
        }
      }
   }



}

public class FindingOccurenceAs10
{
   public static void main(String x[])
     {
        Scanner xyz=new Scanner(System.in);
        int arr[]=new int[8];

        System.out.println("Enter the Elements");
        for(int i=0;i<arr.length;i++)
         {
           arr[i]=xyz.nextInt();
         }
        
         Occurence oc=new Occurence();
         oc.setArray(arr);
         oc.getOccurrence();
     }
}