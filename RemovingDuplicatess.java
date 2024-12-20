import java.util.*;

class RemoveDuplicate {
    int[] a = new int[8];

    void setArray(int arr[]) {
        a = arr;
    }

    int[] getUniqueArray() {
        int length = a.length;
        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (a[i] == a[j]) {
                    
                    for (int k = j; k < length - 1; k++) {
                        a[k] = a[k + 1];
                    }
                   
                    length--;
                    j--;
                }
            }
        }
        
        int[] uniqueArray = new int[length];
        for(int i=0;i<length;i++)
          {
             uniqueArray[i]=a[i];
          }
        return uniqueArray;
    }
}

public class RemovingDuplicatess {
    public static void main(String x[]) {
        Scanner xyz = new Scanner(System.in);
        int arr[] = new int[8];

        System.out.println("Enter the Array Elements:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = xyz.nextInt();
        }

        RemoveDuplicate rd = new RemoveDuplicate();
        rd.setArray(arr);
        arr = rd.getUniqueArray();

        System.out.println("Array without duplicates:");
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d \t", arr[i]);
        }
    }
}
