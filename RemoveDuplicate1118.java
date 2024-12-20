/* Write program to create class name as RemoveDuplicate with two functions 
void setArray(int a[]): this function can accept array as parameter
 int [] getSortArray(): this function can perform Remove the duplicate element form array 
                        and displary in remening element and return array
 */
 import java.util.Scanner;

class RemoveDuplicate 
{
    int a[];
    int c[];
    int count;

    void setArray(int a[]) 
	{
        this.a = a;
    }

    int[] getSortArray() {
    // Mark duplicates as -1
    for (int i = 0; i < a.length; i++) {
        for (int j = i + 1; j < a.length; j++) {
            if (a[i] == a[j]) {
                a[j] = -1; // Mark as duplicate
                count++; // Increment count of duplicates
            }
        }
    }

    // Calculate the new array size excluding duplicates
    int newSize = a.length - count;

    // Create a new array of the correct size
    c = new int[newSize];

    // Copy valid elements to the new array
    int k = 0;
    for (int i = 0; i < a.length; i++) {
        if (a[i] != -1) { // Check if it's not marked as duplicate
            c[k++] = a[i]; // Copy to the new array
        }
    }

    return c;
}

}

public class RemoveDuplicate1118 
{
    public static void main(String x[]) 
	{
        Scanner xyz = new Scanner(System.in);

        int a[] = new int[6];
        System.out.printf("Enter the Array Elements\n");
        for (int i = 0; i < a.length; i++) 
		{
            a[i] = xyz.nextInt();
        }

        RemoveDuplicate rd = new RemoveDuplicate();

        rd.setArray(a);

        int b[] = rd.getSortArray();

        System.out.printf("The Sorted Array Is:\n");
        for (int i = 0; i < b.length; i++) 
		{
            System.out.printf("%d\t", b[i]);
        }
    }
}
