import java.util.*;
public class FindAllPrimeFactor
{
 public static void main(String x[])
  {
    int num,i,j,count=0;

    Scanner xyz=new Scanner(System.in);
    System.out.println("Enter the Number");
    num=xyz.nextInt();

    System.out.printf("Prime Factor of %d are:",num);
    for(i=2;i<num;i++)
      {
         count=0;
         if(num%i==0)
            {
              for(j=1;j<=i;j++)
                  {
                    if(i%j==0)
                      {
                        count++;
                       }
                   }
               if(count==2)
                 {
                   System.out.printf("%d\t",i);
                 }
            }
       }
    }
}