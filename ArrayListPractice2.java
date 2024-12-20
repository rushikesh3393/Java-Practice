import java.util.*;
public class ArrayListPractice2
{
	public static void main(String x[])
	{
		ArrayList al=new ArrayList();
		
		do
		{
			Scanner xyz=new Scanner(System.in);
			
		    System.out.printf("1.Add Elements");
		    System.out.printf("2.Display All Elements");
		    System.out.printf("3.Delete Element");
		    System.out.printf("4.Insert Element At Specific index");
		    System.out.printf("5.Insert Element At First Position");
		    System.out.printf("6.Update Element At Specific Index");
			
			System.out.printf("Enter the Choice");
			int choice=xyz.nextInt();
			
			switch(choice)
			{
				case 1:{
					     System.out.printf("Enter the Element");
						 int ele=xyz.nextInt();
						 al.add(ele);
						 break;
				       }
				case 2:{
					     System.out.printf("All Elements Are:\n");
						 for(Object obj:al)
						 {
							 System.out.println(obj);
						 }
						 break;
				       }
				case 3:{
					     System.out.printf("Enter the Element that you want to delete");
						 int del=xyz.nextInt();
						 
						 int index=al.indexOf(del);
			              if(index!=-1)
				            { al.remove(index);
				            }
				          else{
				             System.out.println("element not found");
				            }
                          break;
				       }
                case 4:{
					     System.out.printf("Enter the Element");
						 int elem=xyz.nextInt();
						 
						 System.out.printf("Enter the Index");
						 int ind=xyz.nextInt();
						 
						 al.add(ind,elem);
						 break;
				       }
                case 5:{
					     System.out.printf("Enter the Element");
						 int elem=xyz.nextInt();
						 
						 al.add(0,elem);
						 break;
				       }	
                case 6:{
					     System.out.printf("Enter the Element");
						 int elemt=xyz.nextInt();
						 
						 System.out.printf("Enter the Index");
						 int indx=xyz.nextInt();
						 
						 al.set(indx,elemt);
						 break;
				       }
			    default:
				           System.out.printf("Invalid choice");
						   
			}
        }while(true);
	}
}	

				       
		
		
		
			