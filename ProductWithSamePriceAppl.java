import java.util.*;

class Product {
    private int id;
    private String name;
    private int price;

    public void setId(int Id) {
        id = Id;
    }

    public int getId() {
        return id;
    }

    public void setName(String Name) {
        name = Name;
    }

    public String getName() {
        return name;
    }

    public void setPrice(int Price) {
        price = Price;
    }

    public int getPrice() {
        return price;
    }
}

public class ProductWithSamePriceAppl {
    public static void main(String x[]) {
        Product p[] = new Product[5];
        Scanner xyz = new Scanner(System.in);
        boolean ans = false;
        for (int i = 0; i < p.length; i++) {
            p[i] = new Product();

            System.out.println("Enter the Id, Name, and Price of Product");
            int Id = xyz.nextInt();
            xyz.nextLine(); // Consume newline character
            String Name = xyz.nextLine();
            int Price = xyz.nextInt();

            p[i].setId(Id);
            p[i].setName(Name);
            p[i].setPrice(Price);
        }

        for (int i = 0; i < p.length; i++)
           {
            for (int j = i + 1; j < p.length; j++)
               {
                if (p[i].getPrice() == p[j].getPrice())
                {
                    System.out.printf("\nThe products with the same price are %s and %s", p[i].getName(), p[j].getName());
                    ans = true;
                }
            }
        }

        if (!ans) {
            System.out.println("No products with the same price found.");
        }
    }
}
