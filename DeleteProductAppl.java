import java.util.*;
class Product
{
  private int id;
  private String name;
  private int price;

  public void setId(int Id)
   {
     id=Id;
   }
  public int getId()
   {
     return id;
   }

  public void setName(String Name)
   {
     name=Name;
   }
  public String getName()
   {
     return name;
   }

  public void setPrice(int Price)
   {
     price=Price;
   }
  public int getPrice()
   {
     return price;
   }
}


public class DeleteProductAppl
{
  public static void main(String x[])
   {
     Product p[]=new Product[5];
     Scanner xyz=new Scanner(System.in);
     int count=0;
     for(int i=0;i<p.length;i++)
       {
         p[i]=new Product();
         
         System.out.println("Enter the Id,Name and Price of Product");
         int Id=xyz.nextInt();
         xyz.nextLine();
         String Name=xyz.nextLine();
         int Price=xyz.nextInt();

         p[i].setId(Id);
         p[i].setName(Name);
         p[i].setPrice(Price);
         

       }
  
      System.out.printf("Enter the Product Id That you want to Delete");
      int DeleteId=xyz.nextInt();

      
      for(int i=0;i<p.length;i++)
          {
              for(int j=i;j<p.length-1;j++)
               {
                 if(p[i].getId()==DeleteId)
                   {
                     p[j]=p[j+1];
                     count++;
                   }
               }
           }
        
        int length=p.length-count;
        System.out.println("Display Products After Delete");
        for(int i=0;i<length;i++)
        {
             System.out.printf("\n%d\t%s\t%d\t",p[i].getId(),p[i].getName(),p[i].getPrice());
         }
     }
}
      
     