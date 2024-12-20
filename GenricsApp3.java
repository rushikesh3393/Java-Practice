import java.util.*;

public class GenricsApp3 {

    public static void main(String[] args) {
        ArrayList<Object> al = new ArrayList<>();
        
        al.add(100);
        al.add(5.5f);
        al.add(new Date());
        al.add("Rushikesh");
        al.add(444);

        System.out.println(findIndex(al, 100));  // Should print 0
        System.out.println(findIndex(al, 5.5f)); // Should print 1
        System.out.println(findIndex(al, "Rushikesh")); // Should print 3
        System.out.println(findIndex(al, "Not Found")); // Should print -1
    }

    public static <T> int findIndex(List<T> list, T target) {
        if (list == null || target == null) {
            throw new IllegalArgumentException("List and target cannot be null");
        }
        return list.indexOf(target);
    }
}

	
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
/*  import java.util.List;

public class GenericListSearcher {

    public static <T> int findIndex(List<T> list, T target) {
        if (list == null || target == null) {
            return -1;
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(target)) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        // Example usage
        List<String> stringList = List.of("apple", "banana", "cherry", "date");
        System.out.println(findIndex(stringList, "banana")); // Output: 1
        System.out.println(findIndex(stringList, "grape"));  // Output: -1

        List<Integer> intList = List.of(1, 2, 3, 4, 5);
        System.out.println(findIndex(intList, 3));           // Output: 2
        System.out.println(findIndex(intList, 6));           // Output: -1
    }
}*/