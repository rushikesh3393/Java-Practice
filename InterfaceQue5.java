import java.util.*;

interface ArrayOperation {
   void performOperation(int x[]);
}

class Sorting implements ArrayOperation {
   public void performOperation(int x[]) {
      int a[] = x;
      
      for (int i = 0; i < a.length; i++) {
         for (int j = i + 1; j < a.length; j++) {
            if (a[i] > a[j]) {
               int temp = a[i];
               a[i] = a[j];
               a[j] = temp;
            }
         }
      }
      
      System.out.println("\nArray after sorting:");
      for (int i = 0; i < a.length; i++) {
          System.out.printf("%d \t", a[i]);
      }
   }
}

class Insertion implements ArrayOperation {
   int no, ind;
   int b[];
   
   void setValue(int no, int ind) {
      this.no = no;
      this.ind = ind;
   }
   
   public void performOperation(int x[]) {
      b = x;
      
      System.arraycopy(b, ind, b, ind + 1, b.length - ind - 1);
      b[ind] = no;
      
      System.out.println("\nArray after insertion:");
      for (int i = 0; i < b.length; i++) {
          System.out.printf("%d \t", b[i]);
      }
   }
}

class Deletion implements ArrayOperation {
   int ind;
   
   void setIndex(int index) {
      ind = index;
   }
   
   public void performOperation(int x[]) {
      int[] c = x.clone();
      
      System.arraycopy(c, ind + 1, c, ind, c.length - ind - 1);
      
      System.out.println("Array after deletion:");
      for (int i = 0; i < c.length - 1; i++) {
          System.out.printf("%d \t", c[i]);
      }
   }
}

class Reverse implements ArrayOperation {
   public void performOperation(int x[]) {
      int d[] = x.clone();
      
      int start = 0;
      int end = d.length - 1;
      
      while (start < end) {
         int temp = d[start];
         d[start] = d[end];
         d[end] = temp;
         
         start++;
         end--;
      }
      
      System.out.println("\nArray after reversing:");
      for (int i = 0; i < d.length; i++) {
          System.out.printf("%d \t", d[i]);
      }
   }
}

public class InterfaceQue5 {
   public static void main(String args[]) {
      Scanner xyz = new Scanner(System.in);
      int a[] = new int[5];
      
      System.out.print("Enter the Array Elements: ");
      for (int i = 0; i < a.length; i++) {
         a[i] = xyz.nextInt();
      }
      
      ArrayOperation ap;
      
      ap = new Sorting();
      ap.performOperation(a);
      
      Insertion insertion = new Insertion();
      insertion.setValue(2, 3); 
      insertion.performOperation(a);
      
      Deletion deletion = new Deletion();
      deletion.setIndex(2); 
      deletion.performOperation(a);
      
      ap = new Reverse();
      ap.performOperation(a);
   }
}
