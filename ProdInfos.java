/*WAP to create class name as Product with id name and price and  mark Project as POJO class and create array of object of Product of size 5 and arrange all 
products in descending order price wise.*/

import java.util.*;
class Product
{
  private int id;
  private String name;
  private int price;
  
  public void setid(int id)
   {
     this.id=id;
   }
  public int getid()
   {
     return id;
   }
   
   
   public void setname(String name)
   {
     this.name=name;
   }
  public String getname()
   {
     return name;
   }
   
   
   public void setprice(int price)
   {
     this.price=price;
   }
  public int getprice()
   {
     return price;
   }
 }
 
 
 public class ProdInfos
 {
    public static void main(String x[])
     {
	    Product p[]=new Product[5];
		for(int i=0;i<p.length;i++)
		 {
		   p[i]=new Product();
		   
		   Scanner xyz=new Scanner (System.in);
		   System.out.printf("Enter id,Name,price");
		   
		   int id=xyz.nextInt();
		   xyz.nextLine();
		   String name=xyz.nextLine();
		   int price=xyz.nextInt();
		   
		   p[i].setid(id);
		   p[i].setname(name);
		   p[i].setprice(price);
		   
		   
		 }
		 
		 
		 
		 for(int i=0;i<p.length;i++)
		 {
			 for(int j=i+1;j<p.length;j++)
			 {
				  if(p[i].getprice() > p[j].getprice())
				  {
					 Product temp =p[i];
					  p[i]=p[j];
					  p[j]=temp;
				  }
		     }
		 }
		 for(int i=0;i<p.length;i++)
		 {
		    System.out.printf("Id:-%d \t Name:-%s \t Price:-%d \n",p[i].getid(),p[i].getname(),p[i].getprice());
	     }
      }
}
    