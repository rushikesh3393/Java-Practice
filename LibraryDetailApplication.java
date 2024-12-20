import java.util.*;

class Library 
{
    private int accessionNumber;
    private String titleBook;
    private String authorName;
    private int priceBook;

    public void setAccessionNo(int ano) 
    {
        accessionNumber = ano;
    }

    public int getAccessionNo() 
    {
        return accessionNumber;
    }

    public void setTitleOfBook(String a) 
    {
        titleBook = a;
    }

    public String getTitleOfBook() 
    {
        return titleBook;
    }

    public void setAuthorName(String b) 
    {
        authorName = b;
    }

    public String getAuthorName() 
    {
        return authorName;
    }

    public void setPriceOfBook(int pb) 
    {
        priceBook = pb;
    }

    public int getPriceOfBook() 
    {
        return priceBook;
    }
}

public class LibraryDetailApplication 
{
    public static void main(String x[]) 
    {
        Scanner scanner = new Scanner(System.in);
        Library lb = new Library();
        int choice;

      do{
        System.out.println("\nMenu:");
        System.out.println("1. Add Book Details");
        System.out.println("2. Display All Book Details");
        System.out.println("3. Display List of all books by a given author");
        System.out.println("4. Display book details by title");
        System.out.println("5. Display total count of books in the library");
        System.out.println("6. Display list of books in ascending order of accession number");
        System.out.println("7. Update book details by title");
        System.out.println("8. Delete book details by price");
        System.out.println("9. Exit");

        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();

        switch (choice) 
          {
            case 1: 
            {
                System.out.print("Enter accession number:");
                int ano = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Enter title: ");
                String a = scanner.nextLine();
                System.out.print("Enter author: ");
                String b = scanner.nextLine();
                System.out.print("Enter price: ");
                int pb = scanner.nextInt();

                lb.setAccessionNo(ano);
                lb.setTitleOfBook(a);
                lb.setAuthorName(b);
                lb.setPriceOfBook(pb);
                break;
            }

            case 2:
            {
                System.out.println("Accession Number: " + lb.getAccessionNo());
                System.out.println("Title: " + lb.getTitleOfBook());
                System.out.println("Author: " + lb.getAuthorName());
                System.out.println("Price: " + lb.getPriceOfBook());
                break;
            }
       
           case 3:
            {
               System.out.printf("Enter the Author name");
               String auth=xyz.nextLine();

               if(strcmp(auth,lb.getAuthorName())==0)
                 {
                     System.out.println("Accession Number: " + lb.getAccessionNo());
                     System.out.println("Title: " + lb.getTitleOfBook());
                     System.out.println("Author: " + lb.getAuthorName());
                     System.out.println("Price: " + lb.getPriceOfBook());
                     
                }
               break;
           }
    }
}
}while(choice!=9);
}
}



