import java.util.Scanner;

class Wall 
{
    private double surfaceArea;

    public Wall(double surfaceArea) 
    {
        this.surfaceArea = surfaceArea;
    }

    public double getSurfaceArea() 
    {
        return surfaceArea;
    }
}

class Property {
    private Wall[] interiorWalls;
    private Wall[] exteriorWalls;

    public Property(int numInteriorWalls, int numExteriorWalls) 
    {
        interiorWalls = new Wall[numInteriorWalls];
        exteriorWalls = new Wall[numExteriorWalls];
    }

    public void setInteriorWallSurfaceArea(int index, double surfaceArea) 
    {
        interiorWalls[index] = new Wall(surfaceArea);
    }

    public void setExteriorWallSurfaceArea(int index, double surfaceArea) 
    {
        exteriorWalls[index] = new Wall(surfaceArea);
    }

    public double calculateTotalCost() 
    {
        double totalCost = 0.0;

        for (Wall interiorWall : interiorWalls) 
        {
            if (interiorWall != null) {
                totalCost += interiorWall.getSurfaceArea() * 18; // Interior wall painting cost is Rs. 18 per sq.ft.
            }
        }

        for (Wall exteriorWall : exteriorWalls) {
            if (exteriorWall != null) {
                totalCost += exteriorWall.getSurfaceArea() * 12; // Exterior wall painting cost is Rs. 12 per sq.ft.
            }
        }

        return totalCost;
    }
}

public class InteriorWall
{
    public static void main(String[] args) 
     {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of interior walls:");
        int numInteriorWalls = scanner.nextInt();

        System.out.println("Enter the number of exterior walls:");
        int numExteriorWalls = scanner.nextInt();

        Property property = new Property(numInteriorWalls, numExteriorWalls);

        for (int i = 0; i < numInteriorWalls; i++) {
            System.out.println("Enter the surface area of interior wall " + (i + 1) + " in square feet:");
            double surfaceArea = scanner.nextDouble();
            property.setInteriorWallSurfaceArea(i, surfaceArea);
        }

        for (int i = 0; i < numExteriorWalls; i++) {
            System.out.println("Enter the surface area of exterior wall " + (i + 1) + " in square feet:");
            double surfaceArea = scanner.nextDouble();
            property.setExteriorWallSurfaceArea(i, surfaceArea);
        }

        double totalCost = property.calculateTotalCost();
        System.out.println("Total estimated Cost: " + totalCost + " INR");

        scanner.close();
    }
}
