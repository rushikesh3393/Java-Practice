import java.util.*;
public class PhoneBillApp
{

  public static void main(String x[])
  {
    Scanner xyz=new Scanner(System.in);
    float bill;
  
     System.out.printf("Enter the number of calls");
     int call=xyz.nextInt();

     if(call>=0 && call<=100)
        { bill=200;
          System.out.printf("The Bill is:%d",bill);
        }

     if(call>100 && call<=150)
        { bill=call*0.60f;
          System.out.printf("The Bill is:%f",bill);
        }

     if(call>150 && call<=200)
        { bill=call*0.50f;
          System.out.printf("The Bill is:%f",bill);
        }

    if(call>200 && call<=250)
        { bill=call*0.40f;
          System.out.printf("The Bill is:%f",bill);
        }
  
    else
        { bill=call*0.35f;
          System.out.printf("The Bill is:%f",bill);
        }
    }
}

     

