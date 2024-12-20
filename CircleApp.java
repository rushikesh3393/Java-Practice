public class CircleApp 
{
    public static void main(String x[]) 
{
        float radius = Float.parseFloat(x[0]);

        float diameter = 2 * radius;
        float circumference = 2 * 3.14f * radius; 
        float area = 3.14f * radius * radius; 

        System.out.printf("The diameter, circumference, area of circle is %f %f %f:", diameter, circumference, area);
    }
}
